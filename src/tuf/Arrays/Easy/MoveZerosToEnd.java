package tuf.Arrays.Easy;

import java.util.Arrays;
import java.util.Scanner;

public class MoveZerosToEnd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of your array :");
        int size = sc.nextInt();
        int[] array = new int[size];

        for (int i = 0; i < size; i++) {
            array[i] = sc.nextInt();
        }

        moveZerosToEnd(array);

        System.out.println(Arrays.toString(array));
    }

    private static void moveZerosToEnd(int[] array) {
        int i=0,j=1;

        while(j<array.length && i<array.length){
            if(array[i]==0 && array[j]!=0){
                // swap
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
                i++;
            }
            if(array[i]!=0){
                i++;
            }
            if(array[j]==0){
                j++;
            }
        }
    }
}
