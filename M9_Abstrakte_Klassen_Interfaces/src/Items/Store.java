package Items;

public class Store {

	public static void main(String[] args) {
		Item[] einkaufswagen= new Item[22];
		fuelleWagen(einkaufswagen);
		// Geben Sie hier die Informationen zum einkaufswagen aus
		for (int i= 0; i<22; i++){
			einkaufswagen[i].getInfo();
		}
		// Hier soll die Summe der Volumen der Möbelstücke berechnet werden.
		double vol=0;
		
		System.out.println("Sie müssen "+(vol/1000000)+ " m^3 transportieren");
		// Berechnen Sie, wie viele Möbel aus Holz sind. Verwenden Sie dazu die Methode contains("Holz") von String
		
		// Suchen Sie im Array einkaufswagen nach einem Buch mit dem Titel "Das Buch"
	}

	// Diese Methode setzt die Elemente in den Einkaufswagen. Dies dient zum Testen.
	public static void fuelleWagen(Item[] wagen){
		for (int i=0; i<5; i++){
			wagen[i]= new Table(100+Math.random()*100, 50+Math.random()*50, "Holz", 1000+Math.random()*1000);
		}
		for (int i=5; i<10; i++){
			wagen[i]= new Table(100+Math.random()*100, 50+Math.random()*50, "Glas", 500+Math.random()*1500);
		}
		for (int i=10; i<15; i++){
			wagen[i]= new Wardrobe(100+Math.random()*100, 35+Math.random()*35, 50+Math.random()*150, "massiv Holz", 1000+Math.random()*1000);
		}
		for (int i=15; i<20; i++){
			wagen[i]= new Wardrobe(100+Math.random()*100, 35+Math.random()*35, 50+Math.random()*150, "Furnier", 500+Math.random()*1000);
		}
		Autor a= new Autor("Muller");
		wagen[20]= new Book(a, "\"Das Buch\"", "ABCDEFGHIJKLMNOP", 10.2);
		wagen[21]= new Book(new Autor("Muller"), "\"Das Buch 2\"", "abcdefghijklmnop", 12.2);
	}

}
