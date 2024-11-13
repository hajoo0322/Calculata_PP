package calculater_sparta;

public class Calculater {
    Calculate<Double> calculate;


    public void selectCalculater(){
        if (Database.sign.equals("ADD")){
            calculate = new AddNumber();
        } else if (Database.sign.equals("MINUS")) {
            calculate = new MinusNumber();
        } else if (Database.sign.equals("MULTIPLY")) {
            calculate = new MultiplyNumber();
        }else if(Database.sign.equals("DIVIDE")){
            calculate = new DivideNumber();
        }
    }

    public double calculate(){
        double calculate1 = calculate.calculate();
        System.out.println("계산결과는 = "+calculate1);
        System.out.println(calculate1+"결과를 데이터베이스에 저장합니다.");
        return calculate1;
    }

}
