package LeetCode;

import java.util.Arrays;

public class LC_Build_Array_from_Permutation {
    public static void main(String[] args) {

        int[] nums = {5, 0, 1, 2, 3, 4};

        int n = nums.length;

        int[] ans = new int[n];

        for (int i = 0; i < n; i++) {
            ans[i] = nums[nums[i]];
        }
        System.out.println(Arrays.toString(ans));

    }
}
