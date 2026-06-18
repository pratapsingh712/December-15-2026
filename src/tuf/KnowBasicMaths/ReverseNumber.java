package tuf.KnowBasicMaths;

import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number to reverse it :");
        int number = sc.nextInt();

        System.out.println("After Reversing the number we get :"+getReverse(number));
    }

    private static int getReverse(int number) {
        int reverse = 0;
        int digit = 0;

        while(number>0){
            digit = number%10;
            reverse = reverse*10+digit;
            number/=10;
        }

        return reverse;
    }
}
