package Immobilien;

public class Firma {

	public static void main(String[] args) {
		Wohnhaus w1 = new Wohnhaus("Pascal", 1967, 500000, 1);
		Wohnhaus w2 = new Wohnhaus("Fredi", 1890, 18000000, 4);
		Wohnhaus w3 = new Wohnhaus("Michaela", 2005, 456000, 2);
		Wohnhaus w4 = new Wohnhaus("Paula", 1980, 3010000, 10);
		Wohnhaus w5 = new Wohnhaus("Christian", 1997, 130000, 3);
		
		Geschaeftshaus g1 = new Geschaeftshaus("Pack AG", 2009, 1690000, 100, 406);
		Geschaeftshaus g2 = new Geschaeftshaus("Oskar", 1970, 1050000, 0, 890);
		Geschaeftshaus g3 = new Geschaeftshaus("Päuli", 1920, 46000, 60, 60);
		Geschaeftshaus g4 = new Geschaeftshaus("Alta gmbh", 1969, 2007000, 2000, 25);
		Geschaeftshaus g5 = new Geschaeftshaus("Oliver", 1993, 930000, 370, 95);
		
		Wohnhaus[] w = new Wohnhaus[5];
		w[0] = w1;
		w[1] = w2;
		w[2] = w3;
		w[3] = w4;
		w[4] = w5;
		
		Geschaeftshaus[] g = new Geschaeftshaus[5];
		g[0] = g1;
		g[1] = g2;
		g[2] = g3;
		g[3] = g4;
		g[4] = g5;
		
		for (int i = 0; i < 5; i++) {
			w[i].print();
		}
		for (int i = 0; i < 5; i++) {
			g[i].print();
		}
		
		Immobilie[] immobilien = new Immobilie[10];
		immobilien[0] = w1;
		immobilien[1] = w2;
		immobilien[2] = w3;
		immobilien[3] = w4;
		immobilien[4] = w5;
		immobilien[5] = g1;
		immobilien[6] = g2;
		immobilien[7] = g3;
		immobilien[8] = g4;
		immobilien[9] = g5;
		
		for (int i = 0; i < 10; i++) {
			immobilien[i].print();
		}
 	}

}
