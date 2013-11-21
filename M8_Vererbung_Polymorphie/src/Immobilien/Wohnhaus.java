package Immobilien;

public class Wohnhaus extends Immobilie{
	private int wohnungen;
	
	
	public Wohnhaus(String b, int jahr, double wert, int w){
		super(b,jahr,wert);
		wohnungen= w;
	}
	
	public void print(){
    	System.out.print("Das Wohnhaus von "+this.getBesitzer()+" aus dem Jahr ");
    	System.out.print(this.getBaujahr()+" ist "+this.getPreis()+" Franken wert ");
    	System.out.println("und hat "+this.wohnungen+" Wohnungen.");
    }
	
	public int getWohnungen() {
		return wohnungen;
	}

	public void setWohnungen(int wohnungen) {
		this.wohnungen = wohnungen;
	}
}
