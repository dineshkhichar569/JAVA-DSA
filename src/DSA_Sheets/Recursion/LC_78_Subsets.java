package DSA_Sheets.Recursion;

import java.util.ArrayList;
import java.util.List;

public class LC_78_Subsets {
    public static List<List<Integer>> subsets(int[] arr) {
        List<List<Integer>> matrix = new ArrayList<>();
        matrix.add(new ArrayList<>());
        for (int i = 0; i < arr.length; i++) {
            int n = matrix.size();
            for (int j = 0; j < n; j++) {
                List<Integer> list = new ArrayList<>(matrix.get(j));
                list.add(arr[i]);
                matrix.add(list);
            }
        }
        List<Integer> sum = new ArrayList<>();
        for (int i = 0; i < matrix.size(); i++) {
            List<Integer> list = matrix.get(i);
            int s = 0;
            for (int j = 0; j < list.size(); j++) {
                s = s + list.get(j);
            }
            sum.add(s);
        }
        System.out.println(sum);
        return matrix;
    }

    public static void main(String[] args) {
        int nums[] = {1,2,3};
        System.out.println(subsets(nums));
    }
}
