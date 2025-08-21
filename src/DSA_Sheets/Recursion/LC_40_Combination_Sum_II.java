package DSA_Sheets.Recursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LC_40_Combination_Sum_II {
    public static List<List<Integer>> combinationSum2(int[] arr, int target) {
        Arrays.sort(arr);
        List<List<Integer>> matrix = new ArrayList<>();
        UniqeSubset(arr, target, 0, new ArrayList<>(), matrix);
        return matrix;
    }
    private static void UniqeSubset(int[] arr, int target, int i, List<Integer> list, List<List<Integer>> matrix){
        if(target == 0){
            matrix.add(new ArrayList<>(list));
            return;
        }

        if(i >= arr.length || arr[i] > target) return;

        //add the current element and move to the next element so that single element can't added twice
        List<Integer> include = new ArrayList<>(list);
        include.add(arr[i]);
        UniqeSubset(arr, target-arr[i], i+1, include, matrix);

        // Skip Duplicates
        while (i+1 < arr.length && arr[i] == arr[i+1]) i++;

        //exclude the current element and move to the next one
        UniqeSubset(arr, target, i+1, list, matrix);
    }

    public static void main(String[] args) {
        int[] arr = {2,2,1,1};
        int target = 3;
        System.out.println(combinationSum2(arr, target));
    }
}
