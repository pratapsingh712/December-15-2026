package tuf.BinarySearch.On1DArray;

import java.util.Scanner;

public class UpperBound {
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

        getUpperBound(key,array);
    }

    private static void getUpperBound(int key, int[] array) {
        int low = 0;
        int high = array.length;
        int mid = 0;
        int index = -1;

        while(low<=high){
            mid = low+(high-low)/2;
            if(array[mid]==key){
                // search on the right side for upper Bound
                index = searchRight(array,mid,key);
                System.out.println("Upper Bound of the key in array is :"+index);
                return;
            }else if(array[mid]>key){
                low = mid+1;
            }else{
                high = mid-1;
            }
        }

        System.out.println("Did not find the key :");
    }

    private static int searchRight(int[] array, int mid, int key) {
        int index = 0;

        for(int i=mid;i<array.length;i++){
            if(array[i]==key){
                index = i;
            }
        }

        return index+1;
    }
}
