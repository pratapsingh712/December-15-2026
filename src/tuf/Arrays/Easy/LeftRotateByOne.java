package tuf.Arrays.Easy;

import java.util.Arrays;
import java.util.Scanner;

public class LeftRotateByOne {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of your array :");
        int size = sc.nextInt();
        int[] array = new int[size];

        for (int i = 0; i < size; i++) {
            array[i] = sc.nextInt();
        }

        leftRotateByOne(array);
    }

    private static void leftRotateByOne(int[] array) {
        int first = array[0];
        int n = array.length;

        for(int i=1;i<array.length;i++){
            array[i-1] = array[i];
        }

        array[n-1] = first;

        System.out.println("After left rotating by one :"+"\n"+ Arrays.toString(array));
    }
}
