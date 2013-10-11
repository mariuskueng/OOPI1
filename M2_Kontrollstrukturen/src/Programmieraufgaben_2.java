import java.util.Scanner;

public class Programmieraufgaben_2 {

	static Scanner s = new Scanner(System.in);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Gehen (0)\nVelo (1)\nAuto (2)\nZug (3)");
		System.out.println("Bitte geben Sie die gewünschte Fortbewegungsart ein:");

		int fortbewegungsart = s.nextInt();
		
		int geschwindigkeit = 0;
		
		System.out.println("Bitte geben Sie die gewünschte Strecke (km) ein (Ganzzahl):");
		int strecke = s.nextInt();
		
		switch (fortbewegungsart){
		case 0:
			geschwindigkeit = 5;
			break;
		case 1:
			geschwindigkeit = 15;
			break;
		case 2:
			geschwindigkeit = 50;
			break;
		case 3:
			geschwindigkeit = 70;
			break;
		default:
			System.out.println("Falsche Eingabe!");
			break;
		}
		
		double fahrzeit = strecke / geschwindigkeit;
		System.out.println("Ihre Fahrzeit ist: "+ fahrzeit);
	}

}
