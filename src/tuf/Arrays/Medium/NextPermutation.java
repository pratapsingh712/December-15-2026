package tuf.Arrays.Medium;

import java.util.*;

public class NextPermutation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of your array :");
        int size = sc.nextInt();
        int[] array = new int[size];

        // enter the elements into the array
        for(int i=0;i<size;i++){
            array[i] = sc.nextInt();
        }

        getNextPermutation(array);
    }

    private static void getNextPermutation(int[] array) {
        // need to find a dip coming from behind one I do I need to find the smallest to it's right place the number there and sort rest
        // If I do not find any dip reverse the array
        int index = -1;
        for(int i=array.length-2;i>=0;i--){
            if(array[i] < array[i+1]){
                index = i;
                break;
            }
        }

        if(index<0){
            Collections.reverse(Arrays.asList(array));
        }else{
            for(int i=array.length-1;i>index;i--){
                if(array[i] > array[index]){
                    int temp = array[index];
                    array[index] = array[i];
                    array[i] = temp;
                    break;
                }
            }
        }

        // now let's sort the array from index+1 to n

        Arrays.sort(array,index+1,array.length);

        System.out.println(Arrays.toString(array));
    }
}
