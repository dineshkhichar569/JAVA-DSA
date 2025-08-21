package Java.Binary_Search.Binary_Search_in_2D_array;

import java.util.Arrays;

public class Sorted_Matrix {
//    Method_1  convert 2d array in 1d array then apply binary search

    // Method_2 using binary search in row and coloum both at a same time
    public static int[] arr(int[][] arr, int target){
        int r = 0;
        int c = arr.length-1;

        while(c >= 0 && r < arr.length){
            if(arr[r][c] == target){
                return new int[]{r, c};
            }
            if(arr[r][c] > target){
                c--;
            }else {
                r++;
            }
        }
        return new int[]{};
    }

    // Method_3 using binary search in 1st row then in 2nd and so on.
    public static int rowSearch(int[][] rowArr, int row, int cStart, int cEnd, int target){
        while(cStart <= cEnd){
            int mid = cStart + (cEnd-cStart)/2;

            if(rowArr[row][mid] == target){
                return mid;
            }
            if(rowArr[row][mid] < target){
                cStart = mid + 1;
            }else {
                cEnd = mid - 1;
            }
        }
        return -1;
    }
    public static int[] binarySearch(int[][] rowArr, int target){
        int row = 0;
        int col = rowArr.length-1;
        while (row < rowArr.length){
            int ans = rowSearch(rowArr, row, 0, col, target);
            if(ans != -1){
                return new int[]{row, ans};
            }
            row++;
        }

        return new int[]{-1, -1};
    }




    public static void main(String[] args) {
        int[][] arr = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        int target = 9;
        int[] ans = binarySearch(arr, target);
        System.out.println(Arrays.toString(ans));
    }

}
