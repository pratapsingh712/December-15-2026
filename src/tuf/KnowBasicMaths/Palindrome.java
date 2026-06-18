package tuf.KnowBasicMaths;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number to check whether it's Palindrome or not :");
        int number = sc.nextInt();

        System.out.println("The you entered is Palindrome :"+checkPalindrome(number));
    }

    private static boolean checkPalindrome(int number){
        int reversed = 0;
        int revNum = number;
        int digit;
        while(revNum>0){
             digit = revNum%10;
            reversed = reversed * 10 + digit;
            revNum /= 10;
        }

        return (number==reversed);
    }
}
