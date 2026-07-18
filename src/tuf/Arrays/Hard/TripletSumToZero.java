package tuf.Arrays.Hard;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TripletSumToZero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of your array :");
        int size = sc.nextInt();
        int []array = new int[size];

        for(int i=0;i<size;i++){
            array[i] = sc.nextInt();
        }

        getTripletSum(array);
    }

    private static void getTripletSum(int[] array) {
        List<List<Integer>> triplet = new ArrayList<>();

        for(int i=0;i<=array.length;i++){
            for(int j=i+1;j<array.length;j++){
                for(int k=j+1;k<array.length;k++){
                    int sum = array[i]+array[j]+array[k];
                    if(sum==0){
                        List<Integer> list = new ArrayList<>();
                        list.add(array[i]);
                        list.add(array[j]);
                        list.add(array[k]);
                        triplet.add(list);
                        break;
                    }
                }
            }
        }

        System.out.println(triplet);
    }
}
