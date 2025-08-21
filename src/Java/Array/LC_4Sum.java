package Java.Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LC_4Sum {
    public static List<List<Integer>> fourSum(int[] arr, int target) {
        Arrays.sort(arr);

        List<List<Integer>> matrix = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            if(i==0 || arr[i] != arr[i-1]) {
                for (int j = i + 1; j < arr.length; j++) {
                    int k = j+1;
                    int l = arr.length-1;
                    if(j==i+1 || arr[j] != arr[j-1]){
                        while (k < l){
                            long sum = (long) arr[i] + arr[j] + arr[k] + arr[l];
                            if(sum == target){
                                matrix.add(Arrays.asList(arr[i], arr[j], arr[k], arr[l]));
                                while (k<l && arr[k]==arr[k+1])k++;
                                while (k<l && arr[l]==arr[l-1])l--;
                                k++;
                                l--;
                            } else if (sum > target) {
                                l--;
                            }else {
                                k++;
                            }
                        }
                    }
                }
            }
        }

        return matrix;
    }

    public static void main(String[] args) {
//        int[] arr = {1,0,-1,0,-2,2};
//        int[] arr = {2,2,2,2,2};
//        int[] arr = {-2,-1,-1,1,1,2,2};
        int[] arr = {1000000000,1000000000,1000000000,1000000000};
        int target = -294967296;

        List<List<Integer>> ans = fourSum(arr, target);
        System.out.println(ans);
    }
}
