package tuf.BinarySearch.On1DArray;

import java.util.Scanner;

public class LastOccurrence {
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

        int lastOccurrence = getLastOccurrence(array,key);

        System.out.println("Last occurrence of key is = "+lastOccurrence);
        //3 4 13 13 13 20 40
    }

    private static int getLastOccurrence(int[] array, int key) {
        int low = 0, mid = 0, lastOccurrence = -1;
        int high = array.length-1;

        while(low<=high){
            mid = low+(high-low)/2;
            if(array[mid]==key){
                lastOccurrence = mid;
                low = mid+1;
            }else if(array[mid]<key){
                low = mid+1;
            }else{
                high = mid-1;
            }
        }

        return lastOccurrence;
    }
}
