package DSA_Sheets.Recursion;

import java.util.ArrayList;
import java.util.List;

public class LC_216_Combination_Sum_III {
    public static List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> matrix = new ArrayList<>();
//        int s = k;
        sum(k, n, 1, new ArrayList<>(), matrix, k);
        return matrix;
    }
    private static void sum(int k, int n, int i, List<Integer> list, List<List<Integer>> matrix, int s){
        if(n == 0 && list.size() == k){
            matrix.add(new ArrayList<>(list));
            return;
        }

        if(i > 9 || n < 0) return;

        List<Integer> include = new ArrayList<>(list);
        include.add(i);

        sum(k, n-i, i+1, include, matrix, s);

        sum(k, n, i+1, list, matrix, s);
    }

    public static void main(String[] args) {
        System.out.println(combinationSum3(9,45));
    }
}
