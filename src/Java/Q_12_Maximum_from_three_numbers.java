package Java;

public class Q_12_Maximum_from_three_numbers {
    public static void main(String[] args) {
     max(30, 4, 6);
    }

    static void max(int a, int b, int c){

//        if(a > b){
//            System.out.println(a);
//        } else if (c > a) {
//            System.out.println(c);
//        }else {
//            System.out.println(b);
//        }


        String result = (a > b) ? ("a is greater.") : ( (c > a)? ("c is greater.") : ("b is greater.") );
        System.out.println(result);
    }
}
