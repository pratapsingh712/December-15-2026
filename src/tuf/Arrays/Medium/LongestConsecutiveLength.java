package tuf.Arrays.Medium;

import java.util.Arrays;
import java.util.Scanner;

public class LongestConsecutiveLength {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of your array :");
        int size = sc.nextInt();
        int[] array = new int[size];
        for(int i=0;i<size;i++){
            array[i] = sc.nextInt();
        }

        getLengthOfLongestConsecutiveIntegers(array);
    }

    private static void getLengthOfLongestConsecutiveIntegers(int[] array) {
        Arrays.sort(array);
        int count = 1;
        int maxCount = 0;
        for(int i=1;i<array.length;i++){
            int num = array[i-1];
            if(num==(array[i]-1)){
                count++;
                maxCount = Math.max(count,maxCount);
            }else{
                count = 1;
            }
        }

        System.out.println("Maximum consecutive length = "+maxCount);
    }
}
