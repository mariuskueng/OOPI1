package tutorial_5;

public class Fluggesellschaft {
	
	public static void main(String[] args){
		Flugzeug a320 = new Flugzeug();
		Flugzeug b747 = new Flugzeug();
		Flugzeug avro85 = new Flugzeug();
		Flugzeug a380 = new Flugzeug();
		Flugzeug a380b = new Flugzeug();
		
		a320.idNummer = 1;
		a320.bezeichnung = "Airbus 320";
		a320.sitze = 165;
		a320.geschwindigkeit = 890;
		a320.reichweite = 12600;
		double a320Time = a320.getTime(6330.87);
		
		b747.idNummer = 2;
		b747.bezeichnung = "Boing 747";
		b747.sitze = 436;
		b747.geschwindigkeit = 907;
		b747.reichweite = 13700;
		double b747Time = b747.getTime(6330.87);
		
		avro85.idNummer = 3;
		avro85.bezeichnung = "Avro RJ85";
		avro85.sitze = 93;
		avro85.geschwindigkeit = 760;
		avro85.reichweite = 2220;
		double avro85Time = avro85.getTime(6330.87);
		
		a380.idNummer = 4;
		a380.bezeichnung = "Airbus 380";
		a380.sitze = 516;
		a380.geschwindigkeit = 907;
		a380.reichweite = 12000;
		double a380Time = a380.getTime(6330.87);
		
		a380b.idNummer = a380.idNummer;
		a380b.bezeichnung = "Airbus 380-B";
		a380b.sitze = 409;
		a380b.geschwindigkeit = a380.geschwindigkeit;
		a380b.reichweite = a380.reichweite;
		double a380bTime = a380b.getTime(6330.87);
		
		a320.printInfo();
		System.out.println("Dauer: " + a320Time + " h");
		b747.printInfo();
		System.out.println("Dauer: " + b747Time + " h");
		avro85.printInfo();
		System.out.println("Dauer: " + avro85Time + " h");
		a380.printInfo();
		System.out.println("Dauer: " + a380Time + " h");
		a380b.printInfo();
		System.out.println("Dauer: " + a380bTime + " h");
		
	}

}
