package Math;

import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LC_224_Basic_Calculator {

    public static int calculate(String s) {
        s = s.trim();
        System.out.println(s);

        for (int i = 0; i < s.length(); i++) {
            s = s.replace("(", "");
            s = s.replace(")", "");
            s = s.replace(" ", "");
        }
        System.out.println(s);

        List<String> list = new ArrayList<>();


        int x = 0;
        char a = '+';
        
        int rem = 0;

        for(int i = 0; i < s.length(); i++){
            if(Character.isDigit(s.charAt(i))){
                int num = s.charAt(i) - '0';
                rem = rem*10 + num;

                if(a == '+'){
                    x = x + (s.charAt(i) - '0');
                } else{
                    x = x - (s.charAt(i) - '0');
                }
            }else{
                if(s.charAt(i) == '+'){
                    a = '+';
                }else{
                    a = '-';
                }
            }
        }
//        a = a*10 + b

        return x;
    }
    static void main() {
        String s = "21 + 1 - 23";
//        String s = "(1+(4+5+2)-3)+(6+8)";
        System.out.println(calculate(s));
    }
}
