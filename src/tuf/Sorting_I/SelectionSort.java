package tuf.Sorting_I;

import java.util.Arrays;
import java.util.Scanner;

public class SelectionSort {
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
        getSelectionSort(array);
        System.out.println(Arrays.toString(array));
    }

    private static void getSelectionSort(int[] array) {
        for(int i=0;i<array.length;i++){

            for(int j=i+1;j<array.length;j++){
                if(array[i]>array[j])
                {
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
    }
}
