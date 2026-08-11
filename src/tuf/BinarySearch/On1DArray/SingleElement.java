package tuf.BinarySearch.On1DArray;

import java.util.Scanner;

public class SingleElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of your array :");
        int size = sc.nextInt();
        int[] array = new int[size];

        System.out.println("Enter the elements in your array :");
        for (int i = 0; i < size; i++) {
            array[i] = sc.nextInt();
        }

        int single = getSingleCountElement(array);

        System.out.println("Single count element is : " + single);
    }

    private static int getSingleCountElement(int[] array) {
        int low = 0, high = array.length - 1, mid = 0, single = -1;

        while (low < high) {
            mid = low + (high - low) / 2;
            if (array[mid] != array[mid - 1] && array[mid] != array[mid + 1]) {
                single = array[mid];
                return single;
            }
            if ((mid % 2 == 1 && array[mid] == array[mid - 1]) ||
                    (mid % 2 == 0 && array[mid] == array[mid + 1])) {
                // Move to the right half
                low = mid + 1;
            }
            // If mid is in the right half (pairing broken earlier)
            else {
                // Move to the left half
                high = mid - 1;
            }
        }
        return single;
    }
}