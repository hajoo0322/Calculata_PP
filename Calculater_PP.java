package calculater_sparta;

import java.util.Scanner;

public class Calculater_PP {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            int num1 = sc.nextInt();
            if (num1 < 0) {
                System.out.println("양의 정수를 입력하시오");
                break;
            }


            String booho = sc.next();
            int num2 = sc.nextInt();
            if (num2 < 0) {
                System.out.println("양의 정수를 입력하시오");
                break;
            }
            if (booho.equals("+")) {
                System.out.println(num1 + num2);
                break;
            } else if (booho.equals("-")) {
                System.out.println(num1 - num2);
                break;
            } else if (booho.equals("*")) {
                System.out.println(num1 * num2);
                break;
            } else if (booho.equals("/")) {
                System.out.println(num1 / num2);
                break;
            }
        }


    }
}
