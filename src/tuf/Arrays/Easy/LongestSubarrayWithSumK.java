package tuf.Arrays.Easy;

import java.util.HashMap;
import java.util.Scanner;

public class LongestSubarrayWithSumK {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of your array :");
        int size = sc.nextInt();
        int[] array = new int[size];

        for (int i = 0; i < size; i++) {
            array[i] = sc.nextInt();
        }

        System.out.println("Enter the key Sum you want to find :");
        int key = sc.nextInt();

        longestSumSubarrayWithK(array,key);
    }

    private static void longestSumSubarrayWithK(int[] array, int key) {
        HashMap<Integer,Integer> firstIndexOfPrefix = new HashMap<>();
        int sum = 0;
        int maxLen = 0;

        for(int i=0;i<array.length;i++){
            sum += array[i];

            if(sum==key){
                maxLen = Math.max(maxLen,i+1);
            }

            if(firstIndexOfPrefix.containsKey(sum-key)){
                int prevIndex = firstIndexOfPrefix.get(sum-key);
                maxLen = Math.max(maxLen,i-prevIndex);
            }

            if(!firstIndexOfPrefix.containsKey(sum)){
                firstIndexOfPrefix.put(sum,i);
            }
        }

        System.out.println("Maximum subarray length with sum = "+key+" is "+maxLen);
    }
}
