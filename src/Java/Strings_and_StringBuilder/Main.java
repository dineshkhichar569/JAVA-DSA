package Java.Strings_and_StringBuilder;

import java.util.Arrays;

public class Main{
    public static void main(String[] args) {
        String a = "Dinesh";
        String b = "Dinesh";

        System.out.println(a==b);

        String c = new String("Khichar");
        String d = new String("Khichar");

        System.out.println(c==d);
        System.out.println(c.equals(d));

        System.out.println(new int[]{3,4,5,7,22,6});
        System.out.println(Arrays.toString(new int[]{3,4,5,7,22,6}));
    }
}
