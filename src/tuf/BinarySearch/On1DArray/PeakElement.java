package tuf.BinarySearch.On1DArray;

import java.util.Scanner;

public class PeakElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of your array :");
        int size = sc.nextInt();
        int []array = new int[size];

        System.out.println("Enter the elements in your array :");
        for(int i=0;i<size;i++){
            array[i] = sc.nextInt();
        }

        int peak = getPeak(array);

        System.out.println("Peak Element index is : "+peak);
    }

    private static int getPeak(int[] array) {
        int low = 0, high = array.length - 1;

        // Binary search loop
        while (low < high) {
            // Find mid point
            int mid = (low + high) / 2;

            // If mid element is greater than next
            if (array[mid] > array[mid + 1]) {
                // Move to left half
                high = mid;
            } else {
                // Move to right half
                low = mid + 1;
            }
        }

        // Return peak index
        return low;
    }
}
