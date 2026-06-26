package tuf.Arrays.Easy;

import java.util.Arrays;
import java.util.Scanner;

public class SecondLargest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of your array :");
        int size = sc.nextInt();
        int[] array = new int[size];

        for (int i = 0; i < size; i++) {
            array[i] = sc.nextInt();
        }

        int max = array[0];
        int secondMax = array[0];

        System.out.println("Second highest element in the array is :" + secondHighestElement(array, max, secondMax));
    }

    private static int secondHighestElement(int[] array, int max, int secondMax) {
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                secondMax = max;
                max = array[i];
            }
        }
        return secondMax;
    }
}
