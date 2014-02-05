package Items;

public abstract class Item {
	private double prize;

	public void setPrize(double prize) {
		this.prize = prize;
	}

	public Item(double p) {
		prize = Math.ceil(p*100)/100;
	}

	public double getPrize() {
		return prize;
	}

	public abstract void getInfo();
}
