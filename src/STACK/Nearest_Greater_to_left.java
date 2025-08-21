package STACK;

import java.util.ArrayList;
import java.util.Stack;

public class Nearest_Greater_to_left {
    public static ArrayList<Integer> Next(int[] arr){
        ArrayList<Integer> list = new ArrayList<>();
        Stack<Integer> s = new Stack<>();

        for (int i = 0; i < arr.length; i++) {
            if(s.isEmpty()) list.add(-1);
            if(s.size() > 0 && s.peek() > arr[i]){
                list.add(s.peek());
            } else if (s.size() > 0 && s.peek() <= arr[i]) {
                while (s.size() > 0 && s.peek() <= arr[i]){
                    s.pop();
                }
                if(s.size() == 0) list.add(-1);
                else list.add(s.peek());
            }
            s.push(arr[i]);
        }
        return list;
    }


    public static void main(String[] args) {
        int[] arr = {1,3,2,4};
        System.out.println(Next(arr));
    }
}
