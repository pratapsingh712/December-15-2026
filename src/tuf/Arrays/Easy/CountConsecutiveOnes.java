package tuf.Arrays.Easy;

import java.util.Scanner;

public class CountConsecutiveOnes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of your array :");
        int size = sc.nextInt();
        int[] array = new int[size];

        for(int i=0;i<size;i++){
            array[i] = sc.nextInt();
        }

        getConsecutiveOnces(array);
    }

    private static void getConsecutiveOnces(int[] array) {
        int count = 0, maxCount = 0;

        for(int i=0;i<array.length;i++){
            if(array[i]==1){
                count++;
                if(maxCount<count){
                    maxCount=count;
                }
            }else if(array[i]!=1){
                count = 0;
            }
        }

        System.out.println("Total consecutive ones : "+maxCount);
    }
}
