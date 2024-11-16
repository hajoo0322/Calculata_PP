package calculater_sparta.repository;

public enum OperatorType {
    ADD,MINUS,MULTIPLY,DIVIDE ;
    public static boolean isSame(String string){
        for (OperatorType o : OperatorType.values()) {
            if (o.name().equals(string)){
                return true;
            }
        }
        return false;
    }
}
