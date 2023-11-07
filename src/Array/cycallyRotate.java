//ques - Given an array, the task is to cyclically rotate the array clockwise by one time. 

package Array;

import java.util.Scanner;

public class cycallyRotate {

	static void rotateArrayByOne(int[] ar) {
		int last = ar[ar.length-1];
		for(int i=ar.length-1; i>0 ; i--) {
			ar[i] = ar[i-1];
		}
		ar[0] = last ;
	}
	 
	public static void main(String[] args) {
	
		Scanner scan = new Scanner(System.in);
		 
		int n = scan.nextInt();
		int[]ar = new int[n];
		
		for (int i = 0; i < n; i++) {
			ar[i] = scan.nextInt();
		}
		
       rotateArrayByOne(ar);
       System.out.println("Array after rotating one by one");
	    
       for(int i=0; i < ar.length; i++) {
    	   System.out.print(ar[i]+ " ");
       }
	
	}

}
