package LeetCode;

import java.util.Arrays;

public class LC_Running_Sum_1D_Array {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5};
        int n = nums.length;

        int[] runningSum = new int[n];
        int sum = 0;

        for (int i = 0; i < n; i++) {
            sum = sum + nums[i];
            runningSum[i] = sum;
        }
        System.out.println(Arrays.toString(runningSum));
    }
}
