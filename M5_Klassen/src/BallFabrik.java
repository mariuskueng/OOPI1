
public class BallFabrik {
     public static void main(String[] args) {
       Ball[] baelle = new Ball[20];

       // Erzeugen Sie hier 20 Bälle mit einem zufälligen Radius
       for (int i = 0; i < baelle.length; i++) {
    	   baelle[i] = new Ball(Math.random()*10);
       }

       double volume = 0;
       double surface = 0;
       for (int i = 0; i < baelle.length; i++) {
         baelle[i].printInfo();
         volume += baelle[i].getVolume();
         surface += baelle[i].getSurface();
       }
       /* Berechnen Sie hier wie gross das gesamte Volumen, bzw. die
         Oberfläche ist */
       System.out.println(volume +"  " + surface);
     }
}
