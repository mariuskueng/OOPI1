
public class Boxfactory {
	
	public static void main(String[] args){
		
		Box boxen [] = new Box[100];
		
		for (int i = 0; i < boxen.length; i++) {
			
			if( i < 10){
				boxen[i] = new Box(1, 1, 1);
			}
			
			else if( i >= 10 && i < 80){
				int random1 = (int)(Math.random()*100)+1;
				int random2 = (int)(Math.random()*100)+1;
				int random3 = (int)(Math.random()*100)+1;
				boxen[i] = new Box(random1, random2, random3);
			}
			
			else{
				boxen[i] = new Box(boxen[i-10]);
			}
			
			System.out.println("Box "+(i+1));
			boxen[i].printInfo();
			System.out.println();
		}
	}
}
