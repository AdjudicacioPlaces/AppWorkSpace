package es.caib.projectebaseexemple.ejb.facade;

import es.caib.projectebaseexemple.commons.utils.Constants;
import es.caib.projectebaseexemple.ejb.converter.UnitatOrganicaConverter;
import es.caib.projectebaseexemple.ejb.interceptor.ExceptionTranslate;
import es.caib.projectebaseexemple.ejb.interceptor.Logged;
import es.caib.projectebaseexemple.ejb.repository.ProcedimentRepository;
import es.caib.projectebaseexemple.ejb.repository.UnitatOrganicaRepository;
import es.caib.projectebaseexemple.persistence.model.UnitatOrganica;
import es.caib.projectebaseexemple.service.exception.RecursNoTrobatException;
import es.caib.projectebaseexemple.service.exception.UnitatDuplicadaException;
import es.caib.projectebaseexemple.service.exception.UnitatTeProcedimentsException;
import es.caib.projectebaseexemple.service.facade.UnitatOrganicaServiceFacade;
import es.caib.projectebaseexemple.service.model.AtributUnitat;
import es.caib.projectebaseexemple.service.model.Ordre;
import es.caib.projectebaseexemple.service.model.Pagina;
import es.caib.projectebaseexemple.service.model.UnitatOrganicaDTO;

import javax.annotation.security.PermitAll;
import javax.annotation.security.RolesAllowed;
import javax.ejb.Local;
import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;
import javax.inject.Inject;
import java.util.List;
import java.util.Map;
import java.util.Optional;

/**
 * Implementació dels casos d'ús de manteniment de Unitats Orgàniques.
 * És responsabilitat d'aquesta capa definir el limit de les transaccions i la seguretat.
 * Les excepcions específiques es llancen mitjançant l'{@link ExceptionTranslate} que transforma
 * els errors JPA amb les excepcions de servei com la {@link RecursNoTrobatException}
 * @author areus
 */
@Logged
@ExceptionTranslate
@Stateless @Local(UnitatOrganicaServiceFacade.class)
@TransactionAttribute(TransactionAttributeType.REQUIRES_NEW)
public class UnitatOrganicaServiceFacadeBean implements UnitatOrganicaServiceFacade {

    @Inject
    private UnitatOrganicaRepository repository;

    @Inject
    private ProcedimentRepository procedimentRepository;

    @Inject
    private UnitatOrganicaConverter converter;

    @Override
    @RolesAllowed(Constants.PBE_ADMIN)
    public Long create(UnitatOrganicaDTO dto) throws UnitatDuplicadaException {
        if (repository.findByCodiDir3(dto.getCodiDir3()).isPresent()) {
            throw new UnitatDuplicadaException(dto.getCodiDir3());
        }

        UnitatOrganica unitat = converter.toEntity(dto);
        repository.create(unitat);
        return unitat.getId();
    }

    @Override
    @RolesAllowed(Constants.PBE_ADMIN)
    public void update(UnitatOrganicaDTO dto) throws RecursNoTrobatException {
        UnitatOrganica unitat = repository.getReference(dto.getId());
        converter.updateFromDTO(unitat, dto);
    }

    @Override
    @RolesAllowed(Constants.PBE_ADMIN)
    public void delete(Long id) throws UnitatTeProcedimentsException, RecursNoTrobatException {
        if (procedimentRepository.countByUnitat(id) > 0L) {
            throw new UnitatTeProcedimentsException(id);
        }
        UnitatOrganica unitat = repository.getReference(id);
        repository.delete(unitat);
    }

    @Override
    @RolesAllowed({Constants.PBE_USER, Constants.PBE_ADMIN})
    public Optional<UnitatOrganicaDTO> findById(Long id) {
        UnitatOrganica unitat = repository.findById(id);
        UnitatOrganicaDTO unitatOrganicaDTO = converter.toDTO(unitat);
        return Optional.ofNullable(unitatOrganicaDTO);
    }

    @Override
    @PermitAll
    public Pagina<UnitatOrganicaDTO> findFiltered(int firstResult, int maxResult, Map<AtributUnitat, Object> filter,
                                                  List<Ordre<AtributUnitat>> ordenacio) {

        List<UnitatOrganicaDTO> items = repository.findPagedByFilterAndOrder(firstResult, maxResult, filter, ordenacio);
        long total = repository.countByFilter(filter);

        return new Pagina<>(items, total);
    }
}
