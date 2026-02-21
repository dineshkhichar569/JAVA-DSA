package String;

public class LC_2259 {
    public static String removeDigit(String number, char digit) {
        int max = -1;
        for(int i = 0; i < number.length(); i++){
            String str = number;
            char c = number.charAt(i);
            if( c == digit){
                str = str.substring(0, i) + str.substring(i + 1);
                int n = Integer.valueOf(str);
                max = Math.max(max, n);
            }
        }

        return Integer.toString(max);
    }

    static void main() {
        String number = "1231";
        char digit = '1';
        System.out.println(removeDigit(number, digit));
    }
}
