package LeetCode;

import java.util.Arrays;

public class LC_Plus_one_Array {
    public static void main(String[] args) {
        int[] digits = {1, 2, 3};
        int n = digits.length;

        for (int i = n-1; i >= 0; i--) {
            if(digits[i] < 9){
                digits[i]++;
                System.out.println(Arrays.toString(digits));
            }
            digits[i] = 0;
        }
        int[] newArr = new int[n+1];
        newArr[0] = 1;
        System.out.println(Arrays.toString(newArr));
    }
}
