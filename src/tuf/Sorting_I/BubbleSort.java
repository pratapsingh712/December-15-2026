package tuf.Sorting_I;

import java.util.Arrays;
import java.util.Scanner;

public class BubbleSort {
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
        getBubbleSort(array);
        System.out.println(Arrays.toString(array));
    }

    private static void getBubbleSort(int[] array) {
        for(int i=array.length-1;i>=0;i--){
            for(int j=0;j<=i-1;j++){
                if(array[j]>array[j+1]){
                    int temp = array[j+1];
                    array[j+1] = array[j];
                    array[j] = temp;
                }
            }
        }
    }
}
