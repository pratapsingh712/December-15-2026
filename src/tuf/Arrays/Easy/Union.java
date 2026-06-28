package tuf.Arrays.Easy;

import java.util.ArrayList;
import java.util.Scanner;

public class Union {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of your first array :");
        int size = sc.nextInt();
        int[] array = new int[size];

        for (int i = 0; i < size; i++) {
            array[i] = sc.nextInt();
        }

        System.out.println("Enter the size of your second array :");
        int size2 = sc.nextInt();
        int[] array2 = new int[size2];

        for (int i = 0; i < size2; i++) {
            array2[i] = sc.nextInt();
        }

        getUnion(array,array2);

    }

    private static void getUnion(int[] array, int[] array2) {
        int i=0,j=0;
        ArrayList<Integer> list = new ArrayList<>();
        while(i<array.length && j<array2.length){
            if(array[i]<array2[j]){
                if(!list.contains(array[i])) {
                    list.add(array[i]);
                    i++;
                }else {
                    i++;
                }
            }
            else if(array[i]>array2[j]){
                if(!list.contains(array2[j])) {
                    list.add(array2[j]);
                    j++;
                }else {
                    j++;
                }
            }
            else if(array[i]==array2[j]){
                if(!list.contains(array[i])) {
                    list.add(array[i]);
                    i++;
                    j++;
                }else {
                    i++;
                    j++;
                }
            }
        }

        while(i<array.length){
            if(!list.contains(array[i])) {
                list.add(array[i]);
                i++;
            }else {
                i++;
            }
        }

        while(j<array2.length){
            if(!list.contains(array2[j])) {
                list.add(array2[j]);
                j++;
            }else {
                j++;
            }
        }

        System.out.println("After finding the union of both the arrays :"+list);
    }
}
