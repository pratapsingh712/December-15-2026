package tuf.Arrays.Medium;

import java.util.*;

public class NextPermutation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of your array :");
        int size = sc.nextInt();
        int[] array = new int[size];

        // enter the elements into the array
        for(int i=0;i<size;i++){
            array[i] = sc.nextInt();
        }

        getNextPermutation(array);
    }

    private static void getNextPermutation(int[] array) {
        List<List<Integer>> allPermutation = new ArrayList<>();
        int[] nums = array.clone();
        Arrays.sort(nums);

        generatePermutation(nums,0,allPermutation);

        List<Integer> currentList = new ArrayList<>();
        for(int val : nums) currentList.add(val);

        int index = allPermutation.indexOf(currentList);

        List<Integer> nextList = allPermutation.get((index + 1) % allPermutation.size());

        // Copy back to input array
        for (int i = 0; i < nums.length; i++) {
            nums[i] = nextList.get(i);
        }
    }

    private static void generatePermutation(int[] nums, int index, List<List<Integer>> allPermutation) {
        if(index==nums.length){
            List<Integer> current = new ArrayList<>();
            for(int val : nums){
                current.add(val);
            }
            allPermutation.add(current);
            return;
        }

        Set<Integer> visited = new HashSet<>();
        for(int i=index; i<nums.length;i++){
            if(visited.add(nums[i])){
                swap(nums,index,i);
                generatePermutation(nums,index+1,allPermutation);
                swap(nums,index,i);
            }
        }
    }

    private static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
