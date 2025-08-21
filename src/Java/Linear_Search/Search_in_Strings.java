package Java.Linear_Search;

import java.util.Arrays;

public class Search_in_Strings {
    public static void main(String[] args) {
        String name = "Sunny";
        char character = 'S';

        // TO CONVERT String INTO Array
        System.out.println(Arrays.toString(name.toCharArray()));

        boolean T_F =  Search(name, character);
        System.out.println(T_F + " character.");

        boolean T_F2 =  Search2(name, character);
        System.out.println(T_F2 + " character.");
    }

    static boolean Search(String name, char ch){
        if (name.length() == 0) {
            return false;
        }

        for (int i = 0; i < name.length(); i++) {
            if(name.charAt(i) == ch){
                return true;
            }
        }

        return false;
    }


    static boolean Search2(String name, char ch){
        if (name.length() == 0) {
            return false;
        }

        for(char c: name.toCharArray()){
            if(ch == c){
                return true;
            }
        }

        return false;
    }

}
