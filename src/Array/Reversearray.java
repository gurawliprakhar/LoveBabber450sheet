package Array;//no issue in using but use lowercase to follow convention

import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;

//Ques 1- reverse an array

public class Reversearray {

	static void reverseArray(int[] ar) {
		
		for (int i = 0; i < ar.length/2; i++) {
			int temp = ar[i];
			ar[i] = ar[ar.length-1-i];
			ar[ar.length-1-i] = temp; 
		}
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		int[] ar = new int[n];
		
		for (int i = 0; i < n; i++) {
			ar[i] = scan.nextInt();
		}
		
		for(int i=0; i<n; i++) {
			System.err.print(ar[i] + " ");
		}
		reverseArray(ar);
		
		System.out.println();
		
		for(int i=0; i<n; i++) {
			System.err.print(ar[i] + " ");
		}

	}

}
