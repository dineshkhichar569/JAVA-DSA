package Java.Linear_Search;

import java.sql.SQLOutput;
import java.util.Arrays;

public class MAX_in_2D_Arrays {
    public static void main(String[] args) {
        int[][] arr = {
                {1, 2, 3, 4},
                {4, 5, 6, 7},
                {7, 8, 9, 0}
        };

        System.out.println(Integer.MIN_VALUE);
        System.out.println(Integer.MAX_VALUE);

        int ans = search(arr);   // format of return value {i, j}

        System.out.println(ans);
    }
    static int search(int[][] arr){
        if (arr.length == 0) {
            return -1;
        }

//        int num = arr[0][0];
        int num = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if(arr[i][j] > num){
                    num = arr[i][j];
                }
            }
        }
        return num;
    }
}
