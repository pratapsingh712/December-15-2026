package tuf.BinarySearch.On1DArray;

import java.util.Scanner;

public class InsertionPosition {
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

        int index = getInsertionPosition(key,array);

        System.out.println("The Position is : "+index);
    }

    private static int getInsertionPosition(int key, int[] array) {
        int low = 0;
        int high = array.length;
        int mid = 0;
        int index = 0;

        while(low<=high){
            mid = low+(high-low)/2;
            if(array[mid]>=key){
                index = mid;
                high = mid-1;
            }else{
                low = mid+1;
            }

        }

        return index;

    }
}
