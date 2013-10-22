

import java.util.Scanner;

public class Aufgabe_3 {
	static Scanner eingabe = new Scanner(System.in);
	
	public static void main(String[] args){
		
		System.out.println("Kommazahlen mit , auf Mac eingeben!");
		
		// Person 1
		System.out.println("Geben Sie den Namen der ersten Person ein.");
		String name1 = eingabe.next();
		
		System.out.println("Geben Sie das Alter der ersten Person ein.");
		int alter1 = eingabe.nextInt();
		
		// "Kommazahlen mit , auf Mac eingeben!"
		System.out.println("Geben Sie das Gewicht der ersten Person ein (kg).");
		float gewicht1 = eingabe.nextFloat();
		
		System.out.println("Geben Sie die Gršsse der ersten Person ein (m).");
		float groesse1 = eingabe.nextFloat();
		
		// Person 2
		System.out.println("Geben Sie den Namen der zweiten Person ein.");
		String name2 = eingabe.next();

		System.out.println("Geben Sie das Alter der zweiten Person ein.");
		int alter2 = eingabe.nextInt();
		
		System.out.println("Geben Sie das Gewicht der zweiten Person ein (kg).");
		float gewicht2 = eingabe.nextFloat();
		
		System.out.println("Geben Sie die Gršsse der ersten Person ein (m).");
		float groesse2 = eingabe.nextFloat();
		
		if (alter1 > alter2){
			System.out.println(name1 + " ist " + (alter1-alter2) + " Šlter als " + name2);
		}
		else{
			System.out.println(name2 + " ist " + (alter2-alter1) + " Šlter als " + name1);
		}
		
		System.out.println(name1 + " ist " + alter1 + " alt und hat einen BMI von " + gewicht1/(groesse1*groesse1));
		System.out.println(name2 + " ist " + alter2 + " alt und hat einen BMI von " + gewicht2/(groesse2*groesse2));

		
	}
}
