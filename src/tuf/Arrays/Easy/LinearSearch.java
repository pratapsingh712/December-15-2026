package tuf.Arrays.Easy;

import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of your array :");
        int size = sc.nextInt();
        int[] array = new int[size];

        for (int i = 0; i < size; i++) {
            array[i] = sc.nextInt();
        }
        System.out.println("Enter the key you search :");
        int key = sc.nextInt();

        int index = getKeyLinerSearch(array,key);

        System.out.println("Key was found at index :"+index);
    }

    private static int getKeyLinerSearch(int[] array, int key) {
        int index = -1;

        for(int i=0;i<array.length;i++){
            if(array[i]==key){
                return i;
            }
        }

        return index;
    }
}
