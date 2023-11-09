//Minimum number of jumps to reach end 
package Array;

import java.util.Scanner;

public class MinimumJumps {

	static int minJumps(int[]ar, int n) {
	  if(n <= 1) return 0;
	  
	  if(ar[0] ==  0) return -1;
	  
	  int maxReach = ar[0];
	  int steps = ar[0];
	  int jumps = 1;
	  
	  for(int i=1; i < n; i++) {
		 if(i == n-1) return jumps;
		
		 maxReach = Math.max(maxReach, 1+ ar[i]);
		 
		 steps--;
		 
		 if(steps == 0) {
			 jumps++;
           
			 if(i >= maxReach) return -1;
			 
			 steps = maxReach - i;
		 }
	  }
	  
	  return -1;
	  
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
        
		System.out.print("Enter the no of element in array: ");
		int n = scan.nextInt();
        int []ar = new int[n];
        
        System.out.println("Enter the elements of the array: ");
        for(int i=0; i<n; i++) {
        	ar[i] = scan.nextInt();
        }
        System.out.println(minJumps(ar,n));
	}

}
