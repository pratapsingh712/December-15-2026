package tuf.Arrays.Medium;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PrintSpiralMatrix {
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

        printSpiral(array);

    }

    private static void printSpiral(int[][] array) {
        List<Integer> list = new ArrayList<>();

        int top = 0;
        int bottom = array.length-1;
        int left = 0;
        int right = array[0].length-1;

        while(top<=bottom && left<=right){
            for(int i=left;i<=right;i++){
                list.add(array[top][i]);
            }

            top++;

            for(int i=top;i<=bottom;i++)
            {
                list.add(array[i][right]);
            }
            right--;

            if(top<=bottom){
                for(int i=right;i>=left;i--){
                    list.add(array[bottom][i]);
                }
                bottom--;
            }

            if(left<=right){
                for(int i=bottom;i>=top;i--){
                    list.add(array[i][left]);
                }
                left++;
            }
        }

        System.out.println(list);
    }
}
