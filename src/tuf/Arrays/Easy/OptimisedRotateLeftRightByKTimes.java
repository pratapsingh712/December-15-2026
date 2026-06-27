package tuf.Arrays.Easy;

import java.util.Arrays;
import java.util.Scanner;

public class OptimisedRotateLeftRightByKTimes {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter the size of your array :");
        int size = sc.nextInt();
        int[] array = new int[size];

        for (int i = 0; i < size; i++) {
            array[i] = sc.nextInt();
        }

        System.out.println("Tell me whether you want to rotate left or right ?");
        try{
            String option = sc.next();
            if(option.equals("left")){
                leftRotateOptimised(array);
            }else if(option.equals("right")){
                rightRotateOptimised(array);
            }else {
                throw new IllegalArgumentException();
            }
        }catch(IllegalArgumentException e){
            System.out.println("Please enter a valid option either right or left :");
        }
    }

    private static void rightRotateOptimised(int[] array) {
        // reverse entire array
        // reverse k elements
        // reverse n-k elements
        System.out.println("Please enter by how many times you want to rotate your Array:");
        int k = sc.nextInt();

        reverseArray(array);
        reverseFirstK(array,k);
        reverseRemaining(array,k);

        System.out.println(Arrays.toString(array));
    }

    private static void leftRotateOptimised(int[] array) {
        System.out.println("Please enter by how many times you want to rotate your Array:");
        int k = sc.nextInt();

        reverseFirstK(array,k);
        reverseRemaining(array,k);
        reverseArray(array);

        System.out.println(Arrays.toString(array));
    }

    private static void reverseRemaining(int[] array, int k) {
        int i = k;
        int j = array.length-1;

        while(i<=j){
            int temp = array[i];
            array[i] = array[j];
            array[j] = temp;
            i++;
            j--;
        }

    }

    private static void reverseFirstK(int[] array, int k) {
        int i=0;
        int j = --k;

        while(i<=j){
            int temp = array[i];
            array[i] = array[j];
            array[j] = temp;
            i++;
            j--;
        }
    }

    private static void reverseArray(int[] array) {
        int i=0,j=array.length-1;

        while(i<=j){
            int temp = array[i];
            array[i] = array[j];
            array[j] = temp;
            i++;
            j--;
        }
    }
}
