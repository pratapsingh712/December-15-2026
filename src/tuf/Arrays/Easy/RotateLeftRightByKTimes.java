package tuf.Arrays.Easy;


import java.util.Arrays;
import java.util.Scanner;

public class RotateLeftRightByKTimes {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Enter the size of your array :");
        int size = sc.nextInt();
        int[] array = new int[size];

        for (int i = 0; i < size; i++) {
            array[i] = sc.nextInt();
        }

        System.out.println("Tell me whether you want to rotate left or right ?");
        try{
            String option = sc.next();
            if(option.equals("left")){
                leftRotate(array);
            }else if(option.equals("right")){
                rightRotate(array);
            }else {
                throw new IllegalArgumentException();
            }
        }catch(IllegalArgumentException e){
            System.out.println("Please enter a valid option either right or left :");
        }
    }

    private static void rightRotate(int[] array) {
        System.out.println("Please enter by how many times you want to rotate your Array:");
        int k = sc.nextInt();
        int n = array.length-1;
        for(int i=0;i<k;i++){
            int temp = array[n];
            for(int j=n-1;j>=0;j--){
                array[j+1] = array[j];
            }
            array[0] = temp;
        }

        System.out.println("After rotating right by K times we have "+ Arrays.toString(array));
    }

    private static void leftRotate(int[] array) {
        System.out.println("Please enter by how many times you want to rotate your Array:");
        int k = sc.nextInt();
        int n = array.length-1;
        for(int i=0;i<k;i++){
            int temp = array[0];
            for(int j=1;j<array.length;j++){
                array[j-1] = array[j];
            }
            array[n] = temp;
        }

        System.out.println("After rotating left by K times we have "+ Arrays.toString(array));
    }
}
