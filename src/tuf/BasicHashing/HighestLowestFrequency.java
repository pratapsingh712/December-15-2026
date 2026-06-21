package tuf.BasicHashing;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HighestLowestFrequency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of your array :");
        int size = sc.nextInt();
        int[] array = new int[size];

        for(int i=0;i<size;i++){
            array[i] = sc.nextInt();
        }

        getHighestLowestFrequency(array);
    }
    private static void getHighestLowestFrequency(int[] array) {
        HashMap<Integer,Integer> frequencyMap = new HashMap<>();

        for(int i=0;i<array.length;i++){
            if(frequencyMap.containsKey(array[i])){
                frequencyMap.put(array[i],frequencyMap.getOrDefault(frequencyMap.get(i),1)+1);
            }else{
                frequencyMap.put(array[i],1);
            }
        }
        int highestFreq = Integer.MIN_VALUE, lowestFreq = Integer.MAX_VALUE;

        for(Map.Entry<Integer,Integer> entry : frequencyMap.entrySet()){
            // let's find the highest frequency and lowest frequency first
            int freq = entry.getValue();

            if(highestFreq<freq){
                highestFreq = freq;
            }
            else if(lowestFreq>freq){
                lowestFreq = freq;
            }
        }

        for(Map.Entry<Integer,Integer> entry : frequencyMap.entrySet()) {
            if(entry.getValue()==highestFreq){
                System.out.println(entry.getKey());
                break;
            }
        }

        for(Map.Entry<Integer,Integer> entry : frequencyMap.entrySet()) {
            if(entry.getValue()==lowestFreq){
                System.out.println(entry.getKey());
                break;
            }
        }
    }
}
