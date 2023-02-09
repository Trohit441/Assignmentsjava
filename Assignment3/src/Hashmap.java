/*Printing cube of 1 To 15 Numbers Using HashMap */

import java.util.HashMap;

public class Hashmap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer,Integer> Num=new HashMap<>();
		
		 for(int i=1;i<=15;i++) 
		 {
	            Num.put(i, i);		/*Loop for Adding Data in HashMap*/
	      }
	        for(int a:Num.keySet()) {
	            System.out.println(a+" "+Num.get(a)*Num.get(a)*Num.get(a));		/*Loop for Displaying Number And its Cube Combination*/
	        }

	}

}
