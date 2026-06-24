package tuf.Sorting_I;

import java.util.Arrays;
import java.util.Scanner;

public class InsertionSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of your array :");
        int size = sc.nextInt();
        int[] array = new int[size];

        for(int i=0;i<size;i++){
            array[i] = sc.nextInt();
        }

        System.out.println("Before sorting the array :");
        System.out.println(Arrays.toString(array));

        System.out.println("After sorting the array :");
        getInsertionSort(array);
        System.out.println(Arrays.toString(array));
    }

    private static void getInsertionSort(int[] nums) {
        for (int i = 1; i < nums.length; i++) {
            int key = nums[i]; // Current element as key
            int j = i - 1;

            // Shift elements that are greater than key by one position
            while (j >= 0 && nums[j] > key) {
                nums[j + 1] = nums[j];
                j--;
            }
            nums[j + 1] = key;
        }
    }
}
