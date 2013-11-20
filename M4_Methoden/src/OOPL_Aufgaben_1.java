
public class OOPL_Aufgaben_1 {

	public static void main(String[] args) {

		ausgeben();
		ausgeben(3);
   		ausgeben(3,4);
	}

	public static void ausgeben(){
		for(int i=0;i<4;i++){
			System.out.println("####");
		}
	}
	public static void ausgeben(int k){
		for(int i=0;i<k;i++){
			System.out.println("####");
		}
	}
	public static void ausgeben(int k, int h){
		for(int i=0;i<k;i++){
			for(int x=0;x<h;x++){
				System.out.print("#");
			}
			System.out.println();
		}
	}


}
