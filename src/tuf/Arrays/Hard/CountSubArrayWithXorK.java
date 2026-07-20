package tuf.Arrays.Hard;

import java.util.Scanner;

public class CountSubArrayWithXorK {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of your array :");
        int size = sc.nextInt();
        int array[] = new int[size];

        for(int i=0;i<size;i++){
            array[i] = sc.nextInt();
        }

        System.out.println("Enter the target sum you want to search for :");
        int target = sc.nextInt();

        getXorSubArrayCount(array,target);
    }

    private static void getXorSubArrayCount(int[] array, int target) {
        int count = 0;
        int sum;

        for(int i=0;i<array.length;i++){
            sum = 0;
            for(int j=i;j<array.length;j++){
                sum ^= array[j];
                if(sum==target){
                    count++;
                }
            }
        }

        System.out.println(String.format("Total Subarray with Xor sum = %d is %d", target, count));
    }
}
