
public class OOPL_Aufgaben_2 {

	public static void main(String[] args) {

		int wert=getInteger("4321");
		System.out.println(wert);
		System.out.println(ausgeben(82));
   		ausgeben(3,4);
	}

	public static char ausgeben(int k){
		if(k>=0 && k <= 127){
			char zeichen = (char) k;
			return zeichen;
		}
		return ' ';
	}

	public static int ausgeben(int k, int h){
		System.out.println(k+h);
		return k+h;
	}

	public static int getInteger(String k){
		int zahl = Integer.parseInt(k);
		return zahl;
	}

}
