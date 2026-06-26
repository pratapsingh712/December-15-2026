package tuf.Arrays.Easy;

import java.util.Scanner;

public class IsSorted {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of your array :");
        int size = sc.nextInt();
        int[] array = new int[size];

        for (int i = 0; i < size; i++) {
            array[i] = sc.nextInt();
        }

        // at any given point if a[i]>a[i+1] then we break the loop and return false

        boolean isSorted = getIsSorted(array);

        System.out.println("The array is sorted :"+isSorted);
    }

    private static boolean getIsSorted(int[] array) {
        for(int i=0;i<array.length-1;i++){
            if(array[i]<array[i+1]){
                continue;
            }else{
                return false;
            }
        }

        return true;
    }
}
