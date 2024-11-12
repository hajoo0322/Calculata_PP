package calculater_sparta;

public class BadInputException extends Exception {
    public BadInputException(String string) {
        super("잘못된 입력입니다."+string +"을(를)입력해주세요");

    }
}
