package Linked_List.Questions;

public class LC_202_Happy_Number {

    /////////////////////////   Uses the same method as Linked List Cycle I
    ////////////////////////   Think of slow and fast pointer approach

    public static boolean isHappy(int n) {
        int slow = n;
        int fast = n;

        do {
            slow = newNum(slow);
            fast = newNum(newNum(fast));
        } while(fast != slow);

        if(slow == 1) return true;

        return false;
    }

    private static int newNum(int x){
        int ans = 0;

        while(x > 0){
            int rem = x % 10;
            ans = ans + (rem*rem);
            x = x/10;
        }
        return ans;
    }

    public static void main(String[] args) {
        int n = 11;

        System.out.println(isHappy(n));
    }
}
