package tuf.Arrays.Medium;

import java.util.ArrayList;
import java.util.Scanner;

public class RearrangeBySign {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of your array :");
        int size = sc.nextInt();
        int[] array = new int[size];

        // enter the elements into the array
        for(int i=0;i<size;i++){
            array[i] = sc.nextInt();
        }

        // now I need to return an array that has alternative +ve and -ve elements arranged without disturbing the initial order

        getRearrangedBySign(array);
    }

    private static void getRearrangedBySign(int[] array) {
        int size = array.length;
        ArrayList<Integer> pos = new ArrayList<>();
        ArrayList<Integer> neg = new ArrayList<>();

        // Collect positives (including zero) and negatives preserving original order
        for (int v : array) {
            if (v >= 0) {
                pos.add(v);      // treat zero as non-negative so it's not dropped
            } else {
                neg.add(v);
            }
        }

        ArrayList<Integer> rearranged = new ArrayList<>(size);

        int p = 0, n = 0;
        // Alternate: even indices -> positive, odd -> negative.
        // If one list runs out, append remaining elements from the other list.
        for (int i = 0; i < size; i++) {
            if (i % 2 == 0) {
                if (p < pos.size()) {
                    rearranged.add(pos.get(p++));
                } else if (n < neg.size()) {
                    rearranged.add(neg.get(n++));
                }
            } else {
                if (n < neg.size()) {
                    rearranged.add(neg.get(n++));
                } else if (p < pos.size()) {
                    rearranged.add(pos.get(p++));
                }
            }
        }

        System.out.println(rearranged);
    }
}
