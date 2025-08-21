package LeetCode;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.stream.IntStream;

public class array_repeat {
    public static void main(String[] args) {

        int[] arr = {12, 23, 34};
        int repeat = 5;

        int[] repeatedArr = IntStream.range(0, repeat)
                .flatMap(i -> Arrays.stream(arr))
                .toArray();
        System.out.println(Arrays.toString(repeatedArr));


//        int[] evenNumbers = Arrays.stream(arr)
//                .filter(n -> n % 2 == 0)
//                .toArray();
//        System.out.println(Arrays.toString(evenNumbers));
//

    }
}
