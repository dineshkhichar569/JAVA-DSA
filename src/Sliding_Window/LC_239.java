package Sliding_Window;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LC_239 {
    public static int[] maxSlidingWindow(int[] arr, int k) {
        List<Integer> ans = new ArrayList<>();

        int i = 0;
        int j = 0;

        int max = arr[i];
        while(j < arr.length){
            if(j-i+1 < k){
                max = Math.max(max, arr[j]);
                j++;
            } else{
                max = Math.max(max, arr[j]);
                ans.add(max);
                i++;
                j++;
                if(i < arr.length){
                    max = arr[i];
                }
            }
        }

        int[] result = new int[ans.size()];

        for(i = 0; i < ans.size(); i++){
            result[i] = ans.get(i);
        }

        return result;
    }

    static void main() {
        int[] arr = {1,3,-1,-3,5,3,6,7};
        System.out.println(Arrays.toString(maxSlidingWindow(arr, 3)));

        String s1 = "3";
        String s2 = "3";
        String d = s1+s2;
        System.out.println(d);
    }
}
