

import java.util.Scanner;

public class Aufgabe_2 {
	
	static Scanner eingabe = new Scanner(System.in);
	
	public static void main(String[] args){
		
		System.out.println("Geben Sie den Namen der ersten Person ein.");
		String name1 = eingabe.next();

		System.out.println("Geben Sie den Namen der zweiten Person ein.");
		String name2 = eingabe.next();
		
		System.out.println("Geben Sie das Alter der ersten Person ein.");
		int alter1 = eingabe.nextInt();
		
		System.out.println("Geben Sie das Alter der zweiten Person ein.");
		int alter2 = eingabe.nextInt();
		
		if (alter1 > alter2){
			System.out.println(name1 + " ist " + (alter1-alter2) + " älter als " + name2);
		}
		else{
			System.out.println(name2 + " ist " + (alter2-alter1) + " älter als " + name1);
		}
		
		
	}
}


