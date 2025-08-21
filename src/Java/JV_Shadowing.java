package Java;

public class JV_Shadowing {

    static int x = 20;  // this will shadowed at line 9

    public static void main(String[] args) {
        System.out.println(x);  // 20

         int x = 40;  // the class variable at line 4 is shawed by this.
        System.out.println(x);  //
    }
}
