
public class Eipr_Bowling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] resultate = new int[3][5];
		int[] summen = new int[3];
		
		resultate[0][0] = 4;
		resultate[0][1] = 2;
		resultate[0][2] = 10;
		resultate[0][3] = 3;
		resultate[0][4] = 6;
		
		resultate[1][0] = 6;
		resultate[1][1] = 8;
		resultate[1][2] = 2;
		resultate[1][3] = 4;
		resultate[1][4] = 8;
		
		resultate[2][0] = 2;
		resultate[2][1] = 0;
		resultate[2][2] = 5;
		resultate[2][3] = 5;
		resultate[2][4] = 10;
		
		for(int i = 0; i<3; i++){
			for(int x=0;x<5;x++){
				summen[i] += resultate[i][x];
			}
		}
		
		for(int i = 0; i<3; i++){
			System.out.println("Spieler " + (i+1) + "="+ summen[i]);
		}
	}

}
