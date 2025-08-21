package Java.Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LC_16_3Sum_Closest {
    public static int ThreeSumClosest(int[] arr, int target){
        Arrays.sort(arr);
        int close = arr[0] + arr[1] + arr[2];

        for (int i = 0; i < arr.length; i++) {
            int j = i+1;
            int k = arr.length-1;
            while (j < k){
                int sum = arr[i] + arr[j] + arr[k];
                if(Math.abs(target - sum) < Math.abs(target - close)){
                    close = sum;
                } else if (sum > target) {
                    k--;
                } else{
                    j++;
                }
            }
        }
        return close;
    }

    public static void main(String[] args) {
//        int[] arr = {-1,2,1,-4};
//        int[] arr = {0, 1, 2};
        int[] arr = {4,0,5,-5,3,3,0,-4,-5};
        int target = -2;
        System.out.println(ThreeSumClosest(arr, target));
    }
}