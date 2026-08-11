package tuf.BinarySearch.OnAnswers;

import java.util.Scanner;

public class SquareRoot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any element to find it's square root :");
        int num = sc.nextInt();
        int square = getSquareRoot(num);

        System.out.println("Square root of num is :"+square);
    }

    private static int getSquareRoot(int num) {
        int left = 1, right = num/2, ans = 0;

        while(left<=right){
            long mid = left+(right-left)/2;

            if(mid*mid<=num){
                ans = (int) mid;

                left = (int) mid+1;
            }else{
                right = (int) mid-1;
            }
        }

        return ans;
    }
}
