package pl.itacademy.design_patterns.builder;

public class Person {
    private String firstName;
    private Gender gender;
    private String lastName;
    private String phoneNumber;
    private String pesel;
    private String nip;
    private String address;

    public enum Gender {MALE, FEMALE}

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", gender=" + gender +
                ", lastName='" + lastName + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", pesel='" + pesel + '\'' +
                ", nip='" + nip + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
