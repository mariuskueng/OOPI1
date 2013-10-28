

public class Fluggesellschaft {
	
	public static void main(String[] args){
		
		Flugzeug [] airline = new Flugzeug[5];
		
		for (int i = 0; i < 5; i++) {
			airline[i] = new Flugzeug();
			airline[i].printInfo();
		}
		
		airline[0] = new Flugzeug("Airbus 320",1, 165, 890, 12600);
		airline[1] = new Flugzeug("Boeing 747",2, 436, 907, 13700);
		airline[2] = new Flugzeug("Avro RJ85",3, 93, 760, 2220);
		airline[3] = new Flugzeug("Airbus 380",4, 516, 907, 12000);
		airline[4] = new Flugzeug(airline[3]);
		airline[4].setBezeichnung("Airbus 380-B");
		airline[4].setSitze(409);
		airline[0] = airline[2];
		
		
		
//		airline[0].setIdNummer(1);
//		airline[0].setBezeichnung("Airbus 320");
//		airline[0].setSitze(165);
//		airline[0].setGeschwindigkeit(890);
//		airline[0].setReichweite(12600);
//		
//		airline[1].setIdNummer(2);
//		airline[1].setBezeichnung("Boeing 747");
//		airline[1].setSitze(436);
//		airline[1].setGeschwindigkeit(907);
//		airline[1].setReichweite(13700);
//		
//		airline[2].setIdNummer(3);
//		airline[2].setBezeichnung("Avro RJ85");
//		airline[2].setSitze(93);
//		airline[2].setGeschwindigkeit(760);
//		airline[2].setReichweite(2220);
//		
//		airline[3].setIdNummer(4);
//		airline[3].setBezeichnung("Airbus 380");
//		airline[3].setSitze(516);
//		airline[3].setGeschwindigkeit(907);
//		airline[3].setReichweite(12000);
//		
//		airline[4].setIdNummer(airline[3].getIdNummer());
//		airline[4].setBezeichnung("Airbus 380-B");
//		airline[4].setSitze(409);
//		airline[4].setGeschwindigkeit(airline[3].getGeschwindigkeit());
//		airline[4].setReichweite(airline[3].getReichweite());
		
		for (int i = 0; i < 5; i++) {
			airline[i].printInfo();
			System.out.println(airline[i].getCapacity() + " Passagiere/Jahr");
			System.out.println("Dauer: " + airline[i].getTime(6330.87) + " h");
		}
		
		System.out.println(airline[3].equals(airline[4]));
		System.out.println(airline[2].equals(airline[0]));
		
	}

}
