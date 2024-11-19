package calculater_sparta.service;

import calculater_sparta.performCalculations.Calculate;

public class CalculaterInteger {
    Calculate<Integer> calculate;

    public CalculaterInteger(Calculate<Integer> calculate) {

        this.calculate = calculate;
    }
    
    public int calculate(double num1,double num2){
        int calculate1 = calculate.calculate(num1,num2);
        System.out.println("계산결과는 = "+calculate1);
        System.out.println(calculate1+"결과를 데이터베이스에 저장합니다.");
        return calculate1;
    }

}
