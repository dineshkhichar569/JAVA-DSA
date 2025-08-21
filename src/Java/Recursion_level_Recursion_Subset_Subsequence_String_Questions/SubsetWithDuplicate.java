package Java.Recursion_level_Recursion_Subset_Subsequence_String_Questions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SubsetWithDuplicate {
    static List<List<Integer>> subset(int[] arr){
        Arrays.sort(arr);
        List<List<Integer>> matrix = new ArrayList<>();
        matrix.add(new ArrayList());
        int start = 0;
        int end = 0;

        for (int i = 0; i < arr.length; i++) {
            start = 0;
            // if current and previous element is same, s = e + 1
            if(i>0 && arr[i] == arr[i-1]){
                start = end;
            }
            end = matrix.size();
            int n = matrix.size();
            for (int j = start; j < n; j++) {
                List<Integer> list = new ArrayList<>(matrix.get(j));
                list.add(arr[i]);
                matrix.add(list);
            }
        }

        return matrix;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,2};
        System.out.println(subset(arr));
    }
}
