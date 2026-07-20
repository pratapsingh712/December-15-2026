package tuf.Arrays.Hard;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FourSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of your array :");
        int size = sc.nextInt();
        int array[] = new int[size];

        for(int i=0;i<size;i++){
            array[i] = sc.nextInt();
        }

        System.out.println("Enter the target sum you want to search for :");
        int target = sc.nextInt();

        getFourSum(target,array);
    }

    private static void getFourSum(int target, int[] array) {
        int sum;

        List<List<Integer>> fourSumList = new ArrayList<>();

        for(int i=0;i<array.length;i++){
            for(int j=i+1;j<array.length;j++){
                for(int k=j+1;k<array.length;k++){
                    for(int l=k+1;l<array.length;l++){
                        sum = array[i]+array[j]+array[k]+array[l];
                        if(sum==target){
                            List<Integer> list = new ArrayList<>();
                            list.add(array[i]);
                            list.add(array[j]);
                            list.add(array[k]);
                            list.add(array[l]);
                            fourSumList.add(list);
                            break;
                        }
                    }
                }
            }
        }

        System.out.println(fourSumList);
    }
}
