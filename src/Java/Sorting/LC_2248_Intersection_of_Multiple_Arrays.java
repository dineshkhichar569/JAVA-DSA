package Java.Sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LC_2248_Intersection_of_Multiple_Arrays {
    public static List<Integer> intersection(int[][] arr) {
        List<Integer> list = new ArrayList<>();
        int max = arr[0][0];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if(arr[i][j] > max){
                    max = arr[i][j];
                }
            }
        }

        int[] count = new int[max+1];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                count[arr[i][j]]++;
            }
        }

        for (int i = 0; i < count.length; i++) {
            if(count[i] == arr.length){
                list.add(i);
            }
        }
        return list;
    }

    public static void main(String[] args) {
        int[][] arr = {
                {1,2,3},
                {4,5,6}
        };
        List<Integer> ans = intersection(arr);

        System.out.println(ans);
    }
}
