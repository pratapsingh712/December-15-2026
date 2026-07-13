package tuf.Arrays.Medium;

import java.util.Scanner;

public class PrintRightAngleTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of the pattern :");
        int size = sc.nextInt();

        for(int i=1;i<=size;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
