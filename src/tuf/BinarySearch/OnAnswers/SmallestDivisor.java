package tuf.BinarySearch.OnAnswers;

import java.util.Arrays;
import java.util.Scanner;

public class SmallestDivisor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of your array :");
        int size = sc.nextInt();
        int []array = new int[size];

        System.out.println("Enter the elements in your array :");
        for(int i=0;i<size;i++){
            array[i] = sc.nextInt();
        }

        System.out.println("Enter the Limit :");
        int limit = sc.nextInt();

        int ans = getSmallestDivisor(array,limit);

        System.out.println("Smalled Divisor that can give the sum equal to less than limit is :"+ans);
    }

    private static int getSmallestDivisor(int[] array, int limit) {
        int mid = 0, low = 1, high = Arrays.stream(array).max().getAsInt();

        if(array.length>limit){
            return -1;
        }

        while(low<=high){
            mid = low+high/2;
            if(sumDivisor(array,mid)<=limit){
                high = mid-1;
            }else{
                low = mid+1;
            }
        }

        return low;
    }

    private static int sumDivisor(int[] array, int mid) {
        int sum = 0;

        for(int num : array){
            sum += (int) Math.ceil((double) num /mid);
        }
        return sum;
    }
}
