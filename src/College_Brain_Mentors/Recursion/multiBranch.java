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

    static void main() {
        multi(3);
    }
}
