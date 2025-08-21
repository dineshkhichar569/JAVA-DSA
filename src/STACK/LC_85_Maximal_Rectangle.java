package STACK;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Stack;

public class LC_85_Maximal_Rectangle {
    public static int maximalRectangle(char[][] matrix) {
        int col = matrix.length;
        int row = matrix[0].length;

        int[][] arr = new int[col][row];
        for (int i = 0; i < col; i++) {
            for (int j = 0; j < row; j++) {
                if(matrix[i][j] == '0'){
                    arr[i][j] = 0;
                }else {
                    arr[i][j] = 1;
                }
            }
        }

        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < row; i++) {
            list.add(arr[0][i]);
        }

        int max = MAH(list);

        for (int j = 1; j < col; j++) {
            for (int k = 0; k < row; k++) {
                if(arr[j][k] == 0){
                    list.set(k, 0);
                }else {
                    list.set(k, list.get(k)+arr[j][k]);
                }
            }
            max = Math.max(max, MAH(list));
        }
        return max;
    }

    private static int MAH(ArrayList<Integer> list){
        Stack<int[]> s = new Stack<>();
        ArrayList<Integer> left = new ArrayList<>();
        ArrayList<Integer> right = new ArrayList<>();

        //////// for NSR
        for (int i = list.size()-1; i >= 0; i--) {
            while (s.size() > 0 && s.peek()[0] >= list.get(i)){
                s.pop();
            }
            if (s.size() == 0){
                right.add(list.size());
            }else {
                right.add(s.peek()[1]);
            }
            s.push(new int[]{list.get(i), i});
        }
        Collections.reverse(right);
        s.clear();

        /////// for NSl
        for (int i = 0; i < list.size(); i++) {
            while(s.size() > 0 && s.peek()[0] >= list.get(i)){
                s.pop();
            }
            if(s.size() == 0){
                left.add(-1);
            }else {
                left.add(s.peek()[1]);
            }
            s.push(new int[]{list.get(i), i});
        }

        int max = 0;
        for (int i = 0; i < list.size(); i++) {
            int width = right.get(i) - left.get(i) - 1;
            int area = width * list.get(i);
            max = Math.max(max, area);
        }

        return max;
    }

    public static void main(String[] args) {
        char[][] arr = {
                {'1','0','1','0','0'},
                {'1','0','1','1','1'},
                {'1','1','1','1','1'},
                {'1','0','0','1','0'}
        };

        char[][] arr1 = {
                {'1'},
                {'0'}
        };
        System.out.println(maximalRectangle(arr1));
    }
}
