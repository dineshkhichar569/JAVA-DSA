package DSA_Sheets.Recursion;

import java.util.Arrays;
import java.util.Stack;

public class GFG_Sort_a_stack {
    ////////////////////  using itrative approch  ///////////////////////
    public static Stack<Integer> sort(Stack<Integer> s) {
        int[] arr = new int[s.size()];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = s.pop();
        }
        System.out.println(Arrays.toString(arr));
        for (int i = 0; i < arr.length; i++) {
            int last = arr.length-i-1;
            int min = 0;
            for (int j = 0; j <= last; j++) {
                if(arr[j] < arr[min]){
                    min = j;
                }
            }
            int temp = arr[last];
            arr[last] = arr[min];
            arr[min] = temp;
        }
        for (int i = 0; i < arr.length; i++) {
            s.push(arr[i]);
        }
        return s;
    }

    ///////////////////  using recursion /////////////////
    public  static Stack<Integer> sortStack(Stack<Integer> s){
        if(!s.isEmpty()){
            int top = s.pop();
            sortStack(s);
            helper(s, top);
        }
        return s;
    }
    public static void helper(Stack<Integer> s, int top){
        if(s.isEmpty() || s.peek() >= top){
            s.push(top);
        }else {
            int temp = s.pop();
            helper(s, top);
            s.push(temp);
        }
    }

    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(2);
        s.push(3);
        s.push(1);
        System.out.println(s);
        System.out.println(sortStack(s));
    }
}
