package Math;

public class pattern {

    static void p1(){
        int n = 5;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if(j <= i)
                    System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void p2(){
        int n = 5;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if(j <= n-i){
                    System.out.print("  ");
                }else{
                    System.out.print("* ");
                }
            }
            System.out.println();
        }
    }

    static void p3(){
        int n = 5;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if(j >= i){
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    static void p4(){
        int n = 5;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if(i == 1 || i == n || j == 1 || j == n){
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    static void p5(){
        int n = 5;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if((i == j) || (j == n-i+1)){
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    static void p6(){
        int n = 5;
        for (int i = 1; i <= n; i++) {
            char a = 'a';
            for (int j = 1; j <= n; j++) {
                if(j <= i){
                    System.out.print(a + j-1);
                }
            }
            System.out.println();
        }
    }

    static void p7(){
        int n = 5;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if(j <= n-i){
                    System.out.print(" ");
                }else{
                    System.out.print("* ");
                }
            }
            System.out.println();
        }
    }



//     *     *  *  *
//     *     *
//     *  *  *  *  *
//           *     *
//     *  *  *     *

    static void p8(){
        int n = 5;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if((i == 1 && j >= n/2) || (i == n/2)){
                    System.out.print("*");
                } else {
                    System.out.println(" ");
                }
            }
            System.out.println();
        }
    }

    static void main() {
        p1();

        System.out.println(" ");
        p2();

        System.out.println(" ");
        p3();

        System.out.println(" ");
        p4();

        System.out.println(" ");
        p5();

        System.out.println(" ");
//        p6();

        System.out.println(" ");
        p7();

        System.out.println(" ");
        p8();
    }
}




// 1. static ?
// Figlet  (AMZT)   ===> a library  (Browse it)
// 30+ pattern and push to github
//  and publish a blog about decode pattern on medium (must) and linkdin
//  : vs -> and return vs yield in switch cases
// in switch case we can use multiple cases in one case
// 50 question on if-else and loop  (50 q pdf on website and if we see solution then there is no score)