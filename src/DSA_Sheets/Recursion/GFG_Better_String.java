package DSA_Sheets.Recursion;

import java.util.*;

public class GFG_Better_String {
    public static String betterString(String s1, String s2) {
        Set<String> one = subset("", s1);
        Set<String> two = subset("", s2);
        System.out.println("one : " + one.size());
        System.out.println("two : " + two.size());

        if(one.size() > two.size()){
            return s1;
        } else if (one.size() < two.size()) {
            return s2;
        }
        return s1;
    }
    public static Set<String> subset(String p, String up){
        if(up.isEmpty()){
            Set<String> list = new HashSet<>();
            list.add(p);
            return list;
        }
        char ch = up.charAt(0);
        Set<String> left = subset(p+ch, up.substring(1));
        Set<String> right = subset(p, up.substring(1));
        left.addAll(right);
        return left;
    }

    ///////////////////////  without using hashSet  /////////////////////
    public static String betterString2(String s1, String s2) {
        int one = helper(s1);
        int two = helper(s2);
        if(one < two){
            return s2;
        }
        return s1;
    }
    public static int helper(String S){
        char[] SSort = S.toCharArray();
        Arrays.sort(SSort);
        String SS = new String(SSort);
        List<String> result = new ArrayList<>();
        int index = 0;
        subset2("", SS, index, result);
        return result.size();
    }
    public static void subset2(String p, String up, int i, List<String> result){
        if(i == up.length()){
            result.add(p);
            return ;
        }
        subset2(p+up.charAt(i), up, i+1, result);
        while (up.length() > i + 1 && up.charAt(i) == up.charAt(i+1)){
            i++;  ////// skip the duplicate;
        }
        subset2(p, up, i+1, result);
    }


    public static void main(String[] args) {
        String s1 = "gboubwd";
        String s2 = "bekoilx";
        System.out.println(betterString2(s1, s2));
    }
}
