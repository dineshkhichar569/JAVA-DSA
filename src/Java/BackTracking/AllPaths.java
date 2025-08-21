package Java.BackTracking;

import java.util.ArrayList;
import java.util.List;

public class AllPaths {
    public static void paths(int r, int c, String p, boolean[][] matrix){
        if(r == matrix.length-1 && c == matrix[0].length-1){
            List<String> list = new ArrayList<>();
            list.add(p);
            System.out.println(list);
            return ;
        }
        if(!matrix[r][c]){
            return;
        }
        // i am considering this block in my path
        matrix[r][c] = false;

        if(r < matrix.length-1){
            paths(r+1, c, p+"D", matrix);
        }
        if(c < matrix[0].length-1){
            paths(r, c+1, p+"R", matrix);
        }
        if(r > 0){
            paths(r-1, c, p+"U", matrix);
        }
        if(c > 0){
            paths(r, c-1, p+"L", matrix);
        }
        // this line is where the function will be over
        // so before the function gets removed, also remove the changes that were mad by that function
        matrix[r][c] = true;
    }

    public static void main(String[] args) {
        boolean[][] matrix = {
                {true, true, true},
                {true, true, true},
                {true, true, true}
        };

        paths(0, 0, "", matrix);
    }
}
