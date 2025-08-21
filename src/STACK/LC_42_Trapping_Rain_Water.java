package STACK;

import java.util.Arrays;

public class LC_42_Trapping_Rain_Water {
    public static int trap(int[] arr) {

        int[] maxR = new int[arr.length];
        int[] maxL = new int[arr.length];

        int mR = 0;
        for (int i = 0; i < arr.length; i++) {
            mR = Math.max(mR, arr[i]);
            maxR[i] = mR;
        }
        int mL = 0;
        for (int i = arr.length-1; i >= 0; i--) {
            mL = Math.max(mL, arr[i]);
            maxL[i] = mL;
        }
        System.out.println(Arrays.toString(maxL));
        System.out.println(Arrays.toString(maxR));

        int area = 0;
        for (int i = 0; i < arr.length; i++) {
            int width = Math.min(maxL[i], maxR[i]) - arr[i];
            area = area + width;
        }

        return area;
    }

    public static void main(String[] args) {
        int[] height = {0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};
        int[] height2 = {3, 0, 0, 2, 0, 4};
        System.out.println(trap(height2));
    }
}
