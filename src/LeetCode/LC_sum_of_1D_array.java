package LeetCode;

import java.util.Arrays;

public class LC_sum_of_1D_array {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int n = arr.length;
        int[] result = new int[n];

        int sum = 0;

        for (int i = 0; i < n; i++) {
            sum = sum + arr[i];
            result[i] = sum;
        }
        System.out.print(Arrays.toString(result));

    }
}
