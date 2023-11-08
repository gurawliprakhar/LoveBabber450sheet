//Ques - Minimize the maximum difference between the heights
package Array;

import java.util.Arrays;
import java.util.Scanner;

public class MinimizeMaxDifference {

	static int getMinDiff(int[]ar, int n, int k) {
		if(n==1) return 0;
		
		Arrays.sort(ar);
		
		int ans = ar[n-1] - ar[0];
		
		int small = ar[0] + k;
		int big = ar[n-1] - k;
		
		if(small > big) {
			int temp = small;
			small = big;
			big = temp;
		}
		
		for(int i=1; i<n-1; i++) {
			int subtract =  ar[i]-k;
			int add = ar[i]+k;
			
			if(subtract >= small || add <= big) continue;
			
			if(big - subtract <= add - small)small = subtract;
			else big = add;
		}
		
		return Math.min(ans,  big - small);
	}
	
	public static void main(String[] args) {
	  Scanner scan = new Scanner(System.in);
      
	  System.out.print("Enter the number of towers: ");
	  int n = scan.nextInt();
	  int[]ar = new int[n];
	  
	  for(int i=0; i<n; i++) {
		  ar[i] = scan.nextInt();
	  }
	  System.out.print("Enter the value of k");
	  int k = scan.nextInt();
	  System.out.println(getMinDiff(ar,n,k));
	}

}
