
public class Firma {
	
	public static void main(String[] args) {
		
		Mitarbeiter mitarbeiter[] = new Mitarbeiter[100];
		
		for (int i = 0; i < 10; i++) {
			mitarbeiter[i] = new Mitarbeiter(1);
		}
		
		for (int i = 0; i < 30; i++) {
			mitarbeiter[i+10] = new Mitarbeiter(2);
		}
		
		for (int i = 0; i < 60; i++) {
			mitarbeiter[i+40] = new Mitarbeiter(3);
		}
		
		double officeSpace = 0;
		for (int i = 0; i < mitarbeiter.length; i++) {
			officeSpace += mitarbeiter[i].getSpace();
		}
		
		double yearSalary = 0;
		for (int i = 0; i < mitarbeiter.length; i++) {
			yearSalary += mitarbeiter[i].getSalary();
		}
		
		System.out.println("BŸroflŠche:\t"+officeSpace);
		System.out.println("Jahresgehalt:\t"+yearSalary);
	}

}
