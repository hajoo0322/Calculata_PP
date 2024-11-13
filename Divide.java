package calculater_sparta;

public class Divide implements Calculate{


    @Override
    public double calculate() {
        return Database.number1/Database.number2;
    }
}
