package tuf.Arrays.Medium;

import java.util.Scanner;

public class MajorityElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of your array :");
        int size = sc.nextInt();
        int[] array = new int[size];

        // enter the elements into the array
        for(int i=0;i<size;i++){
            array[i] = sc.nextInt();
        }

        int element = getMajorityElement(array);

        System.out.println("The majority element is : "+element);
    }

    //7, 0, 0, 1, 7, 7, 2, 7, 7

    private static int getMajorityElement(int[] array) {
        int count = 0;
        int element = array[0];

        for(int i=0;i<array.length;i++){
            if(count==0){
                count = 1;
                element = array[i];
            }
            else if(element==array[i]){
                count++;
            }else{
                count--;
            }
        }

        int cnt1 = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == element) {
                cnt1++;
            }
        }

        // Return the element if it's a majority
        if (cnt1 > (array.length / 2)) {
            return element;
        }

        // No majority found
        return -1;
    }
}
