

import java.util.Scanner;
import java.lang.Math;

public class Kreisberechnung {

	static Scanner eingabe = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final double pi = 3.14;

		System.out.println("Radius eingeben: ");
		double radius = eingabe.nextDouble();

		double flaeche = (radius*radius)*pi;
		flaeche =  Math.round(flaeche*100)/100.0;

		double umfang = (2*radius)*pi;
		umfang = Math.round(umfang*100)/100.0;

		System.out.println("Fläche: "+ flaeche);
		System.out.println("Umfang: "+ umfang);

	}

}
