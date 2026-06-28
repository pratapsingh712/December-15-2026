package tuf.Arrays.Easy;

import java.util.HashMap;
import java.util.Scanner;

public class LongestSumWithSum0 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of your array :");
        int size = sc.nextInt();
        int[] array = new int[size];

        for (int i = 0; i < size; i++) {
            array[i] = sc.nextInt();
        }

        longestSumSubarrayWith0(array,0);
    }

    private static void longestSumSubarrayWith0(int[] array, int key) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int sum = 0;
        int maxLen = 0;

        for(int i=0;i<array.length;i++){
            sum += array[i];

            if(sum==key){
                maxLen = Math.max(maxLen,i+1);
            }

            if(map.containsKey(sum-key)){
                int index = map.get(sum-key);
                maxLen = Math.max(maxLen,i-index);
            }

            if(!map.containsKey(sum)){
                map.put(sum,i);
            }
        }

        System.out.println("Maximum length of subarray with sum = 0! "+maxLen);
    }
}
