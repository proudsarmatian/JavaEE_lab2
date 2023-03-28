public class Main {
    public static void main(String[] args) throws InterruptedException {
        final Bank bank = new Bank();
        Thread thread1 = new Thread1(bank);
        Thread thread2 = new Thread2(bank);
        thread1.start();
        thread2.start();
        thread2.join();
        thread1.join();
    }
}