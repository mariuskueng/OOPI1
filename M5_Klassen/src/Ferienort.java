
public class Ferienort {

	public static void main(String[] args) {
		
		Hotel edelweiss = new Hotel(4, 10);
		
		for (int i = 0; i < 5; i++) {
			if(edelweiss.einchecken()){
				System.out.println("Einchecken erfolgreich!");
			}
			else{
				System.out.println("Alle Zimmer sind belegt!");
			}
		}
		edelweiss.auschecken();
		System.out.println("Hotel Edelweiss");
		edelweiss.printInfo();
		
		
		Hotel astoria = new Hotel(10, 20);
		
		for (int i = 0; i < 4; i++) {
			astoria.einchecken();
		}
		for (int i = 0; i < 5; i++) {
			astoria.auschecken();
		}
		System.out.println("Hotel Astoria");
		astoria.printInfo();
		
		
		Hotel alpenblick = new Hotel(1, 30);
		
		for (int i = 0; i < 30; i++) {
			alpenblick.einchecken();
		}
		alpenblick.einchecken();
		System.out.println("Hotel Alpenblick");
		alpenblick.printInfo();
	}

}
