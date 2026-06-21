package tuf.Recursion;

import java.util.Scanner;

public class SumOfNaturalNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to print sum of natural numbers :");
        int number = sc.nextInt();

        int sum = functionSum(number);
        System.out.println("Sum of first :"+number+" natural number is = "+sum);
    }

    private static int functionSum(int number){
        if(number==1){
            return 1;
        }

        return functionSum(number-1)+number;
    }
}
