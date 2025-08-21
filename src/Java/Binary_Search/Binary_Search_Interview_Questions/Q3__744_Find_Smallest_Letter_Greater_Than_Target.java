package Java.Binary_Search.Binary_Search_Interview_Questions;

public class Q3__744_Find_Smallest_Letter_Greater_Than_Target {

    static char Smallest(char[] letters, char target){
        int start = 0;
        int end = letters.length-1;

        while(start <= end) {
            int mid = start + (end - start) / 2;

            if (target < letters[mid]) {
                end = mid - 1;
            } else{
                start = mid + 1;
            }
        }
        return letters[start % letters.length];
    }

    public static void main(String[] args) {
//        char[] letters = { 'a', 'f', 'g', 'i', 'l', 'o', 'q'};
        char[] letters = { 'x', 'x', 'y', 'y', 'z'};

        char ans = Smallest(letters, 'y');

        System.out.println(ans);
    }
}
