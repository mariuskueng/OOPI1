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
		while(i<5 && set == false){ //i<5 == Gršsse der Hand, ist Karte gesetzt
			if(karten[i] == null){
				set = true;
				karten[i] = k;	
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
