package Array;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FindDuplicates {

	    public List<Integer> findDuplicates(int[] ar){
	    	List<Integer> result = new ArrayList<>();
	    	for(int i=0; i<ar.length; i++) {
	    		int index = Math.abs(ar[i])-1;
	    		if(ar[index] < 0) {
	    			result.add(Math.abs(ar[i]));
	    		}else {
	    			ar[index] = -ar[index];
	    		}
	    	}
	    	return result;
	    }
	    
		public static void main(String[] args) {
			FindDuplicates findDuplicates = new FindDuplicates();
			Scanner scan = new Scanner(System.in);
	        
			System.out.print("Enter the no of element in array: ");
			int n = scan.nextInt();
	        int []ar = new int[n];
	        
	        System.out.println("Enter the elements of the array: ");
	        for(int i=0; i<n; i++) {
	        	ar[i] = scan.nextInt();
	        }
	        List<Integer> duplicates = findDuplicates.findDuplicates(ar);
		    
	        if(duplicates.isEmpty()) {
	        	System.out.println("No duplicates found. ");
	        }else {
	        	System.out.println("Duplicates in the array: " + duplicates);
	        }
		}

	}


