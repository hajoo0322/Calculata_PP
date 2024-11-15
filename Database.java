package calculater_sparta;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Database {
    static double number1;
    static double number2;
    static String sign;
    static List<Double> datas = new ArrayList<>();

    public void addData(double sum){
        datas.add(sum);
    }

    public void compare(double value) {
        datas.stream().filter(a -> a > value).forEach(System.out::println);
    }


    public void removeFirst(){
        datas.remove(0);
    }

}
