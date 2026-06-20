package tuf.Recursion;

import java.util.Scanner;

public class PrintNTo1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter N to print 1 to N:");
        int n = sc.nextInt();

        printOneToN(n);
    }

    private static void printOneToN(int n) {
        if(n==1){
            System.out.println(n);
            return;
        }

        System.out.println(n);
        printOneToN(n-1);
    }
}
