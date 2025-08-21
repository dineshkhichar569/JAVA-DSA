package Java.Recursion_level_Recursion_Subset_Subsequence_String_Questions;

import java.util.ArrayList;
import java.util.List;

public class SUBSET {
    static List<List<Integer>> subset(int[] arr){
        List<List<Integer>> matrix = new ArrayList<>();
        matrix.add(new ArrayList());

        for (int i = 0; i < arr.length; i++) {
            int n = matrix.size();
            for (int j = 0; j < n; j++) {
                List<Integer> list = new ArrayList<>(matrix.get(j));
                list.add(arr[i]);
                matrix.add(list);
            }
        }

        return matrix;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3};
        System.out.println(subset(arr));
    }
}
