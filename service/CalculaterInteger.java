package calculater_sparta.service;

import calculater_sparta.performCalculations.Calculate;

public class CalculaterInteger {
    Calculate<Integer> calculate;

    public CalculaterInteger(Calculate<Integer> calculate) {

        this.calculate = calculate;
    }
    
    public int calculate(){
        int calculate1 = calculate.calculate();
        System.out.println("계산결과는 = "+calculate1);
        System.out.println(calculate1+"결과를 데이터베이스에 저장합니다.");
        return calculate1;
    }

}
