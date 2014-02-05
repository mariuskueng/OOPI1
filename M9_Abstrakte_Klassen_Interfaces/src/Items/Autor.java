package Items;

public class Autor {
	private String name;
	
	public Autor(String n){
		name= n;
	}
	
	public Autor(Autor a){
		this.name = a.name;
	}

	public String getName(){
		return name;
	}
}
