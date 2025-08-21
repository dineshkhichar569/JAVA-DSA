package Java;
public class JV_Scope {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        {
//            int a = 40;   // Already initialized outside the block you cannot initialized it again.

            a = 50;   // you can upgrade the value inside the scope.

            int c = 30;

            //// Values initialized in this block will remain in the block you can't access them outside the Scope.
           ////  But you can upgrade values inside the Scope.

        }
        System.out.println(a);  // output: 50
//        System.out.println(c);  // It will give error. so, Bring c into Scope.
    }
}
