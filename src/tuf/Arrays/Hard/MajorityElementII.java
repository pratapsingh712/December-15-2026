package tuf.Arrays.Hard;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MajorityElementII {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of your array :");
        int size = sc.nextInt();
        int array[] = new int[size];

        for(int i=0;i<size;i++){
            array[i] = sc.nextInt();
        }

        getMajorityII(array);
    }

    private static void getMajorityII(int[] array) {
        Map<Integer,Integer> elements = new HashMap<>();

        for(int i=0;i<array.length;i++){
            if(elements.containsKey(array[i])){
                elements.put(array[i],elements.get(array[i])+1);
            }else{
                elements.put(array[i],1);
            }
        }
        int n = array.length/3;
        for(Map.Entry<Integer,Integer> entry : elements.entrySet()){
            if(entry.getValue()>n){
                System.out.print(entry.getKey()+" ");
            }
        }
    }
}
