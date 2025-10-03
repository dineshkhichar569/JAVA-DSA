package Java.Array;

import java.util.Arrays;

public class LC_238_Product_of_Array_Except_Self {
    public static int[] productExceptSelf(int[] arr) {
        int[] left = new int[arr.length];
        int[] right = new int[arr.length];
        int n = arr.length;

        left[0] = 1;
        for (int i = 1; i < n; i++) {
            left[i] = left[i-1] * arr[i-1];
        }
        System.out.println(Arrays.toString(left));

        right[n-1] = 1;
        for (int j = n-2; j >= 0 ; j--) {
            right[j] = right[j+1] * arr[j+1];
        }
        System.out.println(Arrays.toString(right));

        for (int i = 0; i < n; i++) {
            left[i] = left[i] * right[i];
        }

        return left;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};
        System.out.println(Arrays.toString(productExceptSelf(arr)));
    }
}
