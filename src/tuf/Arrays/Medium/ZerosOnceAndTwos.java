package tuf.Arrays.Medium;

import java.util.Scanner;

public class ZerosOnceAndTwos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of your array :");
        int size = sc.nextInt();
        int[] array = new int[size];

        // enter the elements into the array
        for(int i=0;i<size;i++){
            array[i] = sc.nextInt();
        }

        sortArray(array);
    }

    private static void sortArray(int[] array) {
        int count0 = 0;
        int count1 = 0;
        int count2 = 0;

        for(int i=0;i<array.length;i++){
            if(array[i]==0){
                count0++;
            }
            if(array[i]==1){
                count1++;
            }
            if(array[i]==2){
                count2++;
            }
        }

        for(int i=0;i<array.length;i++){
            if(count0>0){
                System.out.print(0+" ");
                count0--;
            }
            else if(count1>0){
                System.out.print(1+" ");
                count1--;
            }
            else if(count2 > 0){
                System.out.print(2+" ");
                count2--;
            }
        }
    }
}
