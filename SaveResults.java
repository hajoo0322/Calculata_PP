package calculater_sparta;

public class SaveResults {
    Calculate<?> calculate;

    public void selectCalculater(){
        if (Database.sign.equals("ADD")){
            calculate = new AddNumber<>();
        } else if (Database.sign.equals("MINUS")) {
            calculate = new MinusNumber<>();
        } else if (Database.sign.equals("MULTIPLY")) {
            calculate = new MultiplyNumber<>();
        }else if(Database.sign.equals("DIVIDE")){
            calculate = new Divide<>();
        }
    }
}
