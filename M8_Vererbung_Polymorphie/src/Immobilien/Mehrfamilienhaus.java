package Immobilien;

public class Mehrfamilienhaus extends Wohnhaus {
	private int graten;

	public Mehrfamilienhaus(String b, int jahr, double wert, int w, int g) {
		super(b, jahr, wert, w);
		this.graten = g;
	}
	
	public void print(){
    	System.out.print("Das Mehrfamilienhaus von "+this.getBesitzer()+" aus dem Jahr ");
    	System.out.print(this.getBaujahr()+" ist "+this.getPreis()+" Franken wert ");
    	System.out.println("und hat "+this.graten+" Graten.");
    }

}
