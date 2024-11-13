package calculater_sparta;

public class SaveResults {
    Calculater calculater = new Calculater();
    Database database = new Database();

    public void saveData(double sum) {
        database.addData(sum);
    }

    public void outputData(){
        System.out.println(database.datas);
    }
}
