package tuf.Arrays.Easy;

import java.util.Scanner;

public class AppearsOnce {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of your array :");
        int size = sc.nextInt();
        int[] array = new int[size];

        for(int i=0;i<size;i++){
            array[i] = sc.nextInt();
        }

        int appearedOnce = getElement(array);

        System.out.println("The number that appeared once is : "+appearedOnce);
    }

    private static int getElement(int[] array) {
        int element = array[0];
        for(int i=1;i<array.length;i++){
            element ^= array[i];
        }

        return element;
    }
}
