package kaffee;

public class Kaffeemaschine {
	private int menge;
	
	public Kaffeemaschine(){
		menge=0;
	}

	public int getMenge() {
		return menge;
	}

	public void fuellen(int menge) {
		this.menge += menge;
	}
	
	public void bruehen(Kaffeepad pad){
		if (menge >= pad.getDl()) {
			menge -= pad.getDl();
			System.out.println("Bitte schšn ein "+pad.getTyp());
		}
		else{
			System.out.println("Der Tank muss aufgefŸllt werden.");
		}
	}
}
