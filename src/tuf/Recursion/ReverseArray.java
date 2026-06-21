package tuf.Recursion;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of your array :");
        int size = sc.nextInt();
        int[] array = new int[size];

        for(int i=0;i<size;i++){
            array[i] = sc.nextInt();
        }

        System.out.println("Before Reversing the array :"+ Arrays.toString(array));

        System.out.print("After reversing the array :[");

        getReverse(array,0);

        System.out.print("]");
    }

    private static void getReverse(int[] array, int i) {
        if(i==array.length-1){
            System.out.print(array[i]+", ");
            return;
        }

        getReverse(array,i+1);

        System.out.print(array[i]+", ");
    }
}
