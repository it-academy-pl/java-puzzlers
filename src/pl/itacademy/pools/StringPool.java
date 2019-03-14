package pl.itacademy.pools;


/*
This is example to demonstrate how string pools work.
References:
https://www.journaldev.com/797/what-is-java-string-pool
https://www.baeldung.com/java-string-pool
https://stackoverflow.com/questions/10578984/what-is-java-string-interning
https://www.youtube.com/watch?v=hdgRaJ-G5DE
 */
public class StringPool {

    public static void main(String[] args) {

        String stringNew1 = new String("Test");
        String stringNew2 = new String("Test");
        String stringLiteral1 = "Test";
        String stringLiteral2 = "Test";


        System.out.println("Two strings of the same value created with Constructor: ");
        //System.out.println(stringNew1 == stringNew2);
        System.out.println("One string created with constructor, another one with literal: ");
        //System.out.println(stringNew1 == stringLiteral1);
        System.out.println("Two strings of the same value created with literal: ");
        //System.out.println(stringLiteral2 == stringLiteral1);
        System.out.println("One string created with constructor and interned, another one created with literal: ");
        //System.out.println(stringNew1.intern() == stringLiteral1);
    }

}
