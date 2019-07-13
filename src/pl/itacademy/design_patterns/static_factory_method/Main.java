package pl.itacademy.design_patterns.static_factory_method;


public class Main {

    public static void main(String[] args) {
        Student student = Student.createStudentWithCreationDate("Rafal", "Bednarz");
        System.out.println(student.toString());


    }
}
