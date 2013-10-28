
public class Hotel {
	
	int stockwerke = 0;
	int zimmerProStockwerk = 0;
	int belegung = 0;
	
	
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
