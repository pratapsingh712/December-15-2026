package tuf.Arrays.Hard;

import java.util.Scanner;

public class MaximumProductSubarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of your array :");
        int size = sc.nextInt();
        int array[] = new int[size];

        for(int i=0;i<size;i++){
            array[i] = sc.nextInt();
        }

        getMaximumProductSubarray(array);
    }

    private static void getMaximumProductSubarray(int[] array) {
        int maximum = 0;
        int sum;

        for(int i=0;i<array.length;i++){
            sum = 1;
            for(int j=i;j<array.length;j++){
                sum *= array[j];
                maximum = Math.max(sum,maximum);
            }
        }

        System.out.println("Maximum product subarray = "+maximum);
    }
}
