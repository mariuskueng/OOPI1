import terminal.VT;
import terminal.VTerm;

public class Pandemie {
	// globale Matrix für das Speichern der Population
	static int[][] population = new int[21][51];
	static VTerm console = VTerm.getInstance(25, 80, "Pandemie", VT.CS_TINY);
	
	static int tage = 0;
	static int maxTage = 200;
	static int wahrscheinlichkeit = 5;
	static int krankeMenschen = 1;
	
	public static void main(String[] args) {
		int i, j; // Laufvariablen für die Schleifen
		// Die Werte im Array Personen werden auf 0 gesetzt
		for (i = 0; i < 21; i++) {
			for (j = 0; j < 51; j++) {
				population[i][j] = 0;
			}
		}
		print(); // Ausgabe im Fenster von console (Typ VTerm)
		console.delay(100); // Warten für 500 Millisekunden
		// erste Person soll angesteckt werden
		init();
		
		for (tage = 0; tage < maxTage; tage++) {
			for (i = 1; i < 20; i++) {
				for (j = 1; j < 50; j++) {
					ansteckung(i, j);
				}
			}
			console.clearScreen(); // Löschen des Inhalts von console
			print(); // Ausgabe im Fenster von console (Typ VTerm)
			console.delay(100);
		}
		// schliessen der Konsole mit Enter
		console.readyToExit(true);
	}
	/* Hinzufügen der neuen Methoden */
	
	public static void init(){
		for(int i=0;i<krankeMenschen;i++){
			int x = (int) (Math.random() * 21);
			int y = (int) (Math.random() * 51);
			population[x][y] = 1;
		}
	}
	
	// Ausgabe im Fenster von console (Typ VTerm)
	public static void print(){
		int i, j; // Laufvariablen für die Schleifen
		console.println("Tag " + (tage+1));
		// Ausgabe im Fenster von console (Typ VTerm)
		for (i = 0; i < 21; i++) {
			for (j = 0; j < 51; j++) {
				if (population[i][j] > 0  && population[i][j] <= 7) {
					if(population[i][j] >= 4){
						console.setColor(VT.RED);
					}
					else{
						console.setColor(VT.WHITE);
					}
					console.print("" + population[i][j]);
				}
				else {
					console.print(' ');
				}
			}
			console.println();
		}
	}
	
	public static void ansteckung(int x, int y){
		if(population[x][y] == 0){
			int zufall = (int) (Math.random() * wahrscheinlichkeit); //Wahrscheinlichkeit
			if(zufall == 0){
				// Berechnung der Ansteckung
				if(infectioes(x-1, y)){
					population[x][y] = 1;
				}
				else if (infectioes(x+1, y)){
					population[x][y] = 1;
				}
				else if (infectioes(x, y-1)){
					population[x][y] = 1;
				}
				else if(infectioes(x, y+1)){
					population[x][y] = 1;	
				}
			}
		}
		else if(population[x][y] > 0 && population[x][y] < 8){
			population[x][y] ++;
		}
	}
	
	public static boolean infectioes(int x, int y){
		boolean ansteckung = false;
		if(population[x][y] >= 1 && population[x][y] <= 7){
			ansteckung = true;
		}
		return ansteckung;
	}
}
