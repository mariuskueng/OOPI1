package Immobilien;

public class Einfamilienhaus extends Wohnhaus {
	private int parkplaetze;

	public Einfamilienhaus(String b, int jahr, double wert, int w, int p) {
		super(b, jahr, wert, w);
		this.parkplaetze = p;
		
	}
	
	public void print(){
    	System.out.print("Das Einfamilienhaus von "+this.getBesitzer()+" aus dem Jahr ");
    	System.out.print(this.getBaujahr()+" ist "+this.getPreis()+" Franken wert ");
    	System.out.println("und hat "+this.parkplaetze+" Parkplätze.");
    }

}
