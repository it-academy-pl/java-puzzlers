package pl.itacademy.callable;

import java.util.Random;
import java.util.concurrent.Callable;

public class IntegerGenerator implements Callable {

    private static final long FIVE_SECONDS = 5_000;

    @Override
    public Integer call() throws Exception {
        System.out.println("Generating random number");
        Thread.sleep(FIVE_SECONDS);
        Integer randomNumber = new Random().nextInt(8) + 1;
        System.out.println("Random number generated");
        return randomNumber;
    }
}
