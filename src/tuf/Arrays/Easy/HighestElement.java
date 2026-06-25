package tuf.Arrays.Easy;

import java.util.Arrays;
import java.util.Scanner;

public class HighestElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of your array :");
        int size = sc.nextInt();
        int[] array = new int[size];

        for(int i=0;i<size;i++){
            array[i] = sc.nextInt();
        }

        int max = array[0];

        System.out.println("Maximum element in the array is :"+getMaximum(array,max));
    }

    private static int getMaximum(int[] array, int max) {
        for(int i=0;i<array.length;i++){
            if(array[i]>max){
                max = array[i];
            }
        }
        return max;
    }
}
