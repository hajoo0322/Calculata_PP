package calculater_sparta;

public class MinusNumber implements Calculate{


    @Override
    public double calculate() {
        return Database.number1-Database.number2;
    }
}
