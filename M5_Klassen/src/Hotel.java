
public class Hotel {

	private int stockwerke;
	private int zimmerProStockwerk;
	private int belegung;

	// keine getter und setter, da mit ich die attribute bereits mit einchecken,
	// auschecken und getZimmer Šndere. Ausserdem werden die inital-werte im konstruktor gesetzt.

	public Hotel(int stockwerke, int zimmerProStockwerk){
		this.stockwerke = stockwerke;
		this.zimmerProStockwerk = zimmerProStockwerk;
		this.belegung = 0;
	}

	public boolean equals(Hotel h){
		if(this.stockwerke == h.stockwerke && this.zimmerProStockwerk == h.zimmerProStockwerk){
			return true;
		}
		return false;
	}


	public int getZimmer(){
		return belegung;
	}

	public boolean einchecken(){
		if(stockwerke*zimmerProStockwerk == getZimmer()){
			return false;
		}
		belegung++;
		return true;
	}

	public void auschecken(){
		if(getZimmer() > 0){
			belegung--;
			System.out.println("Auschecken erfolgreich!");
		}
		else{
			System.out.println("Auschecken nicht mšglich, alle schon ausgecheckt!");
		}
	}

	public void printInfo(){
		System.out.println(getZimmer() + " von " + (stockwerke*zimmerProStockwerk) + " belegt");
	}

}
