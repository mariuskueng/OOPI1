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
    fill(255, 255, 0);
    rect(x, y, sitze/10, sitze/10);
    text(bezeichnung, x, y);
  }
  
  public void fliegen(){
    float speed = (float)geschwindigkeit/200;
    x = x+(int)speed;
  }
}
