package es.caib.projectebaseexemple.commons.rest;

/**
 * Constants emprades a l'API REST
 *
 * @author areus
 */
public interface RestConstants {

    /**
     * Propietat del request per emmagatzemar el locale actual de la petició.
     */
    String REQUEST_LOCALE = "es.caib.projectebaseexemple.commons.rest.requestLocale";

    /**
     * Paràmetre del context definit al web.xml amb la llista de locales soportats.
     */
    String SUPPORTED_LOCALES = "es.caib.projectebaseexemple.commons.rest.supportedLocales";
}
