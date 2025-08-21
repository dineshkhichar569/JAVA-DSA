package DSA_Sheets.Recursion;

import java.util.*;

public class LC_90_Subsets_II {
    public static List<List<Integer>> subsetsWithDup(int[] arr) {
        Arrays.sort(arr);
        List<List<Integer>> matrix = new ArrayList<>();
        matrix.add(new ArrayList<>());
        int s = 0;
        int e = 0;

        for (int i = 0; i < arr.length; i++) {
            s = 0;
            if(i>0 && arr[i-1] == arr[i]){
                s = e;
            }
            e = matrix.size();
            int n = matrix.size();
            for (int j = s; j < n; j++) {
                List<Integer> list = new ArrayList<>(matrix.get(j));
                list.add(arr[i]);
                matrix.add(list);
            }
        }
        return matrix;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,2};
        System.out.println(subsetsWithDup(arr));
    }
}
