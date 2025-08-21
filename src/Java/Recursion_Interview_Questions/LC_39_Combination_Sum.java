package Java.Recursion_Interview_Questions;

import java.util.ArrayList;
import java.util.List;

public class LC_39_Combination_Sum {

    public static List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<Integer> p = new ArrayList<>();
        return matrix(p, candidates, target);
    }
    public static List<List<Integer>> matrix(List<Integer> p, int[] up, int target){
        if(target == 0){
            List<List<Integer>> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        List<List<Integer>> list = new ArrayList<>();

        for (int i = 0; i < up.length-1; i++) {
            int ch = up[i];
            if(target-ch >=0){
                p.add(ch);
                list.addAll(matrix(p, up, target-ch));
            }else {

            }
        }

        return list;
    }

    public static void main(String[] args) {
        int[] candidates = {2,3,6,7};
        int target = 7;
        System.out.println(combinationSum(candidates, target));
    }
}
