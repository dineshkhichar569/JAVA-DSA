package Java;

import java.util.Arrays;

public class Q_06_Swap_number_in_Array {
    public static void main(String[] args) {
        int[] arr = {2, 4, 5, 7, 2, 1};
        change(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void change(int[] a){
        a[0] = 45;   //// if you make a change to the object via this ref variable, same object will be changed. ////
    }
}