//ques-Find Largest sum contiguous Subarray

package Array;

import java.util.Scanner;

public class MaximumSubArray {

	static int maxSubArray(int[] ar) {
	  int maxSum = ar[0];
	  int currentSum = ar[0];
	  
	  for (int i = 0; i < ar.length; i++) {
		currentSum = Math.max(ar[i], currentSum + ar[i]);
		maxSum = Math.max(maxSum, currentSum);
	 }
	  return maxSum;
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the size of an Array");
	    int n = scan.nextInt();
	    int[] ar = new int[n];
	    System.out.println("Enter the element of the Array");
	    for(int i=0; i<n; i++) {
	    	ar[i] = scan.nextInt();
	    }
	    System.out.print(maxSubArray(ar));
	}

}
