
public class Box {
	private double hoehe;
	private double breite;
	private double tiefe;
	private double volume;
	private double surface;

	public Box(){
		this.hoehe = 1.0;
		this.breite = 1.0;
		this.tiefe = 1.0;
		this.volume = this.calcVolume();
		this.surface = this.calcSurface();
	}

	public Box(double h, double b, double t){
		this.hoehe = h;
		this.breite = b;
		this.tiefe = t;
		this.volume = this.calcVolume();
		this.surface = this.calcSurface();
	}

	public double getVolume() {
		return volume;
	}

	public void setVolume(double volume) {
		this.volume = volume;
	}

	public double getSurface() {
		return surface;
	}

	public void setSurface(double surface) {
		this.surface = surface;
	}

	public Box(Box b){
		this.breite = b.breite;
		this.hoehe = b.hoehe;
		this.tiefe = b.tiefe;
		this.volume = b.getVolume();
		this.surface = b.getSurface();
	}

	public boolean equals(Box b){
		if(b!=null && this.getVolume() == b.getVolume() && this.getSurface() == b.getSurface()){
			return true;
		}
		return false;
	}

	public void printInfo(){
		System.out.println("Breite\tHöhe\tTiefe\tVolumen\tOberfläche");
		System.out.println(this.breite + "\t" + this.hoehe + "\t" + this.tiefe + "\t" +this.getVolume()+ "\t" +this.getSurface());
		this.howManyTrucksDoINeed();
		this.howManyCartonDoINeed();
	}

	public double calcVolume(){
		return this.hoehe * this.breite * this.tiefe;
	}

	public double calcSurface(){
		return (2*(this.breite * this.tiefe))+(2*(this.breite * this.hoehe)+(2*(this.tiefe * this.hoehe)));
	}

	public void howManyTrucksDoINeed(){
		System.out.print("howManyTrucksDoINeed: ");
		System.out.println((int) Math.ceil(this.getVolume()/40000));
	}

	public void howManyCartonDoINeed(){
		System.out.print("howManyCartonDoINeed: ");
		int carton = (int) Math.ceil(this.getSurface()/1000);
		int weight = carton*1000;
		System.out.println(carton + " " + weight+"g");
	}

	public double getHoehe() {
		return hoehe;
	}
	public void setHoehe(double hoehe) {
		this.hoehe = hoehe;
	}
	public double getBreite() {
		return breite;
	}
	public void setBreite(double breite) {
		this.breite = breite;
	}
	public double getTiefe() {
		return tiefe;
	}
	public void setTiefe(double tiefe) {
		this.tiefe = tiefe;
	}
}
