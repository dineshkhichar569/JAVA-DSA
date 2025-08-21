package Java.Recursion_level;

import java.util.Arrays;

public class LC_54_Spiral_Matrix {
    public static int[] spiralOrder(int[][] matrix){
        int[] linear = new int[20];
        int index = 0;

        int row = 0;
        // row
        for (int i = matrix.length-1; i >= 0; i--) {
            //column
            for (int j = 0 ; j < matrix[0].length; j++) {
                // System.out.print(matrix[i][j] + "+");
                if(j != matrix[0].length) {
                    linear[index] = matrix[row][j];
                    index++;
                }
            }
            row++;
            System.out.println();
            linear[index] = matrix[i][1];
            index++;
        }
        return linear;
    }

    public static void main(String[] args) {
        int[][] matrix = {
                {1,2,3,4},
                {5,6,7,8},
                {9,10,11,12}
        };

        int[] ans = spiralOrder(matrix);

        System.out.println(Arrays.toString(ans));
    }
}
