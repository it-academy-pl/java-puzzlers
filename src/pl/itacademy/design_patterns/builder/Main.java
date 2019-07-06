package pl.itacademy.design_patterns.builder;

public class Main {
    public static void main(String[] args) {
        Person person =
                Person.PersonBuilder.builder().withAddress("Krakow").withLastName("Bednarz").withFirstName("Rafal").build();
        System.out.println(person);
    }
}
