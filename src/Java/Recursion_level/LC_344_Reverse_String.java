package Java.Recursion_level;

import java.util.Arrays;

public class LC_344_Reverse_String {
    public static void reverseString(char[] s) {
        System.out.println(Arrays.toString(s));

        int start = 0;
        int end = s.length-1;
        while(start < end){
            char swap = s[start];
            s[start] = s[end];
            s[end] = swap;

            start++;
            end--;
        }
        System.out.println(Arrays.toString(s));
    }

    public static void main(String[] args) {
        char[] s = {'h','e','l','l','o'};
        reverseString(s);
    }
}
