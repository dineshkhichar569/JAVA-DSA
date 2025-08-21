package Java;

import java.util.Scanner;

public class JV_SwitchCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the name of fruit : ");
        String fruit = sc.next();

        switch (fruit) {
            case "Mango" -> System.out.println("King of fruits.");
            case "Apple" -> System.out.println("A sweet red fruit.");
            case "Orange" -> System.out.println("Round fruit.");
            default -> System.out.println("A fruit.");
        }
    }
}
