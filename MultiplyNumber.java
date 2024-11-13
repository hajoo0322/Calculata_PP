package calculater_sparta;

public class MultiplyNumber implements Calculate {

    @Override
    public double calculate() {
        return Database.number1*Database.number2;
    }
}
