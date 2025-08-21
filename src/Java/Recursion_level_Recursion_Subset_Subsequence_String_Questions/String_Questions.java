package Java.Recursion_level_Recursion_Subset_Subsequence_String_Questions;

public class String_Questions {
    public static String str(String s, int i){
        if(i == s.length()){
            return s;
        }
        if(s.charAt(i) == 'a'){
            s = s.replaceFirst("a", "");
        }
        return str(s, i+1);
    }
    ///////////// another method /////////////
    static String skip(String up){
        if(up.isEmpty()){
            return "";
        }

        char ch = up.charAt(0);

        if(ch == 'a'){
            return skip(up.substring(1));
        }else {
            return ch + skip(up.substring(1));
        }
    }

    static String skipApple(String str){
        if(str.isEmpty()){
            return "";
        }
        if(str.startsWith("apple")){
            return skipApple(str.substring(5));
        }else {
            return str.charAt(0) + skipApple(str.substring(1));
        }
    }

    static String skipAppNotApple(String str){
        if(str.isEmpty()){
            return "";
        }
        if(str.startsWith("app") && !str.startsWith("apple")){
            return skipAppNotApple(str.substring(3));
        }else {
            return str.charAt(0) + skipAppNotApple(str.substring(1));
        }
    }

    public static void main(String[] args) {
        String s = "bccappled";

        String ans = str(s, 0);
        System.out.println(ans);

        String ans2 = skipAppNotApple(s);
        System.out.println(ans2);
    }
}
