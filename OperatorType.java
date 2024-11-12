package calculater_sparta;

public enum OperatorType {
    ADD, MINUS, MULTIPLY, DIVIDE;

    public static boolean contains(String sign) {
        for (OperatorType value : OperatorType.values()) {
            if (value.name().equals(sign)) {
                return true;
            }
        }
        return false;
    }
}
