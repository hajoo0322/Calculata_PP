package calculater_sparta.service;

import calculater_sparta.repository.Database;
import calculater_sparta.performCalculations.*;

public class Calculater {
    Calculate<Double> calculate;

    public Calculater(Calculate<Double> calculate) {
        this.calculate = calculate;
    }

    public double calculate(double num1,double num2){
        double calculate1 = calculate.calculate(num1,num2);
        System.out.println("계산결과는 = "+calculate1);
        System.out.println(calculate1+"결과를 데이터베이스에 저장합니다.");
        return calculate1;
    }

}
