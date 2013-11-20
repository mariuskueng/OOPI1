import java.util.Scanner;

public class Programmieraufgaben_4 {

	static Scanner s = new Scanner(System.in); // Eingabe von Daten

	public static void main(String[] args) {
		// Gerade Zahlen
		for(int i = 0; i<=50; i++){
			if(i%2 == 0){
				//System.out.println(i);
			}
		}

		// Teilbar durch 15
		for(int i = 0; i<=100; i++){
			if(i%15 == 0){
				//System.out.println(i);
			}
		}

		// Zahlenreihe mit 3
		for(int i = 1; i<=20; i++){
			//System.out.println(i*3);
		}

		System.out.println("Eingabe von n: ");
		int eingabe = s.nextInt();

		for(int i = 1; i<=eingabe; i++){
			System.out.println(i*3);
		}
	}

}
