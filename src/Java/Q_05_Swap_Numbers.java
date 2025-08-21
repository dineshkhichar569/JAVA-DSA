package Java;

public class Q_05_Swap_Numbers {
    public static void main(String[] args) {
        int x = 4;
        int y = 5;
        swap(x, y);
        System.out.println(x + " , " + y);
    }
    static void swap (int a, int b){
        int temp = a;
        a = b;
        b = temp;
    }
}

///////  You can't Swap numbers using Method  ////////