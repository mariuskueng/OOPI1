
public class Fuhrpark {


	public static void main(String[] args){
		Fahrzeug auto = new Fahrzeug("Auto", 1, 180);
		auto.printInfo();
		double autoTime= auto.getTime(260);
		System.out.println(autoTime);

		Fahrzeug bus = new Fahrzeug("Bus", 2, 80.0);
		bus.printInfo();
		double busTime= bus.getTime(260);
		System.out.println(busTime);

		Fahrzeug flugzeug = new Fahrzeug("Flugzeug", 3, 800.0);
		flugzeug.printInfo();
		double flugzeugTime= flugzeug.getTime(260);
		System.out.println(flugzeugTime);

		Fahrzeug deinAuto, seinAuto;
		deinAuto = new Fahrzeug(auto);
		deinAuto.setIdNummer(4);
		seinAuto = new Fahrzeug();
		seinAuto.setBezeichnung("Auto");
		seinAuto.setIdNummer(5);
		seinAuto.setMaxSpeed(240.0);

		auto.printInfo();
		deinAuto.printInfo();
		seinAuto.printInfo();

		if (auto.equals(deinAuto)) {
			System.out.println("Wir haben das gleiche Auto.");
		}
		//Vergleiche mit:
		if (auto == deinAuto) {
			System.out.println("Wir haben das gleiche Auto.");
		}
	}
}
