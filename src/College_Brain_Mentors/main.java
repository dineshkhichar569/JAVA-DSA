package College_Brain_Mentors;

public class main {
    public static void printName(int n){
        if(n == 0){
            return;
        }

        System.out.println("Dinesh Khichar");
        printName(n-1);
    }

    static void main() {
        int n = 5;

        printName(n);
    }
}
