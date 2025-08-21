package DSA_Sheets.Recursion;

import java.util.ArrayList;
import java.util.List;

public class LC_39_Combination_Sum {
    public static List<List<Integer>> combinationSum(int[] arr, int target) {
        List<List<Integer>> matrix = new ArrayList<>();
        sum(arr, 0, target, new ArrayList<>(), matrix);
        return matrix;
    }
    private static void sum(int[] arr, int i, int target, List<Integer> list, List<List<Integer>> matrix){
        if(target == 0){
            matrix.add(new ArrayList<>(list));
            return;
        }
        if(i >= arr.length || target < 0) return;

        List<Integer> include = new ArrayList<>(list);
        include.add(arr[i]);
        sum(arr, i, target - arr[i], include, matrix);

        sum(arr, i + 1, target, list, matrix);
    }

    public static void main(String[] args) {
        int[] arr = {0,1,0,0};
        int target = 0;
        System.out.println(combinationSum(arr, target));
    }
}
