package tuf.Recursion;

public class Fibonacci {
    public static void main(String[] args) {
        getFibonacci(0,1, 10);
    }

    private static void getFibonacci(int i, int j,int n) {
        if(n==0) {
            return;
        }
        int next = i+j;
        i=j;
        j = next;

        System.out.println(next);
        getFibonacci(i,j,n-1);
    }
}
