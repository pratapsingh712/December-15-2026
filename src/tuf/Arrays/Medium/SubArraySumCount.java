package tuf.Arrays.Medium;

import java.util.Scanner;

public class SubArraySumCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of your array :");
        int size = sc.nextInt();
        int[] array = new int[size];
        for(int i=0;i<size;i++){
            array[i] = sc.nextInt();
        }

        System.out.println("Enter the sum you want to find :");
        int key = sc.nextInt();

        getSubArraySumCount(array,key);
    }

    private static void getSubArraySumCount(int[] array,int key) {
        int count = 0;

        for(int i=0;i<array.length;i++){
            int sum = 0;
            for(int j=i;j<array.length;j++){
                sum += array[j];
                if(sum==key){
                    count++;
                    break;
                }
            }
        }

        System.out.println("Total subarray with sum = "+count);
    }
}
