package Java;

public class Q_01_Counting_Occurrence {
    public static void main(String[] args) {
        int a = 249328272;

        int count = 0;
        while(a > 0){
            int remainder = a % 10;  // to find remainder of a number which is its last digit every time it run
            if(remainder == 2){
                count++;
            }
            a = a / 10;   // to update the number as it is reduces its last digit every time it run
        }
        System.out.println(count);

    }
}