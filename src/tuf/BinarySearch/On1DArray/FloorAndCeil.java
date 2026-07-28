package tuf.BinarySearch.On1DArray;

import java.util.Scanner;

public class FloorAndCeil {
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

        int floor = getFloor(array,key);
        int ceil = getCeil(array,key);

        System.out.println("floor value is : "+floor);
        System.out.println("ceil value is : "+ceil);

    }

    private static int getFloor(int[] array, int key) {
        int floor = -1, low =0;
        int high = array.length-1;
        int mid = 0;

        while(low<=high){
            mid = low+(high-low)/2;
            if(array[mid]<=key){
                floor = array[mid];
                low = mid+1;
            }else{
                high = mid-1;
            }
        }

        return floor;
    }

    private static int getCeil(int[] array, int key) {
        int ceil = -1, low = 0, mid = 0;
        int high = array.length-1;

        while(low<=high){
            mid = low+(high-low)/2;
            if(array[mid]>=key){
                ceil = array[mid];
                high = mid-1;
            }else{
                low = mid+1;
            }
        }

        return ceil;
    }
}
