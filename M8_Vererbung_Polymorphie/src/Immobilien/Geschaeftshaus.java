package Immobilien;

public class Geschaeftshaus extends Immobilie {
	private double lagerFlaeche;
	private double bueroFlaeche;

	public Geschaeftshaus(String bes, int bauj, double p, double lager, double buero) {
		super(bes, bauj, p);
		this.lagerFlaeche = lager;
		this.bueroFlaeche = buero;
	}
	
	public void print(){
    	System.out.print("Das Geschäftshaus von "+this.getBesitzer()+" aus dem Jahr ");
    	System.out.print(this.getBaujahr()+" ist "+this.getPreis()+" Franken wert ");
    	System.out.print("hat eine Lagerfläche von "+this.lagerFlaeche+" qm und ");
    	System.out.println(" eine Bürofläche von "+this.bueroFlaeche+" qm.");
    }

	public double getLagerFlaeche() {
		return lagerFlaeche;
	}

	public void setLagerFlaeche(double lagerFlaeche) {
		this.lagerFlaeche = lagerFlaeche;
	}

	public double getBueroFlaeche() {
		return bueroFlaeche;
	}

	public void setBueroFlaeche(double bueroFlaeche) {
		this.bueroFlaeche = bueroFlaeche;
	}

}
