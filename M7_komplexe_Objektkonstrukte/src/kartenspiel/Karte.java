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
		System.out.println(this.value+"/"+this.color);
	}

	public int getValue() {
		return value;
	}

	public int getColor() {
		return color;
	}
}


