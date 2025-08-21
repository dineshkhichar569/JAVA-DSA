package Java.Recursion_level;

import java.util.Arrays;

public class LC_344_ReverseString {
    public static void reverseString(char[] s) {
        reverse(s, 0, s.length-1);
    }

    public static void reverse(char[] s, int start, int end){
        if(start < end){
            char swap = s[start];
            s[start] = s[end];
            s[end] = swap;
            reverse(s, start + 1, end-1);
        }
    }

    public static void main(String[] args) {
        char[] s = {'h','e','l','l','o'};
        reverseString(s);
        System.out.println(Arrays.toString(s));
    }
}
