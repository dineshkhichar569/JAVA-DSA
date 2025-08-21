package Java;

import java.util.ArrayList;

public class JV_ArrayList {
    public static void main(String[] args) {
        ArrayList<String> lis = new ArrayList<>();

        lis.add("sdfw");
        lis.add("sdfw");
        lis.add("sdfw");

        System.out.println(lis);

        System.out.println(" ");

        ArrayList<Integer> list = new ArrayList<>();

        list.add(234);
        list.add(345);
        list.add(235);
        list.add(344);
        list.add(274);
        list.add(834);
        list.add(434);
        list.add(423);
        list.add(567);
        list.add(786);
        list.add(567);
        list.add(789);

        System.out.println(list);

        System.out.println(" ");

        System.out.println(list.contains(234));

        System.out.println(" ");

        list.set(0, 5643);  /// to replace
        list.remove(1);  /// to remove
        System.out.println(list);

        System.out.println(" ");

        for (int i = 0; i < 10; i++) {
            System.out.print(list.get(i) + " ");
        }

    }
}
