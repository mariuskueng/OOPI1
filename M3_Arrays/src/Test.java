
public class Test {
	public static void main(String[] args){
		int[] zahlen = new int[10];

		for(int i = 9; i>0; i--){
			zahlen[i]= i;
			System.out.println(i+": "+zahlen[i]);
		}
		System.out.println();
	}
}
