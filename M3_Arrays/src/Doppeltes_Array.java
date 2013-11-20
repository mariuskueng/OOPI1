
public class Doppeltes_Array {

	public static void main(String[] args) {
		double[][] werte=
	          {
				{1.1,2.1,3.1,4.1,5.1},
				{1.2,2.2,3.2,4.2,5.2},
				{1.3,2.3,3.3,4.3,5.3},
				{1.4,2.4,3.4,4.4,5.4},
				{1.5,2.5,3.5,4.5,5.5}
			};

		for (int i=0; i<5; i++){

	        for (int j=1; j<6; j++){
	        	System.out.print(werte[0][j-1]+" ");
	          if (i==j){
//	             System.out.print(werte[i][j-1]+" ‐ ");
	          }
	        }
		}
	}

}
