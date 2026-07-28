package tuf.BinarySearch.On1DArray;

import java.util.Scanner;

public class LowerBound {
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

        getLowerBond(key,array);
    }

    private static void getLowerBond(int key, int[] array) {
        int left = 0;
        int right = array.length;
        int mid = 0;
        int index = -1;

        while(left<=right){
            mid = left + (right-left)/2;
            if(array[mid]==key){
                // do the search in left side one more time
                index = getIndex(array,mid,left,key);
                System.out.println("Lower Bound is :"+index);
                return;
            }else if(array[mid]>key){
                // key is in the right side
                left = mid+1;
            }else{
                right = mid-1;
            }
        }

        System.out.println("Could not find element :");

    }

    private static int getIndex(int[] array, int mid, int left, int key) {
        int index = mid+1;
        for(int i=left;i<=mid;i++){
            if(array[i]==key){
                return i+1;
            }
        }

        return index;
    }
}
