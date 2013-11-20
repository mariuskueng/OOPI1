package tutorial_5;

public class Flugzeug {
	String bezeichnung = "";
	int idNummer = 0;
	int sitze = 0;
	double geschwindigkeit = 0;
	double reichweite = 0;


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
}
