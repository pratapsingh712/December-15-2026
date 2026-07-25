package tuf.BinarySearch.On1DArray;

import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of your array :");
        int size = sc.nextInt();
        int []array = new int[size];

        System.out.println("Enter the elements in your array :");
        for(int i=0;i<size;i++){
            array[i] = sc.nextInt();
        }

        System.out.println("Enter the key you want to search :");
        int key = sc.nextInt();

        getBinarySearch(key,array);
    }

    private static void getBinarySearch(int key, int[] array) {
        int low = 0;
        int high = array.length;
        int mid = 0;

        while(low<=high){
             mid = (low+high)/2;
            if(array[mid]==key){
                System.out.println("Key found at "+(mid+1));
                return ;
            }
            else if(key>array[mid]){
                low = mid+1;
            }else {
                high = mid-1;
            }
        }

        System.out.println("Key not found :");
    }
}
