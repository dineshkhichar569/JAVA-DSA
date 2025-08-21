package Java.Recursion_Interview_Questions;

import java.util.ArrayList;
import java.util.List;

public class Amazon_Questions__Dice_Throw_Letter_Combinations_of_a_Phone_Number {
    public static List<String> dice(String p, int target){
        if(target == 0){
            List<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        List<String> comb = new ArrayList<>();
        for (int i = 1; i <= 6 && i<=target; i++) {
            comb.addAll(dice(p + i, target-i));
        }
        return comb;
    }

    public static void dice2(String p, int target){
        if(target == 0){
            System.out.println(p);
            return;
        }
        for (int i = 1; i <= 6 && i<=target; i++) {
            dice2(p + i, target-i);
        }
    }

    public static void main(String[] args) {
        int t = 4;
        System.out.println(dice("", t));
//        dice2("", t);
    }
}
