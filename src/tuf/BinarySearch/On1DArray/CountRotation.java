package tuf.BinarySearch.On1DArray;

import java.util.Scanner;

public class CountRotation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of your array :");
        int size = sc.nextInt();
        int []array = new int[size];

        System.out.println("Enter the elements in your array :");
        for(int i=0;i<size;i++){
            array[i] = sc.nextInt();
        }

        int rotationCount = getRotationCount(array);

        System.out.println("total rotation is : "+rotationCount);
    }

    private static int getRotationCount(int[] array) {
        int low = 0, mid = 0, high = array.length-1;
        int count = 0;

        while(low<=high){
            count = low;
            mid = low+(high-low)/2;

            if(array[mid]>=array[high]){
                low = mid+1;
            }else{
                high = mid;
            }
        }

        return count;
    }
}
