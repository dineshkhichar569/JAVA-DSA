package Java;

public class Paractice02 {

    int a;
    int b;
    int c;

    Paractice02(int a, int c){
        this.a = a;
        this.c = c;
    }
    Paractice02(int a, int b, int c){
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public static class para extends Paractice02{
        int p;

        para(int a, int b, int c, int p) {
            super(a, b, c);
            this.p = p;
        }

        para(int a, int c, int p) {
            super(a, c);
            this.p = p;
        }
    }

    public static void main(String[] args){
        Paractice02 box = new Paractice02(2, 5, 8);
        System.out.println(box.a + " " + box.b + " " + box.c);

        Paractice02 box2 = new Paractice02(2, 8);
        System.out.println(box.a + " " + box.c);

        para box3 = new para(1, 3, 4, 5);
        System.out.println(box3.a + " " + box3.b + " " + box3.c + " " + box3.p);

        MethodoverLoading s1 = new MethodoverLoading();
        s1.sum(10);
        s1.sum(10, 5);
        s1.sum(10, 6, "Dinesh");
    }

    public static class MethodoverLoading{
        void sum(int a){
            System.out.println(a);
        }
        void sum(int a, int b){
            System.out.println(a + b);
        }
        void sum(int a, int b, String c){
            System.out.println(c + " , " + a + b);
        }
    }

}
