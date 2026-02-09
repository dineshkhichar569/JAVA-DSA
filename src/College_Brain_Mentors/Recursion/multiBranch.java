package College_Brain_Mentors.Recursion;

public class multiBranch {
    static void multi(int n){
        if(n <= 0){
            return;
        }
        System.out.println("Output : " + n);

        multi(n-1);
        multi(n-2);
    }
    static void multiMiddle(int n){
        if(n <= 0){
            return;
        }

        multiMiddle(n-1);
        System.out.println("B/W : " + n);
        multiMiddle(n-2);
        System.out.println("LAST : " + n);
    }

    static void main() {
//        multi(3);
        multiMiddle(3);
    }
}
