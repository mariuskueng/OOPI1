package kartenspiel;

public class Karte {
	// bezieht sich auf keine weiteren Objekte
	
	private int value = 0;
	private int color = 0;
	
	public Karte(int value, int color){
		this.value = value;
		this.color = color;
	}
	
	public void print(){
		switch(this.color){
			case 0:
				System.out.print("Pik");
				break;
			case 1:
				System.out.print("Herz");
				break;
			case 2:
				System.out.print("Kreuz");
				break;
			case 3:
				System.out.print("Karo");
				break;
		}
		System.out.print(" / ");
		switch(this.value){
			case 11:
				System.out.print("Bauer");
				break;
			case 12:
				System.out.print("Dame");
				break;
			case 13:
				System.out.print("Kšnig");
				break;
			case 14:
				System.out.print("Ass");
				break;
			default:
				System.out.print(this.value);
		}
		
		System.out.println();
	}

	public int getValue() {
		return value;
	}

	public int getColor() {
		return color;
	}
}


