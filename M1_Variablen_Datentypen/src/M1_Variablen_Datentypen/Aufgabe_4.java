package w38;

import java.lang.Math;

public class Aufgabe_4 {
	
	public static void main(String[] args){
		
		//Easy Way
		
		String binaerZahl = "1011";
		int dezimalZahl = Integer.parseInt(binaerZahl, 2);
		System.out.println(dezimalZahl);
		
		int bin_zahl= 1011;
		String zahlenString = Integer.toString(bin_zahl);
		char[] zahlenArray = zahlenString.toCharArray();
		int summeDezimalZahl = 0;
		
		for(int i=zahlenString.length()-1; i>-1; i--){
			
			int indexZahl = (int) zahlenArray[i];
			int potenz = 0;
			
			for(int x=0; x<zahlenString.length(); x++){
				potenz = (int) Math.pow(2, x);
				System.out.println("Potenz: "+potenz);
			}
			summeDezimalZahl += (indexZahl*potenz);
			System.out.println(indexZahl*potenz);
		}
		System.out.println(summeDezimalZahl);
		
		/*
		 * int b = 10011101;
		 * int wert;
		 * wert = (b % 10) * 1;
		 * b=b/10;
		 * System.out.println(wert+" /"+b);
		 * wert = (b%10)*2;
		 * etc...
		 * 
		 * */
	}
}
