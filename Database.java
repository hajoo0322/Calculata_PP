package calculater_sparta;

import java.util.ArrayList;
import java.util.List;

public class Database {
    static double number1;
    static double number2;
    static String sign;
    static List<Double> datas = new ArrayList<>();

    public void addData(double sum){
        datas.add(sum);
    }
}
