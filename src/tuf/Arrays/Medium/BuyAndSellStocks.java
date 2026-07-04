package tuf.Arrays.Medium;

import java.util.Scanner;

public class BuyAndSellStocks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of your array :");
        int size = sc.nextInt();
        int[] array = new int[size];

        // enter the elements into the array
        for(int i=0;i<size;i++){
            array[i] = sc.nextInt();
        }
        
        buyAndSellStocks(array);
    }

    private static void buyAndSellStocks(int[] array) {
        int i = 0;
        int j = array.length-1;

        int minFirst = array[i];
        int maxLast = array[j];

        i = 1;
        j = j-1;

        while(i<=j) {
            int currentI = array[i];
            int currentJ = array[j];

            minFirst = Math.min(minFirst,currentI);
            maxLast = Math.max(maxLast,currentJ);
            i++;
            j--;
        }

        System.out.println("Maximum profit if you buy you buy at :"+minFirst+" and sell it on "+maxLast);

        System.out.println("Profit will be "+(maxLast-minFirst));
    }
}
