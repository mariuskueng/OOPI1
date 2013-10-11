
public class Bubble_Sort {

	public static void main(String[] args) {

		int[] values = {7,4,3,1,9,2};
		int itemLeft, itemRight = 0;
		
		for(int i=0;i<values.length-1;i++){
			itemLeft = values[i];
			
			if(i+1<values.length){
				itemRight = values[i+1];
			}
			
			if(itemLeft > itemRight){
				values[i] = itemRight;
				values[i+1] = itemLeft;
			}
			
			System.out.println(values[i]);
		}
	
	}

}
