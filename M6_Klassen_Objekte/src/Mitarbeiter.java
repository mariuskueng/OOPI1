
public class Mitarbeiter {

	private double salary;
	private int position; //1=Vorstand, 2=Kader, 3=normale Angestellte


	public Mitarbeiter(int position){
		this.position = position;

		switch(this.position){
			case 1:
				this.salary = 150000+Math.random()*240000; //randomNum = minimum + (int)(Math.random()*maximum);
				break;

			case 2:
				this.salary = 90000+Math.random()*150000;
				break;

			case 3:
				this.salary = 60000+Math.random()*90000;
				break;
		}
	}

	public Mitarbeiter(Mitarbeiter m){
		this.position = m.position;
		this.salary = m.salary;
	}

	public double getSpace(){
		return 10+(this.salary/10000);
	}

	public boolean equals(Mitarbeiter m){
		if(this.position == m.position && this.salary == m.salary){
			return true;
		}
		return false;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public int getPosition() {
		return position;
	}

	public void setPosition(int position) {
		this.position = position;
	}

}
