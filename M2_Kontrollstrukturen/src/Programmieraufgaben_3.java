import java.util.Scanner;

public class Programmieraufgaben_3 { //Programm zur Verschlüsselung einer Eingabe!

	static Scanner eingabe = new Scanner(System.in); // Eingabe von Daten

	public static void main(String[] args){
		System.out.println("Geben Sie ein Wort ein: ");
		String wort = eingabe.nextLine(); // Texteingabe
		String geheimwort = "";

		System.out.println("Geben Sie einen Schlüssel ein! ");
		int chiff_schluessel = eingabe.nextInt(); // Variable für den Schlüssel

		for (int i=0; i<wort.length(); i++){
			char buchstabe = wort.charAt(i); // Variable für ein Zeichen
			int buchstabe_ascii = (int) buchstabe; // char wird in eine Zahl umgewandelt
			int buchstabe_ascii_chiff = buchstabe_ascii - chiff_schluessel; // die Zahl wird um den Schlüssel verkleinert
			char chiff = (char) buchstabe_ascii_chiff; // die neue Zahl wird wieder in ein Zeichen (char umgewandelt)
			geheimwort += chiff; // das geheimwort wird zusammengefügt
		}
		System.out.println("Ihr Geheimwort ist: " + geheimwort);
	}
}
