package tuf.Recursion;

import java.util.Scanner;

public class PalindromeString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any string to check if it's palindrome:");
        String string = sc.next();

        String reverse = getReverse(string,0);

        System.out.println("Given string is a palindrome :"+string.equals(reverse));
    }

    private static String getReverse(String string, int i) {
        if(i>=string.length()){
            return ""; // this will be called by last recursive function and result will be added to it
        }

        return getReverse(string,i+1) + string.charAt(i);
    }
}
