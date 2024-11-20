package calculater_sparta.exceptionHandling;

public class BadInputException extends Exception{
    public BadInputException(String type){
        super("잘못된 입력입니다."+type+"을 입력해주세요");
    }
//여기 오버로딩
    public  BadInputException() {
        super("0으로 나눌수 없습니다.");

    }
}
