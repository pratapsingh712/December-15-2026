package tuf.KnowBasicMaths;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number to check whether it's prime or not:");
        int number = sc.nextInt();

        System.out.println("The number you have entered is prime :"+primeCheck(number));

    }

    private static boolean primeCheck(int number) {
        // any number other than 1 and itself if it's divisible by any other number it's not prime

        if(number==1 || number==2){
            return true;
        }

        for(int i=2;i<number;i++){
            if(number%i==0){
                return false;
            }
        }

        return true;
    }
}
