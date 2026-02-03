package String;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LC_917 {
    public static String reverseOnlyLetters(String s) {
        List<Character> letters = new ArrayList<>();
        List<Character> special = new ArrayList<>();

        for (char c : s.toCharArray()) {
            if ((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z')) {
                letters.add(c);
            } else {
                special.add(c);
            }
        }
        Collections.reverse(letters);
        Collections.reverse(special);

        StringBuilder ans = new StringBuilder();

        int i = 0;
        int j = 0;

        for (char c : s.toCharArray()) {
            if ((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z')) {
                ans.append(letters.get(i));
                i++;
            } else {
                ans.append(special.get(j));
                j++;
            }
        }

        return ans.toString();
    }

    static void main() {
        String s = "a-bC-dEf-ghIj";

        System.out.println(reverseOnlyLetters(s));
    }
}
