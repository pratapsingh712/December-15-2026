package tuf.Arrays.Hard;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class PascalsTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of your array :");
        int size = sc.nextInt();

        getPascalsTriangle(size);
    }

    private static void getPascalsTriangle(int size) {
        int numRows = size;
        List<List<Integer>> triangle = new ArrayList<>();

        for(int i=0;i<size;i++){
            List<Integer> rows = new ArrayList<>(Collections.nCopies(i+1,1));
            for(int j=1;j<i;j++){
                rows.set(j,triangle.get(i-1).get(j-1)+triangle.get(i-1).get(j));
            }
            triangle.add(rows);
        }

        System.out.println(triangle);
    }
}
