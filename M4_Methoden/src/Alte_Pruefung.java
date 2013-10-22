import java.util.Scanner;

public class Alte_Pruefung {

	public static void main(String[] args) {
		/*
		Scanner scanner = new Scanner(System.in);
//	     System.out.println("Geben Sie ihr Alter ein");
	     int alter= 10;
//	     System.out.println("Geben Sie das aktuelle Jahr ein:");
	     int jahr= 2013;
//	     System.out.println("Geben Sie die Anzahl der Jahre ein");
	     int anzahl= 10;
	     // Aufgabe 2.2
	     for(int i=0; i<anzahl;i++){
	    	 System.out.println("Im Jahr " + (jahr-anzahl+i) + " sind Sie " + (alter-anzahl+i));
	     }
	     System.out.println("In diesem Jahr "+jahr+" sind Sie "+alter);
	     // Ausgabe 2.1
	     for(int i=0; i<10;i++){
	    		System.out.println("Im Jahr " + (jahr+i+1) + " sind Sie " + (alter));
	    	}
	     
	     while(anzahl>0){
	    	 System.out.println("Im Jahr " + (jahr-anzahl) + " sind Sie " + (alter-anzahl));
	    	 anzahl--;
	     }
		*/
		
		int[] fibonacci = new int[8];
		fibonacci[0] = 0;
		fibonacci[1] = 1;
		
		for(int i=0;i<fibonacci.length;i++){
			if(i!=0 && i!= 1){
				fibonacci[i] = fibonacci[i-1]+fibonacci[i-2];
			}
		}
		
		for(int i=0;i<fibonacci.length;i++){
			for(int x=0; x<fibonacci[i];x++){
				System.out.print("*");
			}
			System.out.println();
			
		}
		int summe = 0;
		for(int i=0;i<fibonacci.length;i++){
			summe += fibonacci[i];
		}
		summe = summe/fibonacci.length;
		System.out.println(summe);
		
	}
}
