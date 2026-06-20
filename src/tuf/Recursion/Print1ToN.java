package tuf.Recursion;

import java.util.Scanner;

public class Print1ToN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter N to print 1 to N:");
        int n = sc.nextInt();

        printOneToN(n,1);
    }

    private static void printOneToN(int n,int i) {
        if(i==n){
            System.out.println(i);
            return;
        }

        System.out.println(i);
        printOneToN(n,i+1);
    }
}
