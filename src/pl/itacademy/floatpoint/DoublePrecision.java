package pl.itacademy.floatpoint;

/*
This puzzler demonstrates pitfalls related to double memory structure
Read more: https://en.wikipedia.org/wiki/Double-precision_floating-point_format
 */

public class DoublePrecision {

    private static final double THRESHOLD = 0.000000001;

    public static void main(String[] args) {

        double d1 = 0.0;
        for (int i = 0; i < 10; i++) {
            d1+=0.1;
        }
        double d2 = 1.0;

        System.out.println("d1 = " + d1);
        System.out.println("d2 = " + d2);

        if (d1 == d2) {
            System.out.println("d1 and d2 are equal");
        } else {
            System.out.println("d1 and d2 are NOT equal");
        }

        if (Math.abs(d1 - d2) < THRESHOLD) {
            System.out.println("d1 and d2 are equal with THRESHOLD");
        } else {
            System.out.println("d1 and d2 are NOT equal with THRESHOLD");
        }


        //FIXME : how to stop this loop after 10 iterations?
//        System.out.println("This While Loop never ends:");
//        double d3 = 0.0;
//        while (true) {
//            System.out.println("d3 = " + d3);
//            d3+=0.1;
//            if (d3 == 1.0) {
//                break;
//            }
//        }
    }
}
