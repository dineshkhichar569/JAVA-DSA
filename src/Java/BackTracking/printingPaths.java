package Java.BackTracking;

import java.util.ArrayList;
import java.util.List;

public class printingPaths {
    public static List<String> path(int r, int c, String p){
        if(r == 1 && c == 1){
            List<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        List<String> list = new ArrayList<>();
        List<String> right = new ArrayList<>();
        if(r > 1){
           list.addAll(path(r-1, c, p+"D"));
        }
        if(c > 1){
            list.addAll(path(r, c-1, p+"R"));
        }
        return list;
    }

    public static List<String> pathDiagonaly(int r, int c, String p){
        if(r == 1 && c == 1){
            List<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        List<String> list = new ArrayList<>();
        if(r > 1 && c > 1){
            list.addAll(pathDiagonaly(r-1, c-1, p+"D"));
        }
        if(r > 1){
           list.addAll(pathDiagonaly(r-1, c, p+"V"));
        }
        if(c > 1){
            list.addAll(pathDiagonaly(r, c-1, p+"H"));
        }
        return list;
    }


    public static void pathRestrictions(int r, int c, String p, boolean[][] matrix){
        if(r == matrix.length-1 && c == matrix[0].length-1){
            List<String> list = new ArrayList<>();
            list.add(p);
            System.out.println(list);
            return ;
        }

        if(!matrix[r][c]){
            return;
        }

        List<String> list = new ArrayList<>();
        if(r < matrix.length-1 && c < matrix[0].length-1){
            pathRestrictions(r+1, c+1, p+"D", matrix);
        }
        if(r < matrix.length-1){
            pathRestrictions(r+1, c, p+"V", matrix);
        }
        if(c < matrix[0].length-1){
            pathRestrictions(r, c+1, p+"H", matrix);
        }
    }

    public static void main(String[] args) {
        boolean[][] matrix = {
                {true, true, true},
                {true, false, true},
                {true, true, true}
        };

        pathRestrictions(0, 0, "", matrix);
    }
}
