package calculater_sparta;

public class Claculater_Oop {
    private int number1;
    private int number2;
    private char booho;



    public char getBooho() {
        return booho;
    }

    public int getNumber2() {
        return number2;
    }

    public void setNumber1(int number1) {
        this.number1 = number1;
    }

    public void setNumber2(int number2) {
        this.number2 = number2;
    }

    public void setBooho(char booho) {
        this.booho = booho;
    }

    public int getNumber1() {
        return number1;


    }

    public Claculater_Oop(int number1, char booho, int number2) {
        this.number1 = number1;
        this.number2 = number2;
        this.booho = booho;


    }

    public int addnumber(){
        return number1 + number2;
    }
    public int minusnumber(){
        return number1 - number2;
    }
    public int multiplynumber(){
        return number1 * number2;
    }
    public int dividenumber(){
        return number1 / number2;
    }
    public void claculate(){
        if (booho=='+'){
            System.out.println(addnumber());
        } else if (booho=='-'){
            System.out.println(minusnumber());
        } else if (booho=='*'){
            System.out.println(multiplynumber());
        } else if (booho=='/'){
            System.out.println(dividenumber());
        } else {
            System.out.println(booho+" 부호를 입력해주세요. 계산을 할수없습니다.");
        }
    }
}
