Flugzeug [] airline = new Flugzeug[5];

void setup(){
  int width = 1200;
  int height = 400;
  size(width, height);
  background(0,0,255);
    
    for (int i = 0; i < 5; i++) {
      airline[i] = new Flugzeug();
      airline[i].x = (int)random(width)/4;
      airline[i].y = (int)random(height);
    }
    
    airline[0].idNummer = 1;
    airline[0].bezeichnung = "Airbus 320";
    airline[0].sitze = 165;
    airline[0].geschwindigkeit = 890;
    airline[0].reichweite = 12600;
    airline[0].spannweite = 34.1;
    airline[0].laenge = 37.6;
    
    airline[1].idNummer = 2;
    airline[1].bezeichnung = "Boing 747";
    airline[1].sitze = 436;
    airline[1].geschwindigkeit = 907;
    airline[1].reichweite = 13700;
    airline[1].spannweite = 64.4;
    airline[1].laenge = 70.7;
    
    airline[2].idNummer = 3;
    airline[2].bezeichnung = "Avro RJ85";
    airline[2].sitze = 93;
    airline[2].geschwindigkeit = 760;
    airline[2].reichweite = 2220;
    airline[2].spannweite = 26.3;
    airline[2].laenge = 28.3;
    
    airline[3].idNummer = 4;
    airline[3].bezeichnung = "Airbus 380";
    airline[3].sitze = 516;
    airline[3].geschwindigkeit = 907;
    airline[3].reichweite = 12000;
    airline[3].spannweite = 79.8;
    airline[3].laenge = 72.7;
    
    airline[4].idNummer = airline[3].idNummer;
    airline[4].bezeichnung = "Airbus 380-B";
    airline[4].sitze = 409;
    airline[4].geschwindigkeit = airline[3].geschwindigkeit;
    airline[4].reichweite = airline[3].reichweite;
    airline[4].spannweite = airline[3].spannweite;
    airline[4].laenge = airline[3].laenge;
    
    for (int i = 0; i < 1; i++) {
      airline[i].zeichne();
//      airline[i].printInfo();
//      System.out.println(airline[i].getCapacity() + " Passagiere/Jahr");
//      System.out.println("Dauer: " + airline[i].getTime(6330.87) + " h");
    }
}

void draw(){
  background(0,0,255);
  for (int i = 0; i < 5; i++) {
    airline[i].fliegen();  
  }
  for (int i = 0; i < 5; i++) {
    airline[i].zeichne();
  }
}
