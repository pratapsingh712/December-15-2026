package tuf.BasicHashing;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CountFrequency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of your array :");
        int size = sc.nextInt();
        int[] array = new int[size];

        for(int i=0;i<size;i++){
            array[i] = sc.nextInt();
        }

        System.out.println("Enter any number to find it's frequency from array :");
        int key = sc.nextInt();

        int frequency = getFrequency(array,key);

        System.out.println(key +" appeared "+frequency+" times");
    }

    private static int getFrequency(int[] array, int key) {
        HashMap<Integer,Integer> frequencyMap = new HashMap<>();

        for(int i=0;i<array.length;i++){
            if(frequencyMap.containsKey(array[i])){
                frequencyMap.put(array[i],frequencyMap.getOrDefault(frequencyMap.get(i),1)+1);
            }else{
                frequencyMap.put(array[i],1);
            }
        }

        for(Map.Entry<Integer,Integer> entry : frequencyMap.entrySet()){
            if(key==entry.getValue()){
                return entry.getValue();
            }
        }

        return -1;
    }
}
