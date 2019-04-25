package pl.itacademy.pools;

/*
This is example to demonstrate how Integer pool works.
References:
https://stackoverflow.com/questions/13098143/why-does-the-behavior-of-the-integer-constant-pool-change-at-127
 */

public class IntegerPool {
    public static void main(String[] args) {

        Integer intNew_1 = new Integer(3);
        Integer intNew_2 = new Integer(3);
        Integer intLiteral_1 = 3;
        Integer intLiteral_2 = 3;
        Integer intValueOf = Integer.valueOf(3);

        System.out.println("Two integers with same value created with constructor");
        System.out.println(intNew_1== intNew_2);
        System.out.println("Two integers with same value created with constructor");
        System.out.println(intNew_1== intLiteral_1);
        System.out.println("Two integers with same value created with literal");
        System.out.println(intLiteral_1== intLiteral_2);
        System.out.println("One integer created with constructor, another one with valueOf");
        System.out.println(intNew_2== intValueOf);
        System.out.println("One integer screated with literal, another one with valueOf");
        System.out.println(intLiteral_1== intValueOf);

        Integer intBiggerThan127 = Integer.valueOf(128);
        Integer anotherIntBiggerThan127 = Integer.valueOf(128);
        System.out.println("Two integers bigger than 127 with same value created with literal");
        System.out.println(intBiggerThan127==anotherIntBiggerThan127);

    }
}
