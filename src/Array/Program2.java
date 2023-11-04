package Array;

import java.util.Iterator;
import java.util.Scanner;

//Ques 2. find maximum and minimum element in an arrat
public class Program2 {
    
	static int findMax(int[] ar) {
		int max = ar[0];
		for(int i=0; i<ar.length-1;i++) {
			if(ar[i] > max) {
				max = ar[i];
			}
		}
		return max;
	}
	
	static int findMin(int[] ar) {
		int min = ar[0];
		for(int i=0; i<ar.length-1;i++) {
			if(ar[i] < min) {
				min = ar[i];
			}
		}
		return min;
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		int[]ar = new int[n];
		
		for (int i = 0; i < n; i++) {
			ar[i] = scan.nextInt();
		}
		
		 System.out.println(findMax(ar));
		 System.out.println(findMin(ar));
	}
}
