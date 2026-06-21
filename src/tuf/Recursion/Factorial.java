package tuf.Recursion;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number to print it's factorial:");
        int number = sc.nextInt();

        int fact = getFactorial(number);

        System.out.println("Factorial of "+number+" = "+fact);
    }

    private static int getFactorial(int number) {
        if(number==1){
            return 1;
        }

        return number*getFactorial(number-1);
    }
}
