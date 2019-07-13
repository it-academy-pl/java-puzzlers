package pl.itacademy.design_patterns.singleton;

public class Singleton {
    private static Singleton instance;

    private Singleton() {
    }

    public static Singleton getInstance() {
        if (instance == null) {
            System.out.println("creating instance");
            instance = new Singleton();
        } else {
            System.out.println("instance already exist");
        }
        return instance;
    }

}