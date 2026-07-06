package tuf.Arrays.Medium;

import java.util.ArrayList;
import java.util.Scanner;

public class LeadersInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of your array :");
        int size = sc.nextInt();
        int[] array = new int[size];
        for(int i=0;i<size;i++){
            array[i] = sc.nextInt();
        }

        leaderInArray(array);
    }

    private static void leaderInArray(int[] array) {
        ArrayList<Integer> leaders = new ArrayList<>();

        int leader = array[array.length-1];
        for(int i=1;i<array.length;i++)
        {
            if(array[i]>leader){
                leaders.add(array[i]);
            }
        }

        leaders.add(leader);

        System.out.println("Leaders in the array is :"+leaders);
    }
}
