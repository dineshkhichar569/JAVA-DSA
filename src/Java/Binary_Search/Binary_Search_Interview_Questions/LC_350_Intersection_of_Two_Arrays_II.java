package Java.Binary_Search.Binary_Search_Interview_Questions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LC_350_Intersection_of_Two_Arrays_II {
    public static int[] intersect(int[] arr1, int[] arr2) {
        List<Integer> list = new ArrayList<>();
        Arrays.sort(arr1);
        Arrays.sort(arr2);

        int i = 0;
        int j = 0;
        while (i < arr1.length && j < arr2.length){
            if(arr1[i] > arr2[j]){
                j++;
            } else if (arr1[i] < arr2[j]) {
                i++;
            } else {
                list.add(arr1[i]);
                i++;
                j++;
            }
        }

        int[] ans = new int[list.size()];
        for (int k = 0; k < ans.length; k++) {
            ans[k] = list.get(k);
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] arr1 = {1,2,2,1};
        int[] arr2 = {2,2};
//        int[] arr1 = {1};
//        int[] arr2 = {1};

        int[] ans = intersect(arr1, arr2);
        System.out.println(Arrays.toString(ans));
    }
}