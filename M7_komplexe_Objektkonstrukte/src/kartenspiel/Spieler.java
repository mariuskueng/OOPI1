package kartenspiel;

public class Spieler {
	private Karte[] karten; // zur Verwaltung der Karten
	private String name;
	
	public Spieler(String name){
		this.name = name;
		this.karten = new Karte[5];
	}
	
	public void addKarte(Karte k){
		boolean set = false;
		int i = 0;
		
		/*Wenn eine Spielerkarte leer ist, wird dort eine Karte hinzgefügt und die while-Schlaufe mit true abgebrochen.
		 * Danach wird um 1 erhöht um zur nächsten Spielerkarte zu gehen. Es wird immer geprüft ob eine Spielerkarte
		 * bereits vorhanden ist.
		 * */
		while(i<karten.length && set == false){ //i<5 == Grösse der Hand, ist Karte gesetzt
			if(karten[i] == null){
				karten[i] = k;
				set = true;
			}
			i++;
		}
	}
	
	public void sort(){
		boolean switches = true;
		while(switches){
			switches = false;
			for (int i=0; i<karten.length-1; i++){
				if (karten[i].getValue() > karten[i+1].getValue()){
					Karte temp=karten[i]; 
					karten[i]= karten[i+1]; 
					karten[i+1]= temp;
					switches=true;
				}
			}
		}
	}
	
	public void print(){
		System.out.println("Spieler "+this.name);
		System.out.println("---------");
		for (int i = 0; i < this.karten.length; i++) {
			this.karten[i].print();
		}
		System.out.println();
	}
}
