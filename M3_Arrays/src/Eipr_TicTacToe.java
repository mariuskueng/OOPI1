import java.util.Scanner;

public class Eipr_TicTacToe {

	public static Scanner s = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[][] playground = new char[3][3];
		int spieler = 1;
		boolean gameover = false;
		int spalte;
		int zeile;

		// clear playground
		for(int i=0;i<3;i++){
			for(int x=0;x<3;x++){
				playground[i][x] = ' ';
			}
		}


		do{

			//output
			System.out.println("  1  2  3");
			for(int i=0;i<3;i++){
				System.out.print(i+1 + ":");
				for(int x=0;x<3;x++){
					System.out.print(playground[i][x] + "|");
				}
				System.out.println();
			}

			//player input

			System.out.println("Spieler " + spieler);
			System.out.println("Zeile eingeben (1/2/3):");
			zeile = s.nextInt();
			System.out.println("Spalte eingeben (1/2/3):");
			spalte = s.nextInt();

			if((spalte >= 0 && spalte <= 3) && (zeile >= 0 && zeile <= 3) && (playground[zeile-1][spalte-1] == ' ')){

				if(spieler == 1){
					playground[zeile-1][spalte-1] = 'x';
				} else{
					playground[zeile-1][spalte-1] = 'o';
				}

				//output
				System.out.println("  1  2  3");
				for(int i=0;i<3;i++){
					System.out.print(i+1 + ":");
					for(int x=0;x<3;x++){
						System.out.print(playground[i][x] + "|");
					}
					System.out.println();
				}

				//check match horizontally
				for(int i=0;i<3;i++){

					char left = playground[i][0];
					char middle = playground[i][1];
					char right = playground[i][2];

					if((left != ' ' )&& (middle != ' ' )&& (right != ' ' )&& (left == middle) && (left == right)){
						gameover = true;
						System.out.println("Spieler "+ spieler + " hat gewonnen!");
					}
				}
				//check match vertically
				for(int i=0;i<3;i++){

					char left = playground[0][i];
					char middle = playground[1][i];
					char right = playground[2][i];

					if((left != ' ' )&& (middle != ' ' )&& (right != ' ' )&& (left == middle) && (left == right)){
						gameover = true;
						System.out.println("Spieler "+ spieler + " hat gewonnen!");
					}
				}
				//check match diagonally

					char left = playground[0][0];
					char middle = playground[1][1];
					char right = playground[2][2];

					if((left != ' ' )&& (middle != ' ' )&& (right != ' ' )&& (left == middle) && (left == right)){
						gameover = true;
						System.out.println("Spieler "+ spieler + " hat gewonnen!");
					}

					left = playground[2][0];
					middle = playground[1][1];
					right = playground[0][2];

					if((left != ' ' )&& (middle != ' ' )&& (right != ' ' )&& (left == middle) && (left == right)){
						gameover = true;
						System.out.println("Spieler "+ spieler + " hat gewonnen!");
					}


				//change player name for next move
				if(spieler == 1){
					spieler = 2;
				} else{
					spieler = 1;
				}
		} else{
			System.out.println("Dieses Feld ist schon besetzt oder es existiert nicht! Bitte wŠhle ein neues Feld!");
			continue;
		}

		} while(gameover == false);


	}

}
