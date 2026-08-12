package tuf.BinarySearch.OnAnswers;

import java.util.Scanner;

public class NthRootOfNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the N and M values :");
        int n = sc.nextInt();
        int m = sc.nextInt();

        int root = getNthRoot(n,m);

        System.out.println("root of M is : "+root);
    }

    private static int getNthRoot(int n, int m) {
        int ans = 0, low = 1, high = m, mid =0;

        while(low<=high){
            mid = low+(high-low)/2;

            ans = (int) Math.pow(mid,n);

            if(ans==m){
                return mid;
            }else if(ans<m){
                low = mid+1;
            }else{
                high = mid-1;
            }
        }

        return -1;
    }
}
