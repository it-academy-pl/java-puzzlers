package pl.itacademy.callable;

import jdk.nashorn.internal.codegen.CompilerConstants;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;
import java.util.stream.IntStream;

public class Main {
    private ExecutorService pool;

    public static void main(String[] args) throws Exception {
        Main main = new Main();
        main.generateRandomNumbers();
    }

    private void generateRandomNumbers() throws Exception {

        Callable<Integer> worker = new IntegerGenerator();


        for (int i = 0; i < 5; i++) {
            worker.call();
        }

        FutureTask[] futureTask = new FutureTask[5];
        for (int i = 0; i < 5; i++) {
            futureTask[i] = new FutureTask<>(worker);
            Thread thread = new Thread(futureTask[i]);
            thread.start();
        }

        //Thread thread = new Thread(futureTask);


    }
}
