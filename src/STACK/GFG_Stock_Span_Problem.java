package STACK;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Stack;

public class GFG_Stock_Span_Problem {
    public static ArrayList<Integer> calculateSpan(int[] arr) {
        ArrayList<Integer> list = new ArrayList<>();
        Stack<int[]> s = new Stack<>();

//        for (int i = 0; i < arr.length; i++) {
//            if(s.isEmpty()){
//                list.add(i- (-1));
//            }
//            if(s.size() > 0 && s.peek()[s.size()-1] > arr[i]){
//                list.add(i - s.peek()[1]);
//            } else if (s.size() > 0 && s.peek()[s.size()-1] <= arr[i]) {
//                while (s.size() > 0 && s.peek()[s.size()-1] <= arr[i]){
//                    s.pop();
//                }
//                if(s.size() == 0){
//                    list.add(i - (-1));
//                }else {
//                    list.add(i - s.peek()[1]);
//                }
//            }
//            s.push(new int[]{arr[i], i});
//        }

        for (int i = 0; i < arr.length; i++) {
            while (s.size() > 0 && s.peek()[0] <= arr[i]){
                s.pop();
            }
            if(s.size() == 0){
                list.add(i - (-1));
            }else {
                list.add(i - s.peek()[1]);
            }
            s.push(new int[]{arr[i], i});
        }
        return list;
    }

    public static void main(String[] args) {
        int[] arr = {10,4,5,90,120,80};
        System.out.println(calculateSpan(arr));
    }
}