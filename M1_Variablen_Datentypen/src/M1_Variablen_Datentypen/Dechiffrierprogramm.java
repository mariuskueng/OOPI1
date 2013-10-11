import java.util.Scanner;


public class Dechiffrierprogramm {

	static Scanner eingabe = new Scanner(System.in); // Eingabe von Daten
	
	public static void main(String[] args){
		System.out.println("Geben Sie ein Zeichen! ");
		String zeichen = eingabe.nextLine(); // Texteingabe
		char buchstabe = zeichen.charAt(0); // Variable f�r ein Zeichen
		
		System.out.println("Geben Sie einen Schl�ssel ein! ");
		int chiff_schluessel = eingabe.nextInt(); // Variable f�r den Schl�ssel
		
		int buchstabe_ascii = (int) buchstabe;
		System.out.println(chiff_schluessel);
		int buchstabe_ascii_chiff = buchstabe_ascii - chiff_schluessel;
		
		char chiff = (char) buchstabe_ascii_chiff;
		
		System.out.println("Sie haben " + buchstabe + " und " + chiff_schluessel + " eingegeben.");
		System.out.println("Das verschl�sselte Zeichen ist: " + chiff);
	}

}
