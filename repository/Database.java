package calculater_sparta.repository;

import java.util.ArrayList;
import java.util.List;

public class Database {
    private double number1;
    private double number2;
    private String sign;
    static List<Double> datas = new ArrayList<>();

    public double getNumber1() {
        return number1;
    }

    public double getNumber2() {
        return number2;
    }

    public String getSign() {
        return sign;
    }

    public void setNumber1(double number1) {
        this.number1 = number1;
    }

    public void setNumber2(double number2) {
        this.number2 = number2;
    }

    public void setSign(String sign) {
        this.sign = sign;
    }

    public void addData(double sum){
        datas.add(sum);
    }

    public void compare(double value) {

        datas.stream()
                .filter(a -> a > value)
                .forEach(System.out::println);
    }


    public void removeFirst(){
        datas.remove(0);
    }

}
