package calculater_sparta.service;

import calculater_sparta.exceptionHandling.BadInputException;
import calculater_sparta.performCalculations.AddNumber;
import calculater_sparta.performCalculations.DivideNumber;
import calculater_sparta.performCalculations.MinusNumber;
import calculater_sparta.performCalculations.MultiplyNumber;
import calculater_sparta.repository.Database;

public class SaveResults {
    Calculater calculater;
    Database database;

    public SaveResults(Database database) {
        this.database = database;
    }

    public void saveData(double sum) {
        database.addData(sum);
    }

    public void selectCalculater() throws BadInputException {
        if (database.getSign().equals("ADD")){
            calculater = new Calculater(new AddNumber());
        } else if (database.getSign().equals("MINUS")) {
            calculater = new Calculater(new MinusNumber());
        } else if (database.getSign().equals("MULTIPLY")) {
            calculater = new Calculater(new MultiplyNumber());
        }else if(database.getSign().equals("DIVIDE")){
            if (database.getNumber2() == 0) {
                throw new BadInputException();
            }
            calculater = new Calculater(new DivideNumber());
        }
    }

    public double orderCalculate() {

      return calculater.calculate(database.getNumber1(), database.getNumber2());
    }
}
