package Array;

import java.util.Scanner;

public class MergeSortedArray {

	static void mergeSortedArray(int[] ar1, int[] ar2, int[] res) {
	  
		int i=0, j=0, k=0;
		while( i < ar1.length &&  j < ar2.length) {
		   if(ar1[i] <= ar2[j]) {
			   res[k++] = ar1[i++];
		   }else {
			   res[k++] = ar2[j++];
		   }
	   }
		
		while(i < ar1.length) {
			res[k++] = ar1[i++];
		}
		
		while(j < ar2.length) {
			res[k++] = ar2[j++];
		}
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter the size of the first sorted array");
         
		int n1 = scan.nextInt();
		int[] ar1 = new int[n1];
		System.out.println("Enter the element in first array");
		for(int i=0; i<n1; i++) {
		   ar1[i] = scan.nextInt();
		}
		
		System.out.print("Enter the size of the Second sorted array");
		int n2 = scan.nextInt();
		int[] ar2 = new int[n1];
		System.out.println("Enter the element in Second array");
		for(int i=0; i<n2; i++) {
		  ar2[i] = scan.nextInt();
		}
		
		int[] res = new int [n1 + n2];
		mergeSortedArray(ar1, ar2, res);
		
		System.out.println("Merged Sorted Array");
		
		for(int merged : res) {
			System.out.print(merged + " ");
		}
	}
 
}
