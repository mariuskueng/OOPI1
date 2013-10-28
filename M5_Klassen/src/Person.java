
public class Person {

	private String name;
	private String vorname;
	private String adresse;
	private int personalnummer;
	private boolean geschlecht;
	
	public Person(String name, String vorname, String adresse,
			int personalnummer, boolean geschlecht){
		this.name = name;
		this.vorname = vorname;
		this.adresse = adresse;
		this.personalnummer = personalnummer;
		this.geschlecht = geschlecht;
	}
	
	public Person(Person p){
		this.name = p.name;
		this.vorname = p.vorname;
		this.adresse = p.adresse;
		this.personalnummer = p.personalnummer;
		this.geschlecht = p.geschlecht;
	}
	
	public boolean equals(Person p){
		if(this.personalnummer == p.personalnummer){
			return true;
		}
		return false;
	}
	
	public void printInfo(){
		System.out.println(this.getVorame()+" "+this.getName());
		System.out.println(this.getAdresse());
		System.out.println(this.getPersonalnummer());
		System.out.print("Geschlecht: ");
		if(this.isGeschlecht()){
			System.out.println("weiblich");
		}
		else{
			System.out.println("männlich");
		}
	}
	
	public static void main(String[] args) {
		
		Person abc = new Person("Küng","Marius", "Basel", 1234, false);
		abc.printInfo();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getVorame() {
		return vorname;
	}

	public void setVorame(String vorname) {
		this.vorname = vorname;
	}

	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	public int getPersonalnummer() {
		return personalnummer;
	}

	public void setPersonalnummer(int personalnummer) {
		this.personalnummer = personalnummer;
	}

	public boolean isGeschlecht() {
		return geschlecht;
	}

	public void setGeschlecht(boolean geschlecht) {
		this.geschlecht = geschlecht;
	}

}
