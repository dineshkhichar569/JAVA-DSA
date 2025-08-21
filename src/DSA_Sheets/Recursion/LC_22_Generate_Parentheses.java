package DSA_Sheets.Recursion;

import java.util.ArrayList;
import java.util.List;

public class LC_22_Generate_Parentheses {
    public static List<String> generateParenthesis(int n) {
        List<String> list = new ArrayList<>();
        parentheses(n, "", 0, 0, list);
        return list;
    }
    private static void parentheses(int n, String p, int open, int close, List<String> list){
        if(open == close && open + close == 2*n){
            list.add(p);
            return;
        }
        if(open < n){
            parentheses(n, p+"(", open+1, close, list);
        }
        if(close < open){
            parentheses(n, p + ")", open, close+1, list);
        }
    }

    public static void main(String[] args) {
        System.out.println(generateParenthesis(3));
    }
}
