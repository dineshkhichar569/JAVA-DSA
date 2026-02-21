package String;

public class LC_28 {
    public static int strStr(String s, String n) {
        if (s.length() < n.length())
            return -1;

        int j = 0;
        int k = 0;
        for (int i = 0; i < s.length(); i++) {
            j = i;
            k = 0;

            while (j < s.length() && k < n.length() && s.charAt(j) == n.charAt(k)) {
                k++;
                j++;
            }

            if (k == n.length()) {
                return i;
            }
        }

        return -1;
    }

    static void main() {
        String s = "mississippi";
        String n = "issipi";

        System.out.println(strStr(s, n));
    }
}
