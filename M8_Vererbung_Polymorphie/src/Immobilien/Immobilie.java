package Immobilien;

public class Immobilie{
    private String besitzer;
    private int baujahr;
    private double preis;
    
    public Immobilie(String bes, int bauj, double p){
    	this.besitzer = bes;
    	this.baujahr = bauj;
    	this.preis = p;
    }
    
    public void print(){
    	//Die Immobilie von Hansi aus dem Jahr 1970 ist 605000 Franken wert.
    	System.out.print("Die Immobilie von "+this.besitzer+" aus dem Jahr ");
    	System.out.println(this.baujahr+" ist "+this.preis+" Franken wert.");
    }

	public String getBesitzer() {
		return besitzer;
	}

	public void setBesitzer(String besitzer) {
		this.besitzer = besitzer;
	}

	public int getBaujahr() {
		return baujahr;
	}

	public void setBaujahr(int baujahr) {
		this.baujahr = baujahr;
	}

	public double getPreis() {
		return preis;
	}

	public void setPreis(double preis) {
		this.preis = preis;
	}
}