package tuf.Arrays.Easy;

import java.util.Scanner;

public class FindMissingElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of your array :");
        int size = sc.nextInt();
        int[] array = new int[size];

        for(int i=0;i<size;i++){
            array[i] = sc.nextInt();
        }

        getMissing(array);
    }

    private static void getMissing(int[] array) {
        // get length
        // calculate actual sum for length n
        // calculate actual sum for n-1
        // sum-sumofn-1;

        int sum = 0;
        for(int i=0;i<array.length;i++){
            sum += array[i];
        }
        int n = array.length+1;
        int realSum = n*(n+1)/2;

        System.out.println("Missing element from array is : "+(realSum-sum));
    }
}
