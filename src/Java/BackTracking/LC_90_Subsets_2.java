package Java.BackTracking;

import java.util.ArrayList;
import java.util.List;

public class LC_90_Subsets_2 {
    public static List<List<Integer>> subsetsWithDup(int[] arr) {
        List<List<Integer>> matrix = new ArrayList<>();
        subsets(0, arr, new ArrayList(), matrix);
        return matrix;
    }
    private static void subsets(int index, int[] arr, List<Integer> list, List<List<Integer>> matrix){
        matrix.add(new ArrayList(list)); // []

        for (int i = index; i < arr.length; i++) {
            list.add(arr[i]); // include element in subset
            subsets(i+1, arr, list, matrix); // recurse for next element
            list.remove(list.size()-1); // Backtrack and remove last element
        }
    }

    public static void main(String[] args) {
        int[] arr = {1,2,2};
        System.out.println(subsetsWithDup(arr));
    }
}
