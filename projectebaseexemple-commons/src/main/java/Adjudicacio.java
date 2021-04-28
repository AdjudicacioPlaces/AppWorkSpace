

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Adjudicacio
 */
@WebServlet("/Adjudicacio")
public class Adjudicacio extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private ArrayList<Plaza> llistaPlaces = new ArrayList<>();
	
	public void createData() {
		llistaPlaces.add(new Plaza("09-04-2021 00:00","IES Ses Estacions",388,false,false,"12-04-2021","Baixa","Mallorca","Palma"));
		llistaPlaces.get(0).setNom("Mas Prohens, Maria Antonia");
		llistaPlaces.add(new Plaza("12-04-2021 12:00","IES Mossèn Alcover",402,true,true,"14-04-2021","Maternitat","Mallorca","Manacor"));
		llistaPlaces.get(1).setNom("Bauza Garcia, Albert");
		llistaPlaces.add(new Plaza("24-04-2021 09:00","IES Sant Ferràn De Ses Roques",500,false,true,"28-04-2021","Excedència","Formentera","Sant Josep"));
		llistaPlaces.get(2).setNom("Riera Bosch, Bàrbara");
		llistaPlaces.add(new Plaza("01-05-2021 08:00","IES Santa Eulària",392,true,false,"05-05-2021","Baixa","Eivissa","Santa Eulària"));
		llistaPlaces.get(3).setDataAnulacio("06-05-2021");
		llistaPlaces.get(3).setMotiuAnulacio("Falta de fons");
		llistaPlaces.add(new Plaza("05-05-2021 13:00","CIFP Francesc De Borja Moll",201,true,true,"07-05-2021","Baixa","Mallorca","Palma"));
		llistaPlaces.get(3).setDataAnulacio("10-05-2021");
		llistaPlaces.get(3).setMotiuAnulacio("Finalització baixa");
		llistaPlaces.add(new Plaza("08-04-2021 00:00","IES Llorenç Garcies i Pons",377,false,false,"10-04-2021","Maternitat","Menorca","Maó"));
		llistaPlaces.get(3).setDataAnulacio("10-04-2021");
		llistaPlaces.get(3).setMotiuAnulacio("Falta de fons");
		llistaPlaces.add(new Plaza("10-04-2021 20:00","IES Bartomeu Porcel",360,false,false,"25-05-2021","Maternitat","Eivissa","Sant Carles des Puig"));
		llistaPlaces.add(new Plaza("09-04-2021 00:00","IES Compte de Sallent",432,true,false,"10-04-2021","Excedència","Menorca","Ciutadella"));
		llistaPlaces.add(new Plaza("24-04-2021 09:00","IES Pilar Juncosa",911,false,true,"30-04-2021","Excedència","Formentera","Sant Jordi"));
	}
	
	public ArrayList<Plaza> getAdjudgedPlaces(){
		ArrayList<Plaza> array = new ArrayList<>();
		for(Plaza plaza:llistaPlaces) {
			if(!plaza.getNom().equals("")) {
				array.add(plaza);
			}
		}
		return array;
	}
	
	public ArrayList<Plaza> getCanceledPlaces(){
		ArrayList<Plaza> array = new ArrayList<>();
		for(Plaza plaza:llistaPlaces) {
			if(!plaza.getDataAnulacio().equals("")) {
				array.add(plaza);
			}
		}
		return array;
	}

    /**
     * Default constructor. 
     */
    public Adjudicacio() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

	class Plaza{
		
		private int id;
		private String dataAdjudicacio;
		private String llocsTreball;
		private int convocatoria;
		private boolean mitjaJornada;
		private boolean itinerant;
		private String dataInici;
		private String dataFiPrevista;
		private String motiu;
		private String illa;
		private String municipi;
		private String nom;
		private String dataAnulacio;
		private String motiuAnulacio;
		
		
		
		public String getDataAdjudicacio() {
			return dataAdjudicacio;
		}



		public void setDataAdjudicacio(String dataAdjudicacio) {
			this.dataAdjudicacio = dataAdjudicacio;
		}



		public String getLlocsTreball() {
			return llocsTreball;
		}



		public void setLlocsTreball(String llocsTreball) {
			this.llocsTreball = llocsTreball;
		}



		public int getConvocatoria() {
			return convocatoria;
		}



		public void setConvocatoria(int convocatoria) {
			this.convocatoria = convocatoria;
		}



		public boolean isMitjaJornada() {
			return mitjaJornada;
		}



		public void setMitjaJornada(boolean mitjaJornada) {
			this.mitjaJornada = mitjaJornada;
		}



		public boolean isItinerant() {
			return itinerant;
		}



		public void setItinerant(boolean itinerant) {
			this.itinerant = itinerant;
		}



		public String getDataInici() {
			return dataInici;
		}



		public void setDataInici(String dataInici) {
			this.dataInici = dataInici;
		}



		public String getDataFiPrevista() {
			return dataFiPrevista;
		}



		public void setDataFiPrevista(String dataFiPrevista) {
			this.dataFiPrevista = dataFiPrevista;
		}



		public String getMotiu() {
			return motiu;
		}



		public void setMotiu(String motiu) {
			this.motiu = motiu;
		}



		public String getIlla() {
			return illa;
		}



		public void setIlla(String illa) {
			this.illa = illa;
		}



		public String getMunicipi() {
			return municipi;
		}



		public void setMunicipi(String municipi) {
			this.municipi = municipi;
		}



		public String getNom() {
			return nom;
		}



		public void setNom(String nom) {
			this.nom = nom;
		}



		public String getDataAnulacio() {
			return dataAnulacio;
		}



		public void setDataAnulacio(String dataAnulacio) {
			this.dataAnulacio = dataAnulacio;
		}



		public String getMotiuAnulacio() {
			return motiuAnulacio;
		}



		public void setMotiuAnulacio(String motiuAnulacio) {
			this.motiuAnulacio = motiuAnulacio;
		}



		public Plaza(String dataAdjudicacio, String llocsTreball, int convocatoria, boolean mitjaJornada,
				boolean itinerant, String dataInici, String motiu, String illa, String municipi) {
			super();
			this.id+=1;
			this.dataAdjudicacio = dataAdjudicacio;
			this.llocsTreball = llocsTreball;
			this.convocatoria = convocatoria;
			this.mitjaJornada = mitjaJornada;
			this.itinerant = itinerant;
			this.dataInici = dataInici;
			this.motiu = motiu;
			this.illa = illa;
			this.municipi = municipi;
		}
		
	}
}
