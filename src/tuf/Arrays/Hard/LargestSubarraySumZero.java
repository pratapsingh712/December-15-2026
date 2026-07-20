package tuf.Arrays.Hard;

import java.util.Scanner;

public class LargestSubarraySumZero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of your array :");
        int size = sc.nextInt();
        int array[] = new int[size];

        for(int i=0;i<size;i++){
            array[i] = sc.nextInt();
        }

        getMaximumLengthSubarrayWithSumZero(array);
    }

    private static void getMaximumLengthSubarrayWithSumZero(int[] array) {
        int max = 0;
        int sum;

        for(int i=0;i<array.length;i++){
            sum = 0;
            for(int j=i;j<array.length;j++){
                sum += array[j];
                if(sum==0){
                    max = Math.max(max,(j-i)+1);
                }
            }
        }

        System.out.println("Maximum subarray length with sum 0 = "+max);
    }
}
