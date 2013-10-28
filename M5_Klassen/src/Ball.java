
public class Ball {
	
	double radius;
	final double MEIN_PI = 3.1415;
	
	public Ball(){
		this.radius = 1;
	}
	
	public Ball(double radius){
		this.radius = radius;
	}
	
	public Ball(Ball b){
		this.radius = b.radius;
	}
	
	public void printInfo(){
		System.out.println("Radius: "+this.getRadius());
		System.out.println("Volumen: "+this.getVolume());
		System.out.println("Oberfläche: "+this.getSurface());
		System.out.println();
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	public double getVolume(){
		return (this.MEIN_PI*Math.pow(this.radius,3))/6;
	}
	
	public double getSurface(){
		return this.MEIN_PI*Math.pow(this.radius*2, 2);
	}
}
