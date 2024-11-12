package calculater_sparta;

public class AddNumber<E extends Number> implements Calculate<E>{

    @Override
    public double calculate(E num1, E num2) {
        return num1.doubleValue()+ num2.doubleValue();
    }
}

