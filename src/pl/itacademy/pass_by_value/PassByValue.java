package pl.itacademy.pass_by_value;

/*
In Java we always pass-by-value. However when passing object we pass value of its reference.
https://stackoverflow.com/questions/40480/is-java-pass-by-reference-or-pass-by-value
www.youtube.com/watch?v=ckYwv4_Qtmo
www.youtube.com/watch?v=7IkpIQc8OCw
 */
public class PassByValue {
    public static void main(String[] args) {

        PassByValue passByValue = new PassByValue();
        int value = 1;
        passByValue.incrementByOne(value);
        System.out.println("int value: " + value);

        IntWrapper intWrapped = new IntWrapper(1);
        passByValue.incrementWrappedIntByOne(intWrapped);
        System.out.println("IntWrapper value: " + intWrapped.getValue());

    }

    private void incrementWrappedIntByOne(IntWrapper intWrapped) {
        intWrapped.setValue(intWrapped.getValue()+1);
    }

    private void incrementByOne(int value) {
        value++;
    }

}

