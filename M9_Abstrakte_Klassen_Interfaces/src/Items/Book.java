package Items;

public class Book extends Item {
	
	private Autor a;
	private String string;
	private String string2;

	public Book(double p) {
		super(p);
		// TODO Auto-generated constructor stub
	}

	public Book(Autor a, String string, String string2, double d) {
		// TODO Auto-generated constructor stub
		super(d);
		this.a = a;
		this.string = string;
		this.string2 = string2;
	}

	@Override
	public void getInfo() {
		System.out.println(a + " - " + string + string + " kostet " + this.getPrize());

	}

}
