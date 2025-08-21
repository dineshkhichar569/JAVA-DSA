package Java.Recursion_level_Recursion_Subset_Subsequence_String_Questions;

import java.util.ArrayList;
import java.util.List;

public class Ascii {

    static List<String> ASCII(String p, String up){
        List<String> list = new ArrayList<>();
        if(up.isEmpty()){
            list.add(p);
            return list;
        }

        char ch = up.charAt(0);

        List<String> left = ASCII(p+(ch), up.substring(1));
        List<String> ascii = ASCII(p+(ch+0), up.substring(1));
        List<String> right = ASCII(p, up.substring(1));

        right.addAll(ascii);
        left.addAll(right);
        return left;
    }
    public static void main(String[] args) {
        char ch = 'a';
        System.out.println((int) ch);
        // or
        System.out.println(ch + 0);

        int b = 98;
        System.out.println((char) b);

        System.out.print(ASCII("", "abc"));
    }
}
