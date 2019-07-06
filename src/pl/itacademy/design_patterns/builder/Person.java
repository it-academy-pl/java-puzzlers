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

    private Person () {}

    public static final class PersonBuilder {
        private String firstName;
        private Gender gender;
        private String lastName;
        private String phoneNumber;
        private String pesel;
        private String nip;
        private String address;

        private PersonBuilder() {
        }

        public static PersonBuilder aPerson() {
            return new PersonBuilder();
        }

        public PersonBuilder withFirstName(String firstName) {
            this.firstName = firstName;
            return this;
        }

        public PersonBuilder withGender(Gender gender) {
            this.gender = gender;
            return this;
        }

        public PersonBuilder withLastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        public PersonBuilder withPhoneNumber(String phoneNumber) {
            this.phoneNumber = phoneNumber;
            return this;
        }

        public PersonBuilder withPesel(String pesel) {
            this.pesel = pesel;
            return this;
        }

        public PersonBuilder withNip(String nip) {
            this.nip = nip;
            return this;
        }

        public PersonBuilder withAddress(String address) {
            this.address = address;
            return this;
        }

        public Person build() {
            Person person = new Person();
            person.gender = this.gender;
            person.phoneNumber = this.phoneNumber;
            person.nip = this.nip;
            person.pesel = this.pesel;
            person.lastName = this.lastName;
            person.address = this.address;
            person.firstName = this.firstName;
            return person;
        }
    }

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
