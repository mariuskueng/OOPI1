
public class Flugzeug {
	private String bezeichnung = "";
	private int idNummer = 0;
	private int sitze = 0;
	private double geschwindigkeit = 0;
	private double reichweite = 0;
	
	
	public Flugzeug(){
	    bezeichnung = "Flugzeug";
	    idNummer = 1;
	    sitze= 100;
	    geschwindigkeit =100;
	    reichweite =100;
	}
	
	public Flugzeug(String bezeichnung, int idNummer, int sitze,
            double geschwindigkeit, double reichweite){
		this.bezeichnung = bezeichnung;
		this.idNummer = idNummer;
		this.sitze= sitze;
		this.geschwindigkeit =geschwindigkeit;
		this.reichweite =reichweite;
	}
	
	public Flugzeug(Flugzeug f){
	    this.bezeichnung = f.getBezeichnung();
	    this.idNummer = f.getIdNummer();
	    this.sitze= f.getSitze();
	    this.geschwindigkeit = f.getGeschwindigkeit();
	    this.reichweite = f.getReichweite();
	}
	
	public boolean equals(Flugzeug f){
		if(this.getSitze() == f.getSitze()){
			return true;
		}
		return false;
	}
	
	public void printInfo(){
		System.out.println(bezeichnung + ": " + sitze + " Sitze "+
				geschwindigkeit + " km/h / " + reichweite + " km");
	}
	
	public double getTime(double distanz){
		double time = distanz/geschwindigkeit;
		return Math.round(time*10)/10.;
	}
	
	public int getCapacity(){
		return sitze * 365;
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

	public int getSitze() {
		return sitze;
	}

	public void setSitze(int sitze) {
		if(sitze < 0){
			this.sitze = 0;
		}
		else{
			this.sitze = sitze;
		}
	}

	public double getGeschwindigkeit() {
		return geschwindigkeit;
	}

	public void setGeschwindigkeit(double geschwindigkeit) {
		if(geschwindigkeit < 0){
			this.geschwindigkeit = 0;
		}
		else{
			this.geschwindigkeit = geschwindigkeit;
		}
	}

	public double getReichweite() {
		return reichweite;
	}

	public void setReichweite(double reichweite) {
		if(reichweite < 0){
			reichweite = 0;
		}
		else{
			this.reichweite = reichweite;
		}
	}
	
}
