/* find Union and Intersection of two unsorted array 
 */

package Array;

import java.util.HashSet;
import java.util.Scanner;

public class IntersectionNdUnion {

	static void printUnionIntersection(int[]ar1, int[]ar2) {
		
		HashSet<Integer> set = new HashSet<>();
		HashSet<Integer> intersectionSet =  new HashSet<>();
		
		for(int i : ar1) {
			set.add(i);
		}	
		
		System.out.print("Union: ");
		for(int i: ar2) {
			if(!set.contains(i)) {
				set.add(i);
			}else {
				intersectionSet.add(i);
			}
		}
		
		for(int i : set) {
			System.out.print( i+ " ");
		}
		
		System.out.println();
		
		System.out.print("Intersection: ");
		
		for(int i: intersectionSet) {
			System.out.print(i + " ");
		}
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
         
		System.out.println("Enter the size of first Array:");
		int n1 = scan.nextInt();
		int[] ar1 = new int[n1];
		
		System.out.println("Enter the element of first array:");
		for (int i = 0; i < n1; i++) {
			ar1[i] = scan.nextInt();
		}
		
		System.out.println("Enter the size of Second Array:");
		int n2 = scan.nextInt();
		int[] ar2 = new int[n2];
		
		System.out.println("Enter the element of Second array:");
		for (int i = 0; i < n2; i++) {
			ar2[i] = scan.nextInt();
		}
	
	     printUnionIntersection(ar1, ar2);
	}
}
