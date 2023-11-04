

//ques 3 = kth max and min element of an array
//using heapsort


package Array;

import java.util.Scanner;

public class Program3 {

    static void heapSort(int[] ar) {
        int n = ar.length;
        for (int i = n / 2 - 1; i >= 0; i--) {
            heapify(ar, n, i);
        }
        for (int i = n - 1; i > 0; i--) {
            int temp = ar[0];
            ar[0] = ar[i];
            ar[i] = temp;
            heapify(ar, i, 0);
        }
    }

    static void heapify(int[] ar, int n, int i) {
        int largest = i;
        int left = 2 * i + 1;
        int right = 2 * i + 2;

        if (left < n && ar[left] > ar[largest]) {
            largest = left;
        }
        if (right < n && ar[right] > ar[largest]) {
            largest = right;
        }
        if (largest != i) {
            int swap = ar[i];
            ar[i] = ar[largest];
            ar[largest] = swap;
            heapify(ar, n, largest);
        }
    }

    static int findKthSmallest(int[] ar, int k) {
        heapSort(ar);
        return ar[k - 1];
    }

    static int findKthLargest(int[] ar, int k) {
        heapSort(ar);
        return ar[ar.length - k];
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

        System.out.print("Enter the value of k: ");
        int k = scan.nextInt();

        System.out.println("Kth Smallest Element: " + findKthSmallest(ar, k));
        System.out.println("Kth Largest Element: " + findKthLargest(ar, k));
    }
}
