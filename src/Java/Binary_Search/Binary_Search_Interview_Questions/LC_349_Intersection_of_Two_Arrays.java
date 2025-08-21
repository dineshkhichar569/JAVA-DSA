package Java.Binary_Search.Binary_Search_Interview_Questions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LC_349_Intersection_of_Two_Arrays {
    public static int[] intersection(int[] arr1, int[] arr2) {
        List<Integer> list = new ArrayList<>();
        Arrays.sort(arr1);
        Arrays.sort(arr2);

        int prev = Integer.MIN_VALUE;
        for (int i = 0; i < arr1.length; i++) {
            if(prev != arr1[i]){
                int start = 0;
                int end = arr2.length-1;
                while (start <= end){
                    int mid = start + (end - start)/2;
                    if(arr2[mid] == arr1[i]){
                        list.add(arr1[i]);
                        break;
                    } else if (arr2[mid] < arr1[i]) {
                        start = mid+1;
                    } else{
                        end = mid-1;
                    }
                }
                prev = arr1[i];
            }
        }
        int[] ans = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            ans[i] = list.get(i);
        }
        return ans;
    }

    public static void main(String[] args) {
//        int[] arr1 = {1,2,2,1};
//        int[] arr2 = {2,2};
//        int[] arr1 = {4,9,5};
//        int[] arr2 = {9,4,9,8,4};
        int[] arr1 = {8,0,3};
        int[] arr2 = {0,0};
        int[] ans = intersection(arr1, arr2);
        System.out.println(Arrays.toString(ans));
    }
}
