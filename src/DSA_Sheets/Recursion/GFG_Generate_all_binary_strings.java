package DSA_Sheets.Recursion;

import java.util.ArrayList;
import java.util.List;

public class GFG_Generate_all_binary_strings {
    public static List<String> generateBinaryStrings(int n) {
        List<String> list = new ArrayList<>();
        int i = 0;
        int limit = 1<<n;
        while(i < limit){
            String binary = Integer.toBinaryString(i); // to convert integer to binary string
            binary = String.format("%" + n + "s", binary);
            binary = binary.replace(' ', '0');
            if(binary.contains("00")){
                i++;
                continue;
            }
            list.add(binary);
            i++;
        }
        return list;
    }

    public static List<String> generateBinaryStrings2(int n){
        List<String> list = new ArrayList<>();
        int zero = n;
        int one = n;
        String str = "";
        helper(n, one, zero, str , list);
        return list;
    }
    public static void helper(int n, int one, int zero, String str, List<String> list){
        if(str.length() == n){
            list.add(str);
            return;
        }
        helper(n, one, zero-1, str+"0", list);
        if(one == n){
            helper(n, one-1, zero, str+"1", list);
        } else if (one >= zero && str.length()>0 && str.charAt(str.length()-1)!='1') {
            helper(n, one-1, zero, str+"1", list);
        }
    }


    public static void main(String[] args) {
        int n = 4;
        System.out.println(generateBinaryStrings2(n));
        String s = "dgf";
        System.out.println(s.charAt(0));
    }
}
