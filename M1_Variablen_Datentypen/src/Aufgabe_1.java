

import java.util.Scanner;

public class Aufgabe_1 {

/*	public Aufgabe_1(){
		//Konstruktor
	}*/

	public static void main(String[] args){
		System.out.println("Bitte eine Ganzzahl eingeben: ");
		aufgabe_1_a();
		System.out.println("Bitte eine Fliesskommazahl eingeben: ");
		aufgabe_1_b();
	}

	public static void aufgabe_1_a(){
		int eingabeZahl;

		Scanner eingabe = new Scanner(System.in);
		String wert = eingabe.next();
		eingabeZahl = Integer.parseInt(wert);

		System.out.println(eingabeZahl*2);
	}

	public static void aufgabe_1_b(){
		float eingabeZahl;

		Scanner eingabe = new Scanner(System.in);
		String wert = eingabe.next();
		eingabeZahl = Float.parseFloat(wert);

		System.out.println(eingabeZahl*2);
	}
}
