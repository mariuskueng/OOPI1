package kartenspiel;

public class Spiel {
	private Spieler[] spieler;		// Zur Verwaltung der Spieler
	private Stapel stapel;			// Zur Vewaltung des Kartenstapels
	
	public static void main(String[] args){
		new Spiel(2);
	}
	
	public Spiel(int anzahlSpieler){
		this.spieler = new Spieler[anzahlSpieler];
		for (int i = 0; i < anzahlSpieler; i++) {
			this.spieler[i] = new Spieler(""+(i+1));
		}
		this.stapel = new Stapel();
		this.stapel.mischen();
		this.austeilen();
		this.auswerten();
	}
	
	public void austeilen(){
		for (int i = 0; i < this.spieler.length; i++) {
			for (int j = 0; j < 5; j++) {
				this.spieler[i].addKarte(this.stapel.getNextCard());
			}
			this.spieler[i].sort();
		}
	}
	
	public void auswerten(){
		for (int i = 0; i < this.spieler.length; i++) {
			this.spieler[i].print();
		}
	}
}
