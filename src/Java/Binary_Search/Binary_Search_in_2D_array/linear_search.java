package Java.Binary_Search.Binary_Search_in_2D_array;

public class linear_search {
    static String search(int[][] arr, int target){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if(target == arr[i][j]){
                    return (i + " , " + j);
                }
            }
        }
        return null;
    }

    public static void main(String[] args) {
        int[][] arr = {
                {10, 20, 30, 40},
                {15, 25, 35, 45},
                {28, 29, 37, 49},
                {33, 34, 38, 50}
        };
        int target = 33;

        String ans = search(arr, target);
        System.out.println(ans);
    }
}
