package DSA_Sheets.Recursion;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class GFG_Reverse_a_Stack {
    public static void reverse(Stack<Integer> s){
        List<Integer> list = new ArrayList<>();
        while (!s.isEmpty()) {
            list.add(s.pop());
        }
        for (int i = 0; i < list.size(); i++) {
            s.push(list.get(i));
        }
        System.out.println(s);
    }

    public static void reverse2(Stack<Integer> stack) {
        if (stack.isEmpty()) return;
        int top = stack.pop();
        reverse2(stack);
        insertAtBottom(stack, top);
    }

    public static void insertAtBottom(Stack<Integer> stack, int item) {
        if (stack.isEmpty()) {
            stack.push(item);
            return;
        }
        int temp = stack.pop();
        insertAtBottom(stack, item);
        stack.push(temp);
    }

    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();

        int[] arr = {12, 3, 5};
        for (int i = 0; i < arr.length; i++) {
            s.push(arr[i]);
        }
        System.out.println(s);
        reverse2(s);
        System.out.println(s);
    }
}
