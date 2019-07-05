package pl.itacademy.threads;

public class Main {
    public static void main(String[] args) {
        AccountTesting accountTesting = new AccountTesting();
        Thread one = new Thread(accountTesting);
        Thread two = new Thread(accountTesting);
        Thread three = new Thread(accountTesting);
        Thread four = new Thread(accountTesting);
        Thread five = new Thread(accountTesting);

        one.setName("fds");
        two.setName("ads");
        three.setName("asd");
        four.setName("fds");
        five.setName("ds");
        one.start();
        two.start();
        three.start();
        four.start();
        five.start();
    }

}
