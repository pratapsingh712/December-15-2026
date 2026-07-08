package tuf.Arrays.Medium;

import java.util.Scanner;

public class CountSubarrayWithGivenSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of your array :");
        int size = sc.nextInt();
        int[] array = new int[size];

        // enter the elements into the array
        for(int i=0;i<size;i++){
            array[i] = sc.nextInt();
        }

        System.out.println("Please provide a sum you want to find :");
        int sum = sc.nextInt();

        getCountSubarrayWithGivenSum(array,sum);
    }

    private static void getCountSubarrayWithGivenSum(int[] array,int sum) {
        int count = 0;

        for(int i=0;i<array.length;i++){
            int subArraySum = 0;
            for(int j=i;j<array.length;j++){
                subArraySum += array[j];

                if(subArraySum==sum){
                    count++;
                }
            }
        }

        System.out.println("Total count of subarray with given sum = "+count);
    }
}
