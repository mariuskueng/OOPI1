import java.util.Scanner;

public class Aufgabe_1_Entschluesselung {
	static Scanner s = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Bitte Wort eingeben: ");
		String wort = s.nextLine();
		int schluessel = 23;
		char[] buchstaben = wort.toCharArray();

		for(int i=0;i<buchstaben.length;i++){
			int buchstabe_ascii = (int) buchstaben[i];
			buchstabe_ascii += schluessel;
			char chiff = (char) buchstabe_ascii;
			buchstaben[i] = chiff;
		}
		String chiff_wort = new String(buchstaben);

		System.out.println(chiff_wort);

	}
}
