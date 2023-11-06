// Move all negetive numbers to beginning and positive to end with constant extra spaces


package Array;

import java.util.Scanner;

public class Rearrange {

	static void rearrange(int[] ar) {
	    int left = 0;
	    int right = ar.length - 1;

	    while (left <= right) {
	        while (left <= right && ar[left] < 0) {
	            left++;
	        }
	        while (left <= right && ar[right] > 0) {
	            right--;
	        }
	        if (left <= right) {
	            int temp = ar[left];
	            ar[left] = ar[right];
	            ar[right] = temp;
	            left++;
	            right--;
	        }
	    }
	}

	
	public static void main(String[] args) {
	  Scanner scan = new Scanner(System.in);
      int n = scan.nextInt();
      int[] ar = new int[n];
      
      for(int i=0; i<n; i++) {
    	  ar[i] = scan.nextInt();
      }
      
      for(int i=0; i<n; i++) {
    	 System.out.print(ar[i]+ " ");
      }
      System.out.println();
      rearrange(ar);
      for(int i=0; i<n; i++) {
     	 System.out.print(ar[i]+ " ");
       }
      System.out.println();
	}
}
