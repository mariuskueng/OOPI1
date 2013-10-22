public class Flugzeug {
  String bezeichnung = "";
  int idNummer = 0;
  int sitze = 0;
  double geschwindigkeit = 0;
  double reichweite = 0;
  int x = 0;
  int y = 0;
  double spannweite = 0;
  double laenge = 0;
  
  public void printInfo(){
    System.out.println(bezeichnung + ": " + sitze + " Sitze "+
        geschwindigkeit + " km/h / " + reichweite + " km");
  }
  
  public double getTime(double distanz){
    double time = distanz/geschwindigkeit;
    return Math.round(time*10)/10.;
  }
  
  public int getCapacity(){
    return sitze * 365;
  }
  
  public void zeichne(){
    stroke(255, 255, 0);
    strokeWeight(6);
    line(x, Math.round(y-spannweite/2), Math.round(x+laenge/2), y);     line(x, y, Math.round(x+laenge), y);
    line(x, Math.round(y+spannweite/2), Math.round(x+laenge/2), y);
    text(bezeichnung, Math.round(x+laenge), y-10);
  }
  
  public void fliegen(){
    if(x<width-laenge && x<reichweite){
      float speed = (float)geschwindigkeit/200;
      x = x+(int)speed;
      reichweite = reichweite-x;
    }
  }
}
