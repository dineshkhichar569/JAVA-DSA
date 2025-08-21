package STACK;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Stack;

public class LC_496_nextGreaterElement {
    public static int[] nextGreaterElement(int[] arr1, int[] arr2) {
        ArrayList<Integer> list = new ArrayList<>();
        Stack<Integer> s = new Stack<>();
        for (int j = arr2.length-1; j >= 0; j--) {
            if(s.isEmpty()){
                list.add(-1);
            }
            if(s.size() > 0 && s.peek() > arr2[j]){
                list.add(s.peek());
            } else if (s.size() > 0 && s.peek() <= arr2[j]) {
                while (s.size() > 0 && s.peek() <= arr2[j]){
                    s.pop();
                }
                if(s.size() == 0){
                    list.add(-1);
                }else {
                    list.add(s.peek());
                }
            }
            s.push(arr2[j]);
        }
        Collections.reverse(list);
        int[] ans = new int[arr1.length];
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                if(arr1[i] == arr2[j]){
                    ans[i] = list.get(j);
                }
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] arr1 = {4,1,2};
        int[] arr2 = {1,3,4,2};

        int[] ans = nextGreaterElement(arr1, arr2);
        System.out.println(Arrays.toString(ans));
    }
}
