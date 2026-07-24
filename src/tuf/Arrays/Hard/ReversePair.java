package tuf.Arrays.Hard;

import java.util.Scanner;

public class ReversePair {
    public static void main(String[] args) {
        // Count, Reverse Pairs are those pairs where i<j and arr[i]>2*arr[j].
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of your array :");
        int size = sc.nextInt();
        int []array = new int[size];

        for(int i=0;i<size;i++){
            array[i] = sc.nextInt();
        }

        getReversePair(array);
    }

    private static void getReversePair(int[] array) {
        int count = 0;

        for(int i=0;i<array.length;i++){
            for(int j=i+1;j<array.length;j++){
                if(array[i]>2*array[j]){
                    count++;
                }
            }
        }

        System.out.println("Total Reverse Pairs are = "+count);
    }
}
