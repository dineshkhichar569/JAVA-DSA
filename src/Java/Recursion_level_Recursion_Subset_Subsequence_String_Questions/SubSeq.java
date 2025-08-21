package Java.Recursion_level_Recursion_Subset_Subsequence_String_Questions;

import java.util.ArrayList;
import java.util.List;

public class SubSeq {
    static List<String> subseq(String p, String up){
        List<String> sub = new ArrayList<>();
        if(up.isEmpty()){
            sub.add(p);
            return sub;
        }
        char ch = up.charAt(0);

        List<String> left = subseq(p+ch, up.substring(1));
        List<String> right = subseq(p, up.substring(1));

        left.addAll(right);
        return left;
    }

    public static void main(String[] args) {
        List<String> ans = subseq("", "abc");
        System.out.println(ans);
    }
}
