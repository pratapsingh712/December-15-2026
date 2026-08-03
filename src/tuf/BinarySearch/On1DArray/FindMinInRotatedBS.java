package tuf.BinarySearch.On1DArray;

import java.util.Scanner;

public class FindMinInRotatedBS {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of your array :");
        int size = sc.nextInt();
        int []array = new int[size];

        System.out.println("Enter the elements in your array :");
        for(int i=0;i<size;i++){
            array[i] = sc.nextInt();
        }

        int min = getMinimum(array);
        System.out.println("Minimum in array is "+min);
    }

    private static int getMinimum(int[] array) {
        int low = 0, mid = 0, high = array.length-1;

        while(low<=high){
            mid = low+(high-low)/2;

            if(array[mid]>array[high]){
                // min lies in right half
                low = mid+1;
            }else{
                high = mid-1;
            }
        }

        return array[low];
    }
}
