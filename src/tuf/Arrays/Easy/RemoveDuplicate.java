package tuf.Arrays.Easy;

import java.util.Arrays;
import java.util.Scanner;

public class RemoveDuplicate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of your array :");
        int size = sc.nextInt();
        int[] array = new int[size];

        for (int i = 0; i < size; i++) {
            array[i] = sc.nextInt();
        }

        removeDuplicate(array);
    }

    private static void removeDuplicate(int[] array) {

        int j=0,k=0;

        for(int i=0;i<array.length;i++){
            if(array[j]!=array[k]){
                array[j+1] = array[k];
                k++;
                j++;
            }
            else{
                k++;
            }
        }

        System.out.println(Arrays.toString(array));
    }
}
