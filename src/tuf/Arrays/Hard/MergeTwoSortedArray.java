package tuf.Arrays.Hard;

import java.util.Arrays;
import java.util.Scanner;

public class MergeTwoSortedArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of your array :");
        int size = sc.nextInt();
        int[] array = new int[size];

        for(int i=0;i<size;i++){
            array[i] = sc.nextInt();
        }

        System.out.println("Enter the size of your 2nd array :");
        int size2 = sc.nextInt();
        int[] array2 = new int[size2];

        for(int i=0;i<size2;i++){
            array2[i] = sc.nextInt();
        }

        // both the arrays will be in sorted order

        getSorted(array,array2);
    }

    private static void getSorted(int[] array, int[] array2) {
        int[] nums1 = array;
        int[] nums2 = array2;

        int m = 4, n =3;

        int k = m+n-1;

        int i=m-1,j=n-1;

        while (i >= 0 && j >= 0) {
            // Place larger element from end of nums1 or nums2
            if (nums1[i] > nums2[j]) {
                nums1[k--] = nums1[i--];
            } else {
                nums1[k--] = nums2[j--];
            }
        }

        // If nums2 has leftovers, copy them to nums1
        while (j >= 0) {
            nums1[k--] = nums2[j--];
        }

        System.out.println(Arrays.toString(nums1));
    }
}
