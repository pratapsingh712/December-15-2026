package tuf.KnowBasicMaths;

import java.util.Scanner;

public class CountDigit {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number check how many digits are present :");
        int num = sc.nextInt();
        System.out.println("Total digit :"+getCount(num));
        // now we need to optimize our solution \

        System.out.println("Total digit : "+getOptimizedSolution(num));

    }

    private static double getOptimizedSolution(int num) {
        double count = Math.log10(num);
        count = Math.floor(count);
        return count+1;
    }

    private static int getCount(int num) {
        int count = 0;
        while(num>0){
            count++;
            num/=10;
        }
        return count;
    }

}
