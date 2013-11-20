
public class Fahrzeug {
	private String bezeichnung;
	private int idNummer;
	private double maxSpeed;

	public Fahrzeug(){
       bezeichnung= "Fahrzeug";
       idNummer= 0;
       maxSpeed= 50;
	}

	public Fahrzeug(String b, int iN, double mS){
		bezeichnung= b;
		idNummer= iN;
		maxSpeed= mS;
	}

	public Fahrzeug(Fahrzeug f){
		bezeichnung= f.getBezeichnung();
		idNummer= f.getIdNummer();
	    maxSpeed= f.getMaxSpeed();
	}

	public boolean equals(Fahrzeug f){
		if (f.maxSpeed == maxSpeed && f.idNummer == idNummer){
			return true;
		} else {
			return false;
		}
	}


	public void printInfo() {
		System.out.println(bezeichnung +" hat die Id: "+ idNummer);
	}

	public double getTime(double dist){
		return dist/this.maxSpeed;
	}

	public String getBezeichnung() {
		return bezeichnung;
	}

	public void setBezeichnung(String bezeichnung) {
		this.bezeichnung = bezeichnung;
	}

	public int getIdNummer() {
		return idNummer;
	}

	public void setIdNummer(int idNummer) {
		this.idNummer = idNummer;
	}

	public double getMaxSpeed() {
		return maxSpeed;
	}

	public void setMaxSpeed(double maxSpeed) {
		this.maxSpeed = maxSpeed;
	}
}
