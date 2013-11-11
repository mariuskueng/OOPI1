package kartenspiel;

import java.util.Arrays;

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
		while(i<5 && set == false){
			if(karten[i] == null){
				set = true;
				karten[i] = k;
				
			}
			i++;
		}
		
		// TODO: Karten sortieren
	}
	
	public void print(){
		System.out.println(this.name);
		System.out.println("---------");
		for (int i = 0; i < this.karten.length; i++) {
			this.karten[i].print();
		}
		System.out.println();
	}
}
