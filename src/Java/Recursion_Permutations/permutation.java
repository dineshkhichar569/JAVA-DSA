package Java.Recursion_Permutations;

public class permutation {
    static void permu(String str, String p){
        if (p.isEmpty()){
            System.out.println(str);
            return;
        }
        char ch = p.charAt(0);
        for (int i = 0; i <= str.length(); i++) {
            String f = str.substring(0,i);
            String s = str.substring(i,str.length());

            permu(f+ch+s, p.substring(1));
        }
    }

    public static void main(String[] args) {
        String p = "abc";
        permu("", "abc");
    }
}