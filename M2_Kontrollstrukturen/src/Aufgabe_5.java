import java.util.Scanner;

public class Aufgabe_5 {
	
	static Scanner s = new Scanner(System.in);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int tag, monat;
		
		System.out.println("Bitte geben Sie den Tag ein:");
		tag = s.nextInt();
		System.out.println("Bitte geben Sie den Monat ein (Wert zwischen 1 und 12:");
		monat = s.nextInt();
		
		// Testen Sie, ob der Monat ein m�glicher Monat ist
		if (monat < 1 || monat > 12){
			System.out.println("kein g�ltiger Monat");
		}
		else{
			if (tag <= 31 ){
				// Testen Sie, in welcher Jahreszeit der angegebene Tag ist.
				
				if(monat >= 3 && monat < 6){ //Fr�hling
					if(monat == 3 && tag < 21){ //21. M�rz
						System.out.println("Winter");
					}
					else{
						System.out.println("Fr�hling");
					}
				}
				else if(monat >=6 && monat < 9){ //Sommer
					if(monat == 6 && tag < 21){ //21. Juni
						System.out.println("Fr�hling");
					}
					else{
						System.out.println("Sommer");
					}
				}
				else if(monat >=9 && monat < 12){ //Herbst
					if(monat == 9 && tag < 21){ //21. September
						System.out.println("Sommer");
					}
					else{
						System.out.println("Herbst");
					}
				}
				else{ //Winter
					System.out.println("Winter");
				}
				
			}
			else{
				System.out.println("kein g�ltiger Tag");
			}
		}
	}

}
