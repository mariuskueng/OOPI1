

public class Fluggesellschaft {

	public static void main(String[] args){
		
		System.out.println(Flugzeug.getCounter());
		Flugzeug [] airline = new Flugzeug[5];

		airline[0] = new Flugzeug("Airbus 320", 165, 890, 12600);
		airline[1] = new Flugzeug("Boeing 747", 436, 907, 13700);
		airline[2] = new Flugzeug("Avro RJ85", 93, 760, 2220);
		airline[3] = new Flugzeug("Airbus 380", 516, 907, 12000);
		airline[4] = new Flugzeug(airline[3]);
		airline[4].setBezeichnung("Airbus 380-B");
		airline[4].setSitze(409);
//		airline[0] = airline[2]; //flugzeug kopieren

		for (int i = 0; i < airline.length; i++) {
			airline[i].printInfo();
			System.out.println(airline[i].getCapacity() + " Passagiere/Jahr");
			System.out.println("Dauer: " + airline[i].getTime(6330.87) + " h");
		}

		if (airline[0] == airline[2]){
			System.out.println("Das gleiche Flugzeug");
		}
		if (airline[3].equals(airline[4])){
			System.out.println("Vergleichbare Flugzeuge");
		}
		
		System.out.println(Flugzeug.getCounter());
		  System.out.println(airline[0].getCounter());

	}

}
