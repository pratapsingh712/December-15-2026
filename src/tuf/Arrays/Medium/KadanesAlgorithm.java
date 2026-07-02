package tuf.Arrays.Medium;

import java.util.Scanner;

public class KadanesAlgorithm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of your array :");
        int size = sc.nextInt();
        int[] array = new int[size];

        // enter the elements into the array
        for(int i=0;i<size;i++){
            array[i] = sc.nextInt();
        }

        int element = getMaxSumSubarray(array);

        System.out.println("The maximum sum is : "+element);
    }

    private static int getMaxSumSubarray(int[] array) {
        int currentSum = array[0];
        int maxSum = array[0];

        for(int i=1;i<array.length;i++){
            currentSum = Math.max(array[i],array[i]+currentSum);

            maxSum = Math.max(maxSum,currentSum);
        }

        return maxSum;
    }
}
