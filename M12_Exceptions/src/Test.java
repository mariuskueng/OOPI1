public class Test{
	public static void main(String[] args){
		
		int[] list= new int[8];
		
		try{
			for (int i=0; i<list.length; i++){
				list[i]=i;
		}
		} catch (Exception ArrayIndexOutOfBoundsException){
			System.out.println("Die Ausnahme ArrayIndexOutOfBoundsException ist aufgetreten");
		}
		
		class Inner{
			int x;
		}
		Inner[] Innerlist = new Inner [8];
		
		for(int i=0; i<list.length; i++){
			if (Innerlist[i] != null){
				Innerlist[i].x=i;
			} else{
				Innerlist[i] = new Inner();
				Innerlist[i].x=i;
			}
		}
	}	
}