package calculater_sparta;

import java.util.Scanner;

public class OopMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Claculater_Oop oop = new Claculater_Oop();
        while (true) {
            System.out.println("첫번째 숫자입력");

            String number1 = sc.next();
            try {
                oop.insertNumber1(number1,1);
            } catch (Exception e) {
                System.out.println(e.getMessage());
                continue;
            }

            System.out.println("부호 입력");
            String booho = sc.next();
            try {
                oop.insertBooho(booho);
            } catch (Exception e) {
                System.out.println(e.getMessage());
                continue;
            }

            System.out.println("두번째 숫자입력");
            String number2 = sc.next();
            try {
                oop.insertNumber1(number2,2);
            } catch (Exception e) {
                System.out.println(e.getMessage());
                continue;
            }

            oop.claculate();
            boolean areyoucontinue = true;
            while (areyoucontinue) {
                System.out.println("계산을 종료합니까?");
                String stop = sc.next();
                if (stop.equals("exit")) {
                    System.out.println("계산을 종료합니다");
                    System.out.println("계산 로그를 확인합니다.");
                    oop.checkResults();
                    oop.removeresults();
                    oop.checkResults();
                    System.exit(1);
                } else {
                    System.out.println("새로운 계산을 시작합니다.");
                    areyoucontinue = false;
                }
            }
        }

    }
}
