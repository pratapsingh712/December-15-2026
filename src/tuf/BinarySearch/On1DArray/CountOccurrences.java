package tuf.BinarySearch.On1DArray;

import java.util.Scanner;

public class CountOccurrences {
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

        int count = getOccurrences(key,array);

        System.out.println("Total occurrences "+count);
    }

    private static int getOccurrences(int key, int[] array) {
        int low = 0, mid = 0, first = -1, last = -1;
        int high = array.length-1;

        while(low<=high){
            mid = low+(high-low)/2;
            if(array[mid]==key){
                // got the first index now we should figure out first and last index
                first = goLeftFindFirstIndex(array,key);
                last = goRightFindLastIndex(array,key);
                return last-first+1;
            }else if(array[mid]<key){
                low = mid+1;
            }else{
                high = mid-1;
            }
        }

        return -1;
    }

    private static int goLeftFindFirstIndex(int[] array, int key) {
        int low = 0, mid = 0, first = -1;
        int high = array.length-1;

        while(low<=high){
            mid = low+(high-low)/2;
            if(array[mid]==key){
                first = mid;
                high = mid-1;
            }else if(array[mid]<key){
                low = mid+1;
            }else{
                high = mid-1;
            }
        }

        return first;
    }

    private static int goRightFindLastIndex(int[] array, int key) {
        int low = 0, mid = 0, last = -1;
        int high = array.length-1;

        while(low<=high){
            mid = low+(high-low)/2;
            if(array[mid]==key){
                last = mid;
                low = mid+1;
            }else if(array[mid]<key){
                low = mid+1;
            }else{
                high = mid-1;
            }
        }

        return last;
    }
}
