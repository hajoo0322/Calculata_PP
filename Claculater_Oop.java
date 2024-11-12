package calculater_sparta;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Claculater_Oop<E> {
    private int number1;
    private int number2;
    private String booho;
    private int[] resluts = new int[5];
    private int size = 0;

    private static final String OPERATION_REG = "[+\\-*/]";
    private static final String NUMBER_REG = "^[0-9]*$";

    public void setNumber1(int number1) {
        this.number1 = number1;
    }

    public void setNumber2(int number2) {
        this.number2 = number2;
    }

    public void setBooho(String booho) {
        this.booho = booho;
    }

    private int addNumber(){
        int sum = number1 + number2;
        arrayHistorySave(sum);
        return sum;
    }

    private int minusNumber(){
        int sum = number1 - number2;
        arrayHistorySave(sum);
        return sum;
    }

    private int multiplyNumber(){
        int sum = number1 * number2;
        arrayHistorySave(sum);
        return sum;
    }

    private int divideNumber(){
        int sum = number1 / number2;
        arrayHistorySave(sum);
        return sum;
    }

    public void claculate(){
        if (booho.equals("+")){
            System.out.println(addNumber());
        } else if (booho.equals("-")){
            System.out.println(minusNumber());
            } else if (booho.equals("*")){
            System.out.println(multiplyNumber());
        } else if (booho.equals("/")){
            System.out.println(divideNumber());
        }
    }

    private void sizeupArray(){
            int[] newresult = new int[resluts.length*2];
            for (int i=0; i<resluts.length;i++) {
                newresult[0] = resluts[0];
                resluts = newresult;
            }
    }

    private void arrayHistorySave(int sum) {
        if (size >= resluts.length){
            sizeupArray();
        }
        for (int i = 0; i<resluts.length;i++){
            if (resluts[i]==0){
                resluts[i]= sum;
                size++;
                break;
            }
        }
    }

    public void checkResults() {
        for (int reslut : resluts) {
            if(reslut!=0) {
                System.out.println(reslut);
            }
        }
    }

    public void insertNumber1(String number, int index) throws BadInputException {
        Pattern pattern = Pattern.compile(NUMBER_REG);
        Matcher matcher = pattern.matcher(number);
        if (matcher.matches()) {
            if (index==1){
                setNumber1(Integer.parseInt(number));
            } else if (index ==2){
                setNumber2(Integer.parseInt(number));
            }
        } else {
            throw new BadInputException("정수");
        }
    }

    public void insertBooho(String booho) throws BadInputException {
            a(booho);
            setBooho(booho);
    }

    public void a(String booho) throws BadInputException {
        Pattern pattern = Pattern.compile(OPERATION_REG);
        Matcher matcher = pattern.matcher(booho);
        if (!matcher.matches()){
            throw new BadInputException("연산자");
        }
    }

    public void removeresults(){
        resluts[0]=0;
        for (int i = 1; i<resluts.length;i++){
            if (resluts[i]!=0){
                resluts[i-1] = resluts[i];
                resluts[i] = 0;
            }
        }
    }
}
