import java.util.Scanner;

public class Programmieraufgaben_1 {
	
	static Scanner s = new Scanner(System.in);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int tag, monat;
		
		System.out.println("Bitte geben Sie den Tag ein:");
		tag = s.nextInt();
		System.out.println("Bitte geben Sie den Monat ein (Wert zwischen 1 und 12:");
		monat = s.nextInt();
		
		// Testen Sie, ob der Monat ein mšglicher Monat ist
		
		switch (monat) {
		case 1:
			System.out.println("Winter");
			break;
		case 2:
			System.out.println("Winter");
			break;
		case 3:
			if (tag < 21){
				System.out.println("Winter");
			}
			else{
				System.out.println("FrŸhling");
			}
			break;
		case 4:
			System.out.println("FrŸhling");
			break;
		case 5:
			System.out.println("FrŸhling");
			break;
		case 6:
			if (tag < 21){
				System.out.println("FrŸhling");
			}
			else{
				System.out.println("Sommer");
			}
			break;
		case 7:
			System.out.println("Sommer");
			break;
		case 8:
			System.out.println("Sommer");
			break;
		case 9:
			if (tag < 21){
				System.out.println("Sommer");
			}
			else{
				System.out.println("Herbst");
			}
			break;
		case 10:
			System.out.println("Herbst");
			break;
		case 11:
			System.out.println("Herbst");
			break;
		case 12:
			if (tag < 21){
				System.out.println("Herbst");
			}
			else{
				System.out.println("Winter");
			}
			break;
		default:
			System.out.println("kein gŸltiger Monat");
			break;
		}
	}

}
