public class Thread2 extends Thread implements Runnable {
    private Bank bank;
    public Thread2(Bank b) {
        bank = b;
    }
    @Override
    public void run() {
        synchronized (this) {
            for (int i = 1; i <= 200000; i++) {
                bank.setAccount(bank.getAccount() - 1);
            }
            System.out.println("Thread decrement " + bank.getAccount());
        }
    }
}
