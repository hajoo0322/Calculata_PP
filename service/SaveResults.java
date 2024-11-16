package calculater_sparta.service;

import calculater_sparta.performCalculations.AddNumber;
import calculater_sparta.performCalculations.DivideNumber;
import calculater_sparta.performCalculations.MinusNumber;
import calculater_sparta.performCalculations.MultiplyNumber;
import calculater_sparta.repository.Database;

public class SaveResults {
    Calculater calculater = new Calculater(new AddNumber());
    public Database database = new Database();

    public void saveData(double sum) {
        database.addData(sum);
    }

    public void selectCalculater(){
        if (Database.sign.equals("ADD")){
            calculater = new Calculater(new AddNumber());
        } else if (Database.sign.equals("MINUS")) {
            calculater = new Calculater(new MinusNumber());
        } else if (Database.sign.equals("MULTIPLY")) {
            calculater = new Calculater(new MultiplyNumber());
        }else if(Database.sign.equals("DIVIDE")){
            calculater = new Calculater(new DivideNumber());
        }
    }
}
