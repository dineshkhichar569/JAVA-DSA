package Java.Recursion_Interview_Questions;

import java.util.ArrayList;
import java.util.List;

public class LC_17_Letter_Combinations_of_a_Phone_Number {
    public static List<String> letterCombinations(String digits) {
        if(digits.isEmpty()){
            return new ArrayList<>();
        }
        return letter("", digits);
    }

    public static List<String> letter(String p, String up) {
        if(up.isEmpty()){
            List<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        int digit = up.charAt(0) - '1';

        List<String> str = new ArrayList<>();

        //// range = [ (digit - 1) * 3 , (digit * 3) ]
        int x;
        int y;
        if(digit < 6){
            x = (digit - 1) * 3;
            y = (digit) * 3 - 1;
        } else if (digit == 6) {
            x = (digit - 1) * 3;
            y = (digit) * 3;
        }else if (digit == 7){
            x = (digit - 1) * 3 + 1;
            y = (digit) * 3;
        }else {
            x = (digit - 1) * 3 + 1;
            y = (digit) * 3 + 1;
        }
        for (int i = x; i <= y; i++) {
            char ch = (char) ('a' + i) ;
            str.addAll(letter(p+ch, up.substring(1)));
        }

        return str;
    }

    public static void letter2(String p, String up) {
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        int digit = up.charAt(0) - '1';
        for (int i = (digit-1)*3; i < (digit*3); i++) {
            char ch = (char) ('a' + i) ;
            letter2(p+ch, up.substring(1));
        }
    }


    public static void main(String[] args) {
        String digits = "23";
        System.out.println(letterCombinations(digits));
//        letter2("", digits);

        char ch = digits.charAt(0);
    }
}
