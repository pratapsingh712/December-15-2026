package tuf.Arrays.Medium;

import java.util.Scanner;

public class KadanesAlgorithmPrint {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of your array :");
        int size = sc.nextInt();
        int[] array = new int[size];
        for(int i=0;i<size;i++){
            array[i] = sc.nextInt();
        }


        printMaxSubarray(array);
    }

    private static void printMaxSubarray(int[] array) {
        int currMax = array[0];
        int maxElement = array[0];

        for(int i=0;i<array.length;i++){
            currMax = Math.max(currMax, currMax+array[i]);

            maxElement = Math.max(currMax,maxElement);
        }

        System.out.println("Maximum Sum subarray is : "+maxElement);
    }
}
