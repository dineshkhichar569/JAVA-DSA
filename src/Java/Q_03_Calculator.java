package Java;

import java.util.Scanner;

public class Q_03_Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int ans = 0;
        while (true) {
            System.out.print("Enter the operator : ");
            char op = sc.next().trim().charAt(0);

            if(op == '+' || op == '-' || op == '*' || op == '/' || op == '%'){
                System.out.print("Enter the two values : ");
                int a = sc.nextInt();
                int b = sc.nextInt();

                if(op == '+'){
                    ans = a+b;
                }
                if(op == '-'){
                    ans = a-b;
                }
                if(op == '*'){
                    ans = a*b;
                }
                if(op == '/'){
                    if (b != 0){
                        ans = a/b;
                    }
                    else{
                    System.out.println("Can't divide with 0.");
                    }
                }
                if(op == '%'){
                    ans = a%b;
                }
            } else if (op == 'X' || op =='x') {
                break;
            }else {
                System.out.println("Invalid Input");
            }


            System.out.println(ans);
        }
    }
}