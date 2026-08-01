package tuf.BinarySearch.On1DArray;

import java.util.Scanner;

public class SearchInRotatedSortedArray {
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

        int index = getTargetInRotatedSortedArray(array,key);

        System.out.println("Key was found at : "+index);
    }

    private static int getTargetInRotatedSortedArray(int[] array, int key) {
        int index = -1;
        int low = 0, mid = 0;
        int high = array.length-1;

        while(low<=high){
            mid = low+(high-low)/2;

            if(array[mid]==key){
                return mid;
            }
            if(array[low]<=array[mid]) {
                if (array[low] <= key && array[mid] > key) {
                    high = mid - 1;
                }else{
                    low = mid+1;
                }
            }else{
                if(array[mid]<=key && array[high]>key){
                    low = mid+1;
                }else{
                    high = mid-1;
                }
            }
        }

        return index;
    }
}
