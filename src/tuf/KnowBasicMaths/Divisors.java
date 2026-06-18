package tuf.KnowBasicMaths;

import java.util.HashSet;
import java.util.Scanner;

public class Divisors {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number to print it's divisors :");
        int number = sc.nextInt();

        getDivisors(number);
    }

    private static void getDivisors(int number) {
        HashSet<Integer> numList = new HashSet<>();
        for (int i = 1; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                numList.add(i);
                numList.add(number / i);
            }
        }
        System.out.println(numList);
    }
}
