package STACK;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Stack;

public class GFG_Next_Greater_Element {

    ///// Brutte Force approach
    public static ArrayList<Integer> nextLargerElement(int[] arr) {
        int n = arr.length;

        ArrayList<Integer> newArr = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                if(arr[i] < arr[j]){
                    newArr.add(arr[j]);
                    break;
                }
            }
            if (newArr.size() != i+1){
                newArr.add(-1);
            }
        }
        return newArr;
    }

    public static ArrayList<Integer> Next(int[] arr){
        ArrayList<Integer> list = new ArrayList<>();
        Stack<Integer> s = new Stack<>();

        for (int i = arr.length-1; i >= 0; i--) {
            if(s.isEmpty()) list.add(-1);

            if (s.size() > 0 && s.peek() > arr[i]) {
                list.add(s.peek());
            } else if (s.size() > 0 && s.peek() <= arr[i]) {
                while (s.size() > 0 && s.peek() <= arr[i]){
                    s.pop();
                }
                if(s.size() == 0){
                    list.add(-1);
                }else {
                    list.add(s.peek());
                }
            }
            s.push(arr[i]);
        }
        Collections.reverse(list);
        return list;
    }


    public static void main(String[] args) {
        int[] arr = {1,3,2,4};
        System.out.println(Next(arr));
    }
}
