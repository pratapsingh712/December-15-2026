package tuf.KnowBasicMaths;

import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number you want to check if it's Armstrong or Not:");
        int number = sc.nextInt();

        System.out.println("The number you have entered is Armstrong :"+checkArmstrong(number));
    }

    private static boolean checkArmstrong(int number) {
        double numLength = Math.floor(Math.log10(number))+1;
        int orgNumber = number;
        int sum = 0;
        int digit = 0;
        while(number>0){
            digit = number%10;
            sum += Math.pow(digit, numLength);
            number /= 10;
        }

        return (orgNumber==sum);
    }
}
