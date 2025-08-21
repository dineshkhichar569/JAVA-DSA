package Java;

import java.util.Arrays;

public class JV_2D_Array {
    public static void main(String[] args) {
//        int[][] arr = new int[3][3];
//        int[][] arr = {
//                {1, 2, 3},
//                {4, 5, 6},
//                {7, 8, 9},
//                {0, 1, 3}
//        };
//
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = 0; j < arr[i].length; j++) {
//                System.out.print(arr[i][j] + "  ");
//            }
//            System.out.println();
//        }
//
//        System.out.println(" ");
//
//        for (int row = 0; row < arr.length; row++) {
//            String element = Arrays.toString(arr[row]);
//            System.out.println(element);
//        }
//
//        System.out.println(" ");

        int[][] arr2 = {
                {2, 4},
                {3, 6, 9, 7},
                {5, 7, 3},
                {3}
        };

        for (int[] val : arr2){
            System.out.println(Arrays.toString(val));
        }

    }
}
