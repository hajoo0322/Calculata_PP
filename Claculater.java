package calculater_sparta;

public interface Claculater<E> {
    public void addNum();

    public void minus();

    public void multiply();

    public void divide();

    public void setNumber1(E number1);

    public void setNumber2(E number2);

    public void setsign(String sign);
}
