package pl.itacademy.pass_by_value;

/*
https://stackoverflow.com/questions/40480/is-java-pass-by-reference-or-pass-by-value
www.youtube.com/watch?v=ckYwv4_Qtmo
www.youtube.com/watch?v=7IkpIQc8OCw
 */
public class PassingParameters {
    public static void main(String[] args) {

        PassingParameters pm = new PassingParameters();
        int value = 1;
        pm.incrementByOne(value);
        System.out.println("int value: " + value);

        IntWrapper intWrapped = new IntWrapper(1);
        pm.incrementWrappedIntegerByOne(intWrapped);
        System.out.println("IntWrapper value: " + intWrapped.getValue());

    }

    private void incrementWrappedIntegerByOne(IntWrapper intWrapped) {
        intWrapped.setValue(intWrapped.getValue()+1);
    }

    private void incrementByOne(int value) {
        value++;
    }

}

