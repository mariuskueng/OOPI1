
public class Flugzeug {
	private String bezeichnung = "";
	private int idNummer = 0;
	private int sitze = 0;
	private double geschwindigkeit = 0;
	private double reichweite = 0;
	
	public static int counter;
	
	
	public Flugzeug(){
		// Allgemeiner Konstruktor für ein leeres Flugzeug
		counter++;
		idNummer = counter;
	    bezeichnung = "Flugzeug";
	    sitze= 100;
	    geschwindigkeit =100;
	    reichweite =100;
	}
	
	public Flugzeug(String bezeichnung, int sitze,
            double geschwindigkeit, double reichweite){
		// Konstruktor für direkte Parameterübergabe
		counter++;
		this.idNummer = counter;
		this.bezeichnung = bezeichnung;
		this.sitze= sitze;
		this.geschwindigkeit =geschwindigkeit;
		this.reichweite =reichweite;
	}
	
	public Flugzeug(Flugzeug f){
		//Kopier-Konstruktor
		counter++;
		this.idNummer = counter;
	    this.bezeichnung = f.getBezeichnung();
	    this.sitze= f.getSitze();
	    this.geschwindigkeit = f.getGeschwindigkeit();
	    this.reichweite = f.getReichweite();
	}
	
	public boolean equals(Flugzeug f){
		//Ist ein Flugzeug vergleichbar nach gewissen Kriterien
		if(this.getSitze() == f.getSitze() && this.geschwindigkeit == f.geschwindigkeit && this.reichweite == f.reichweite){
			return true;
		}
		return false;
	}
	
	public void printInfo(){
		System.out.println(bezeichnung + "("+this.idNummer+"): " + sitze + " Sitze "+
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
	
	public static int getCounter(){
		return counter;
	}
	
}
