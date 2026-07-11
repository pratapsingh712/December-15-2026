package tuf.Arrays.Medium;

import java.util.Arrays;
import java.util.Scanner;

public class MatrixZeros {
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

        getZerosOfMatrix(array);
    }

    private static void getZerosOfMatrix(int[][] array) {
        int rows = array.length;
        int cols = array[0].length;

        // Step 1: Find all zero positions and mark their rows and columns
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (array[i][j] == 0) {
                    // Mark entire row
                    for (int k = 0; k < cols; k++) {
                        if (array[i][k] != 0) {
                            array[i][k] = -1;
                        }
                    }
                    // Mark entire column
                    for (int k = 0; k < rows; k++) {
                        if (array[k][j] != 0) {
                            array[k][j] = -1;
                        }
                    }
                }
            }
        }

        // Step 2: Convert all -1 (marked cells) back to 0
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (array[i][j] == -1) {
                    array[i][j] = 0;
                }
            }
        }

        // Step 3: Print the result
        for (int[] row : array) {
            System.out.println(Arrays.toString(row));
        }
    }
}
