package tuf.Arrays.Medium;

import java.util.HashMap;
import java.util.Scanner;

public class TwoSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of your array :");
        int size = sc.nextInt();
        int[] array = new int[size];

        // enter the elements into the array
        for(int i=0;i<size;i++){
            array[i] = sc.nextInt();
        }

        System.out.println("Enter the target sum :");
        int sum = sc.nextInt();

        boolean twoSum = getTwoSum(array,sum);

        System.out.println("Two sum is present :"+twoSum);
    }

    private static boolean getTwoSum(int[] array, int sum) {
        HashMap<Integer,Integer> elements = new HashMap<>();

//        for(int i=0;i<array.length;i++){
//            elements.put(array[i],i);
//        }

        int presentSubtractedValue = 0;

        for(int i=0;i<array.length;i++){
            presentSubtractedValue = sum-array[i];
            if(!elements.containsKey(array[i])){
                elements.put(array[i],i);
            }

            if(elements.containsKey(presentSubtractedValue)){
                if(elements.get(presentSubtractedValue)!=i) {
                    return true;
                }
            }
        }

        return false;
    }
}
