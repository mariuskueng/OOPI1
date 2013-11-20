import java.util.Scanner;

public class Programmieraufgaben_3 { //Programm zur Verschl�sselung einer Eingabe!

	static Scanner eingabe = new Scanner(System.in); // Eingabe von Daten

	public static void main(String[] args){
		System.out.println("Geben Sie ein Wort ein: ");
		String wort = eingabe.nextLine(); // Texteingabe
		String geheimwort = "";

		System.out.println("Geben Sie einen Schl�ssel ein! ");
		int chiff_schluessel = eingabe.nextInt(); // Variable f�r den Schl�ssel

		for (int i=0; i<wort.length(); i++){
			char buchstabe = wort.charAt(i); // Variable f�r ein Zeichen
			int buchstabe_ascii = (int) buchstabe; // char wird in eine Zahl umgewandelt
			int buchstabe_ascii_chiff = buchstabe_ascii - chiff_schluessel; // die Zahl wird um den Schl�ssel verkleinert
			char chiff = (char) buchstabe_ascii_chiff; // die neue Zahl wird wieder in ein Zeichen (char umgewandelt)
			geheimwort += chiff; // das geheimwort wird zusammengef�gt
		}
		System.out.println("Ihr Geheimwort ist: " + geheimwort);
	}
}
