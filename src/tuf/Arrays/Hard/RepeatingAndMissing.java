package tuf.Arrays.Hard;

import java.util.Arrays;
import java.util.Scanner;

public class RepeatingAndMissing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of your array :");
        int size = sc.nextInt();
        int[] array = new int[size];

        for(int i=0;i<size;i++){
            array[i] = sc.nextInt();
        }

        getMissingAndRepeating(array);
    }

    private static void getMissingAndRepeating(int[] array) {
        int repeating=0;
        int missing=0;
        Arrays.sort(array);

        for(int i=0;i<array.length-1;i++){
            if(array[i]==array[i+1]){
                repeating = array[i];
            }

            int next = array[i]+1;
            if(array[i+1]!=next && next<=array.length){
                missing = next;
            }
        }

        System.out.println("["+repeating+","+missing+"]");
    }
}
