
public class Aufgabe_3_Paarsuche {
	public static void main(String[] args) {
		int[] values= {189,167,134,109,103,91,98,85,76,50,49,48,44,23} ;
	     int diff = 0;

	     // suche die diff

	     for (int i=0; i<values.length; i++){
	    	 for (int x=1; x<values.length; x++){
	    		 diff = values[i] - values[x];
	    		 if(diff == 6){
	    			 System.out.println(values[i] +"/" + values[x]);
	    		 }
	  	     }
		 }
	}
}
