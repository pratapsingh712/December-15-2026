package tuf.Recursion;

import java.util.Scanner;

public class PrintNTimes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter how many times you want to print Ram:");
        int size = sc.nextInt();


        recursiveFunctionPrintRam(size);
    }

    private static void recursiveFunctionPrintRam(int size) {
        if(size==1){
            return;
        }

        recursiveFunctionPrintRam(size-1);

        System.out.println("Ram Ji ki Jai:");
    }
}
