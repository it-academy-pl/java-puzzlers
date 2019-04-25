package pl.itacademy.overload;

public class OverloadConfuse {

    public static void main(String[] args) {
        add(1, 2);
        //add(1.0, 2.0);
        //add(1.0f, 2.0f);
        //add(null, null);
    }

    private static void add(Integer a, Integer b) {
        System.out.println("Sum of Integers");
    }

    private static void add(int a, int b) {
        System.out.println("Sum of ints");
    }

    private static void add(float a, float b) {
        System.out.println("Sum of floats");
    }

    private static void add(double a, double b) {
        System.out.println("Sum of doubles");
    }

    private static void add(Double a, Double b) {
        System.out.println("Sum of Doubles");
    }

    private static void add(Object a, Object b) {
        System.out.println("Sum of Objects");
    }
}
