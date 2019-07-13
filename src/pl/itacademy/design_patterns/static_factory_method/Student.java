package pl.itacademy.design_patterns.static_factory_method;

import java.util.Date;

/*
Advantages:
1. static factory methods, unlike constructors, have names
2. static factory methods, unlike constructors, are not required to create a new object each time they’re invoked
3. static factory methods, unlike constructors, can return an object of any subtype of their return type
4. the class of the returned object can vary from call to call as a function of the input parameters.

The main limitation of providing only static factory methods is that
classes without public or protected constructors cannot be subclassed.

Examples in Java API:

BigInteger.valueOf
Date.from
List.of - since Java 9

*/
public class Student {
    private String name;
    private String surname;
    private Date created;

/*    static public Student createStudent(String name, String surname) {
        return new Student
    }*/
}
