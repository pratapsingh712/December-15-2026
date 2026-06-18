package tuf.KnowBasicMaths;

import java.util.Scanner;

public class GCD {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any two number to find it's GCD :");
        int number1 = sc.nextInt();
        int number2 = sc.nextInt();

        System.out.println("GCD of :"+number1+" and "+number2+" = "+getGCD(number1,number2));

        System.out.println("GCD of :"+number1+" and "+number2+" = "+getGCDOptimised(number1,number2));
    }

    private static int getGCDOptimised(int number1, int number2) {
        while(number1>0 && number2>0){
            if(number1>number2){
                number1 = number1%number2;
            }
            else {
                number2 = number2%number1;
            }
        }

        if(number1==0){
            return number2;
        }

        return number1;
    }


    private static int getGCD(int number1, int number2) {
        int maxLoop = number1<number2?number1:number2;
        int gcd = 1;

        for(int i=1;i<=maxLoop;i++){
            if(number1%i==0 && number2%i==0){
                gcd = i;
            }
        }

        return gcd;
    }
}
