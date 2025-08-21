package Java.Recursion_Interview_Questions;

import javax.xml.transform.Source;
import java.util.ArrayList;
import java.util.List;

public class LC_3014_Minimum_Number_of_Pushes_to_Type_Word_I {
    public static List<String> word(String p, String up){
        if(up.isEmpty()){
            List<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        List<String > list = new ArrayList<>();
        for (int i = 0; i < up.length(); i++) {
            char ch = up.charAt(i);
            list.addAll(word(p + ch, up.substring(1)));
        }
        return list;
    }

    public static void main(String[] args) {
        System.out.println(word("", ""));
    }
}
