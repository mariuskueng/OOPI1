import java.util.Scanner;

public class Tutorial_3 {
	public static Scanner s = new Scanner(System.in);

	public static void main(String[] args) {
		/*
		System.out.println("Speicherplätze des Arrays eingeben:");

		char[][] meinArray = new char [5][5];
		meinArray[0][0] = ' ';
		meinArray[0][1] = ' ';
		meinArray[0][2] = 'X';
		meinArray[0][3] = ' ';
		meinArray[0][4] = ' ';

		meinArray[1][0] = ' ';
		meinArray[1][1] = 'X';
		meinArray[1][2] = ' ';
		meinArray[1][3] = 'X';
		meinArray[1][4] = ' ';

		meinArray[2][0] = 'X';
		meinArray[2][1] = 'X';
		meinArray[2][2] = 'X';
		meinArray[2][3] = 'X';
		meinArray[2][4] = 'X';

		meinArray[3][0] = 'X';
		meinArray[3][1] = ' ';
		meinArray[3][2] = ' ';
		meinArray[3][3] = ' ';
		meinArray[3][4] = 'X';

		meinArray[4][0] = 'X';
		meinArray[4][1] = ' ';
		meinArray[4][2] = ' ';
		meinArray[4][3] = ' ';
		meinArray[4][4] = 'X';

		for(int i=0;i<5;i++){
			for(int j=0;j<5;j++){
				System.out.print(meinArray[i][j]);
			}
			System.out.println("");
		}*/

		char [][] brett = new char[3][3];

		brett[0][0] = '3';
		brett[0][1] = '4';
		brett[0][2] = ' ';

		brett[1][0] = '7';
		brett[1][1] = '8';
		brett[1][2] = '5';

		brett[2][0] = '2';
		brett[2][1] = '1';
		brett[2][2] = '6';

		System.out.println(" S 1 2 3");
		System.out.println("Z -------");
		for(int i=0;i<3;i++){
			System.out.print(i+1 + "| ");
			for(int j=0;j<3;j++){
				System.out.print(brett[i][j] + " ");
			}
			System.out.println("");
		}

		int zug_zeile = 0;

		while(zug_zeile != 9){
			System.out.println("Welches Feld möchten Sie verschieben?");
			System.out.println("Zeile (9 für Abbruch):");
			zug_zeile = s.nextInt(); //1
			System.out.println("Spalte:");
			int zug_spalte = s.nextInt(); //2

			int leer_zeile = 0;
			int leer_spalte = 2;

			brett[zug_zeile-1][zug_spalte] = brett[zug_zeile-1][zug_spalte-1];
			brett[zug_zeile-1][zug_spalte-1] = ' ';

			leer_zeile = zug_zeile;
			leer_spalte = zug_spalte;

			System.out.println(" Z 1 2 3");
			System.out.println("S -------");
			for(int i=0;i<3;i++){
				System.out.print(i+1 + "| ");
				for(int j=0;j<3;j++){
					System.out.print(brett[i][j] + " ");
				}
				System.out.println("");
			}
		}
	}

}
