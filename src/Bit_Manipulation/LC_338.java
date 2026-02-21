package Bit_Manipulation;

import java.util.Arrays;

public class LC_338 {
    public static int[] countBits(int n) {
        int[] arr = new int[n+1];

        for(int i = 0; i <= n; i++){
            String s = Integer.toBinaryString(i);
            s = s.replaceAll("0", "");
//            s = s.trim();
            arr[i] = s.length();
        }
        return arr;
    }

    static void main() {
        int n = 2;
        System.out.println(Arrays.toString(countBits(n)));
        System.out.println(Integer.toBinaryString(4));
    }
}
