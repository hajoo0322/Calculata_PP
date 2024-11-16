package calculater_sparta.controller;

import calculater_sparta.service.CalculatingMachine;
import calculater_sparta.exceptionHandling.BadInputException;

public class Main {
    public static void main(String[] args) throws BadInputException {
        boolean gostop = true;
        while(gostop) {
            gostop = CalculatingMachine.start();

        }
    }
}
