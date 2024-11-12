package calculater_sparta;

import java.util.Scanner;

public class OopMain {
    public static void main(String[] args) {
        CheckApp app = new CheckApp();
        Scanner sc = new Scanner(System.in);
        Claculater<?>[] results = new Claculater[5];
        boolean goStop = true;
        while(goStop){
            try {


                String number1 = sc.next();
                app.verify(number1);
                String sign = sc.next();
                app.check(sign);
                String number2 = sc.next();
                app.verify(number2);

                app.engraft();
            }catch (BadInputException e){
                System.out.println(e.getMessage());
            }

        }
    }
}
