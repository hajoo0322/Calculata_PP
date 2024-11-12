package calculater_sparta;

import java.util.Scanner;

public class OopMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while(true) {
            System.out.println("첫번째 숫자입력");

            int num1= sc.nextInt();
            System.out.println("부호 입력");
            char booho = sc.next().charAt(0);
            System.out.println("두번째 숫자입력");
            int num2= sc.nextInt();

            Claculater_Oop oop = new Claculater_Oop(num1, booho, num2);
            oop.claculate();

            boolean areyoucontinue = true;
            while(areyoucontinue){
                System.out.println("계산을 종료합니까?");
                String stop = sc.next();
                if (stop.equals("exit")){
                    System.out.println("계산을 종료합니다 안녕...");
                    System.exit(1);
                } else {
                    System.out.println("새로운 계산을 시작합니다.");
                    areyoucontinue = false;
                }
            }
        }
    }
}
