package Java.BackTracking;

import java.util.ArrayList;
import java.util.List;

public class LC_78_Subsets {

    ///////  using iterative approach  ///////
    public static List<List<Integer>> subsets(int[] arr){
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

        return matrix;
    }


    //////////// using backtracking  //////////////////////////
    public static List<List<Integer>> PowerSet(int[] arr){
        List<List<Integer>> matrix = new ArrayList<>();
        generateSubsets(0, arr, new ArrayList(), matrix);
        return matrix;
    }
    public static void generateSubsets(int index, int[] arr, List<Integer> list, List<List<Integer>> matrix){
        matrix.add(new ArrayList(list));  //[]

        for (int i = index; i < arr.length; i++) {
            list.add(arr[i]);
            generateSubsets(i+1, arr, list, matrix);
            list.remove(list.size()-1);
        }
    }


    public static void main(String[] args) {
        int[] arr = {1,2,3};
//        System.out.println(subsets(arr));
        System.out.println(PowerSet(arr));
    }

}

