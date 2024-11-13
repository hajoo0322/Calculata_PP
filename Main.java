package calculater_sparta;

public class Main {
    public static void main(String[] args) throws BadInputException {
        boolean gostop = true;
        while(gostop) {
            gostop =CalulatingMachine.start();
        }
    }
}
