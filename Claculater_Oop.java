package calculater_sparta;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Claculater_Oop {
    private int number1;
    private int number2;
    private String booho;
    private int[] resluts = new int[5];
    private int size = 0;

    private static final String OPERATION_REG = "[+\\-*/]";
    private static final String NUMBER_REG = "^[0-9]*$";

    public String getBooho() {
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

    public void setBooho(String booho) {
        this.booho = booho;
    }

    public int getNumber1() {
        return number1;
    }

    private int addnumber(){
        int sum = number1 + number2;
        add(sum);
        return sum;
    }
    private int minusnumber(){
        int sum = number1 - number2;
        add(sum);
        return sum;
    }
    private int multiplynumber(){
        int sum = number1 * number2;
        add(sum);
        return sum;
    }
    private int dividenumber(){
        int sum = number1 / number2;
        add(sum);
        return sum;
    }
    public void claculate(){
        if (booho.equals("+")){
            System.out.println(addnumber());
        } else if (booho.equals("-")){
            System.out.println(minusnumber());
            } else if (booho.equals("*")){
            System.out.println(multiplynumber());
        } else if (booho.equals("/")){
            System.out.println(dividenumber());
        }
    }
    private void savecollection(){
            int[] newresult = new int[resluts.length*2];
            for (int i=0; i<resluts.length;i++) {
                newresult[0] = resluts[0];
                resluts = newresult;
            }
    }

    private void add(int sum) {
        if (size >= resluts.length){
            savecollection();
        }
        for (int i = 0; i<resluts.length-1;i++){
            if (resluts[i]==0){
                resluts[i]= sum;
                size++;
                break;
            }
        }
    }

    public void checkresults() {
        for (int reslut : resluts) {
            if(reslut!=0) {
                System.out.println(reslut);
            }
        }
    }

    public void insertnumber1(String number) throws BadInputException {
        Pattern pattern = Pattern.compile(NUMBER_REG);
        Matcher matcher = pattern.matcher(number);
        if (matcher.matches()) {
            setNumber1(Integer.parseInt(number));
        } else {
            throw new BadInputException("정수");
        }
    }

    public void insertbooho(String booho) throws BadInputException {
        Pattern pattern = Pattern.compile(OPERATION_REG);
        Matcher matcher = pattern.matcher(booho);
        if (matcher.matches()) {
            if (booho.equals("+")) {
                this.booho = booho;
            } else if (booho.equals("-")) {
                this.booho = booho;
            } else if (booho.equals("*")) {
                this.booho = booho;
            } else if (booho.equals("/")) {
                this.booho = booho;
            }
        }  else {
            throw new BadInputException("연산자");
        }

    }

    public void insertnumber2(String number) throws BadInputException {
        Pattern pattern = Pattern.compile(NUMBER_REG);
        Matcher matcher = pattern.matcher(number);
        if (matcher.matches()) {
            setNumber2(Integer.parseInt(number));
        } else {
            throw new BadInputException("정수");
        }

    }
}
