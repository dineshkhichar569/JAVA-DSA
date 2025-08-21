package DSA_Sheets.Recursion;

import java.util.ArrayList;

public class GFG_Subset_Sums {
    public static ArrayList<Integer> subsetSums(int[] arr) {
        ArrayList<ArrayList<Integer>> matrix = new ArrayList<>();
        matrix.add(new ArrayList<>());
        for (int i = 0; i < arr.length; i++) {
            int n = matrix.size();
            for (int j = 0; j < n; j++) {
                ArrayList<Integer> list = new ArrayList<>(matrix.get(j));
                list.add(arr[i]);
                matrix.add(list);
            }
        }
        ArrayList<Integer> sum = new ArrayList<>();
        for (int i = 0; i < matrix.size(); i++) {
            ArrayList<Integer> list = matrix.get(i);
            int s = 0;
            for (int j = 0; j < list.size(); j++) {
                s = s + list.get(j);
            }
            sum.add(s);
        }
        return sum;
    }

    public static void main(String[] args) {
        int[] arr = {2,3};
        System.out.println(subsetSums(arr));
    }
}
