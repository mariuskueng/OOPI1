import java.util.Scanner;


public class Dechiffrierprogramm {

	static Scanner eingabe = new Scanner(System.in); // Eingabe von Daten
	
	public static void main(String[] args){
		System.out.println("Geben Sie ein Zeichen! ");
		String zeichen = eingabe.nextLine(); // Texteingabe
		char buchstabe = zeichen.charAt(0); // Variable für ein Zeichen
		
		System.out.println("Geben Sie einen Schlüssel ein! ");
		int chiff_schluessel = eingabe.nextInt(); // Variable für den Schlüssel
		
		int buchstabe_ascii = (int) buchstabe;
		System.out.println(chiff_schluessel);
		int buchstabe_ascii_chiff = buchstabe_ascii - chiff_schluessel;
		
		char chiff = (char) buchstabe_ascii_chiff;
		
		System.out.println("Sie haben " + buchstabe + " und " + chiff_schluessel + " eingegeben.");
		System.out.println("Das verschlüsselte Zeichen ist: " + chiff);
	}

}
