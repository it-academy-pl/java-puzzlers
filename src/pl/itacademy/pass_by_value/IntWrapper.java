package pl.itacademy.pass_by_value;

public class IntegerWrapper {
    private int value;

    public IntegerWrapper(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public void incrementByOne() {
        value++;
    }
}
