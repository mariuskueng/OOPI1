package kaffee;

public class ICH {

	public static void main(String[] args) {

		Kaffeemaschine meineMaschine = new Kaffeemaschine();
		Kaffeepad espresso = new Kaffeepad(2, "Espresso");
		Kaffeepad latte = new Kaffeepad(5, "Latte");
		Kaffeepad cappucino = new Kaffeepad(3, "Cappucino");

		meineMaschine.fuellen(10);
		meineMaschine.bruehen(espresso);
		meineMaschine.bruehen(latte);
		meineMaschine.bruehen(cappucino);
		meineMaschine.fuellen(10);
		meineMaschine.bruehen(espresso);
	}

}
