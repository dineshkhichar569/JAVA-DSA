package Java.Recursion_level.Pattern;

public class Triangle1 {
    public static void trinagle(int row, int column){
        if(row == 0){
            return;
        }
        if(column < row){
            System.out.print(" * ");
            trinagle(row, column+1);
        }else {
            System.out.println();
            trinagle(row - 1, 0);
        }
    }

    public static void main(String[] args) {
        trinagle(10,0);
    }
}
