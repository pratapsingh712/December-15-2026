package tuf.Arrays.Hard;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListOfList {
    public static void main(String[] args) {
        List<List<Integer>> matrix = new ArrayList<>();

        matrix.add(new ArrayList<>(Arrays.asList(1,2,3)));
        matrix.add(new ArrayList<>(Arrays.asList(4,5,6)));
        matrix.add(new ArrayList<>(Arrays.asList(7,8,9)));

        int element = matrix.get(0).get(0);

        System.out.println(element);
    }
}
