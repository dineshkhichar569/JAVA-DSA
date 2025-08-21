package STACK;

import java.util.Arrays;
import java.util.Stack;

public class LC_503_nextGreaterElements2 {
    public static int[] nextGreaterElements(int[] arr) {
        int[] ans = new int[arr.length];

        Stack<Integer> s = new Stack<>();
        int k = 0;
        for (int i = arr.length-1; i >=0; i--) {
            s.push(arr[i]);
        }

        for (int i = arr.length-1; i >= 0; i--) {

            if(s.size() > 0 && s.peek() > arr[i]){
                ans[k] = s.peek();
                k++;
            } else if (s.size() > 0 && s.peek() <= arr[i]) {
                while (s.size() > 0 && s.peek() <= arr[i]){
                    s.pop();
                }
                if(s.size() == 0){
                    ans[k] = -1;
                    k++;
                }else {
                    ans[k] = s.peek();
                    k++;
                }
            }
            s.push(arr[i]);
        }
        int start = 0;
        int end = ans.length-1;
        while (start < end){
            int swap = ans[start];
            ans[start] = ans[end];
            ans[end] = swap;
            start++;
            end--;
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,1};
        int[] ans = nextGreaterElements(arr);
        System.out.println(Arrays.toString(ans));
    }
}
