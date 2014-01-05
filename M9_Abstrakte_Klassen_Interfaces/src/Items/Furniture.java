package Items;

public abstract class Furniture extends Item {
	
	private double width;
	private double height;
	private double depth;
	private String material;

	public Furniture(double p) {
		super(p);
		// TODO Auto-generated constructor stub
	}

	public Furniture(double d, double e, double f, String m) {
		// TODO Auto-generated constructor stub
		super(100);
		this.width = d;
		this.height = e;
		this.depth = f;
		this.material = m;
	}

	@Override
	public void getInfo() {
		// TODO Auto-generated method stub

	}
	
	public double getVolume(){
		return this.height * this.width * this.depth;
	}
	
	public double getArea(){
		return (2*(this.width * this.depth))+(2*(this.width * this.height)+(2*(this.depth * this.height)));
	}

}
