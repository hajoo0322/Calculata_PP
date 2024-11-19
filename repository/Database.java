package calculater_sparta.repository;

import java.util.ArrayList;
import java.util.List;

public class Database {
    public static double number1;
    public static double number2;
    public static String sign;
    static List<Double> datas = new ArrayList<>();

    public Database() {
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
