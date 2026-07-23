package tuf.Arrays.Hard;

import java.util.Scanner;

public class CountInversion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of your array :");
        int size = sc.nextInt();
        int array[] = new int[size];

        for(int i=0;i<size;i++){
            array[i] = sc.nextInt();
        }

        getInversionCount(array);
    }

    private static void getInversionCount(int[] array) {
        int count = 0;

        for(int i=0;i<array.length;i++){
            for(int j=i+1;j<array.length;j++){
                if(array[i]>array[j]){
                    count++;
                }
            }
        }

        System.out.println("Total inversion is : "+count);
    }
}
