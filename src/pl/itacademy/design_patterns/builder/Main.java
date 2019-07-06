package pl.itacademy.design_patterns.builder;

public class Main {
    public static void main(String[] args) {
        Person person = Person.PersonBuilder.builder().address("Krakow").lastName("Bednarz").firstName("Rafal").build();
        System.out.println(person);
    }
}
