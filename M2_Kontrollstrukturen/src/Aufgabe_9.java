
public class Aufgabe_9 {

	public static void main(String[] args) {
		double ticket = 2.5;
		double preis = 0;
		int personen = 20;
		
//		if (personen > 10){
//			ticket = ticket*0.9;
//		}
		// For-Variante
		/*for (int person = 1; person <= personen; person++){
			
			for (int tag = 1; tag <= 5; tag++){
				
				// Berechnung des Preises
				preis = (person * tag) * ticket;
				
				// Ausgabe des Preises
				System.out.println(person + " Person(en)" + ", Tag "+ tag + " = " + preis);
			}
		}*/
		
		// While-Variante
		int person = 1;
		int tag = 1;
		
		while(person <= 20){
			while(tag <= 5){
				// Berechnung des Preises
				preis = (person * tag) * ticket;
				
				// Ausgabe des Preises
				System.out.println(person + " Person(en)" + ", Tag "+ tag + " = " + preis);
				
				tag++;
			}
			tag = 0;
			person++;
		}
		
	}

}
