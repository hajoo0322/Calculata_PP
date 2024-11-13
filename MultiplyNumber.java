package calculater_sparta;

public class MultiplyNumber implements Calculate<Double> {

    @Override
    public Double calculate() {
        return Database.number1*Database.number2;
    }
}
