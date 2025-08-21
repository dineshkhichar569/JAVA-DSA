package LeetCode;

//  Find First and Last Position of Element in Sorted Array

import java.util.Arrays;

public class LC_34 {
    public static void main(String[] args) {
//        int[] nums = {5, 7, 7, 8, 8, 10};
        int[] nums = {3, 3, 7, 8, 8, 8, 8, 8, 10};  // ans = [3 , 7]

        int[] ans = searchRange(nums, 8);
        System.out.println(Arrays.toString(ans));
    }

    static int[] searchRange(int[] nums, int target){
        int start = 0;
        int end = nums.length-1;

        while(start <= end){
            int mid = start + (end - start)/2;

            if (target < nums[mid]) {
                end = mid - 1;
            } else if (target > nums[mid]) {
                start = mid + 1;
            }else {
                return new int[]{mid};
            }
        }
        return new int[]{-1, -1};
    }
}
