package LeetCode;

// 1. exact same approach as for ceiling of a number.
// 2. Ignore the target = what we are looking for.
// 3. if arr = ['c', 'f', 'j'], target = 'j'
//       then, ans = 'c'  (0th element)


public class Find_Smallest_Letter_Greater_Than_Target {
    public static void main(String[] args) {
//        char[] letters = {'c', 'f', 'j'};
//        char[] letters = {'a', 'c', 'f', 'j', 'm', 'o', 'r', 't'};
        char[] letters = {'e', 'e', 'e', 'e', 'e', 'e', 'n', 'n', 'n', 'n'};
        System.out.println(letter(letters, 'n'));
//        System.out.println(letters.length);
    }

    static char letter(char[] letters, char target){
        int start = 0;
        int end = letters.length-1;

        while(start <= end){
            int mid = start + (end - start)/2;
            if(target < letters[mid]){ /// this order is important
                end = mid - 1;
            }
            else{
                start = mid + 1;
            }
        }

        return letters[start % letters.length];
    }

//    static char Greater(char[] letters, char target){
//        int start = 0;
//        int end = letters.length-1;
//
//        while (start <= end){
//            int mid = start + (end - start)/2;
//
//            if(target > letters[mid]){
//                start = mid + 1;
//            }
//            else{
//                end = mid - 1;
//            }
//        }
//        if(target == letters[start]){
//            if(target == letters[letters.length-1]){
//                start = 0;
//            }
//            else{
//                start = start % letters.length;
//            }
//        }
//        return letters[start];
//    }

}
