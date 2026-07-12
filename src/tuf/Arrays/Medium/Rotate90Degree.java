package tuf.Arrays.Medium;

import java.util.Arrays;
import java.util.Scanner;

public class Rotate90Degree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of row and column :");
        int row = sc.nextInt();
        int column = sc.nextInt();

        int[][] array = new int[row][column];

        System.out.println("Enter the elements in your array :");
        for(int i=0;i<row;i++){
            for(int j=0;j<column;j++){
                array[i][j] = sc.nextInt();
            }
        }

        rotate90Degree(array);
    }

    private static void rotate90Degree(int[][] array) {
        int row = array.length;
        int col = array[0].length;
        int[][] transformed = new int[row][col];
        int n = array.length;

        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                transformed[j][n-i-1] = array[i][j];
            }
        }

        for(int[] rows : transformed){
            System.out.println(Arrays.toString(rows));
        }
    }
}
