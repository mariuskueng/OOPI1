
public class Aufgabe_2_Minimum {

	public static void main(String[] args) {
		int[] values = {7,3,5,9,4,1,7,2,9,1,39};

//		 suche das Minimum Easy way
//		java.util.Arrays.sort( values );
//
//		int min = values[0];
//		System.out.println(min);

		int min = values[0];
		int max = values[0];

		for(int i=1; i<values.length; i++){ // 1 das mit dem 2ten Element begonnen wird

			if(values[i] < min){
				min = values[i];
			}
			if(values[i] > max){
				max = values[i];
			}
		}
		System.out.println("Minimum: " + min);
		System.out.println("Maximum: " + max);
	}

}
