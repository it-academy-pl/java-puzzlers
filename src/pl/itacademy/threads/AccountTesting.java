package pl.itacademy.threads;

public class AccountTesting implements Runnable {
    Account account = new Account();

    @Override
    public void run() {
        makeWithdrawal(10);
    }

    private void makeWithdrawal(int amount) {
        if (account.getBalance() >= amount) {
            System.out.println(Thread.currentThread().getName() + " is going to withdraw");
            try {
                Thread.sleep(100);
            } catch (InterruptedException ex) {
            }
            account.withdraw(amount);
            System.out.println(Thread.currentThread().getName() + " completes the withdrawal");
        } else {
            System.out.println("Not enough in account for " + Thread.currentThread().getName() + " to withdraw " + account.getBalance());
        }
    }
}
