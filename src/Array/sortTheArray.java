//ques - sort an array of 0s, 1s and 2s | dutch national flag


package Array;

import java.util.Scanner;

public class sortTheArray {

	static void sortColors(int[] ar) {
		int start =  0;
		int mid = 0;
		int end = ar.length;
		
		while(mid <= end) {
			
		  switch(ar[mid]) {
			case 0:
			   swap(ar, start, mid);
				 mid++;
				 start++;
				 break;
			
			case 1:
				mid++;
				break;
				
			case 2:
			    swap(ar,mid,end);
			    end--;
			    break;
			}
		}
	}
	
	static void swap(int[] arr, int pos1, int pos2) {
		int temp = arr[pos1];
		arr[pos1] = arr[pos2];
		arr[pos2] = temp;
		
	}
	
	public static void main(String[] args) {
		
		 Scanner scan = new Scanner(System.in);
	        System.out.print("Enter the size of the array: ");
	        int n = scan.nextInt();
	        int[] ar = new int[n];

	        System.out.println("Enter the elements of the array:");
	        for (int i = 0; i < n; i++) {
	            ar[i] = scan.nextInt();
	        }
	        sortColors(ar);
	        
	        for (int i = 0; i < ar.length; i++) {
				System.out.println(ar[i]+ " ");
			}
	}

}
