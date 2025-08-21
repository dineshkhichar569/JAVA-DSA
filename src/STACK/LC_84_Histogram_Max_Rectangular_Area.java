package STACK;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Stack;

public class LC_84_Histogram_Max_Rectangular_Area {
    public static int largestRectangleArea(int[] height) {
        Stack<int[]> s = new Stack<>();
        int[] right = new int[height.length];
        int[] left = new int[height.length];

        /////////////  Nearest smallest to right
        for (int i = height.length-1; i >= 0; i--) {
            while (s.size() > 0 && s.peek()[0] >= height[i]){
                s.pop();
            }
            if(s.size() == 0){
                right[i] = height.length;
            }else {
                right[i] = s.peek()[1];
            }
            s.push(new int[]{height[i], i});
        }
        s.clear();
        /////////////  Nearest smallest to left
        for (int i = 0; i < height.length; i++) {
            while (s.size() > 0 && s.peek()[0] >= height[i]){
                s.pop();
            }
            if(s.size() == 0){
                left[i] = -1;
            }else {
                left[i] = s.peek()[1];
            }
            s.push(new int[]{height[i], i});
        }

        int maxArea = 0;
        for (int i = 0; i < height.length; i++) {
            int width = right[i] - left[i] - 1;
            int area = height[i] * width;
            maxArea = Math.max(maxArea, area);
        }
        return maxArea;
    }

    public static void main(String[] args) {
        int[] height = {6,2,5,4,5,1,6};
        System.out.println(largestRectangleArea(height));
    }
}
