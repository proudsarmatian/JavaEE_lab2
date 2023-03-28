public class Thread1 extends Thread implements Runnable {
    private Bank bank;
    public Thread1(Bank b) {
        bank = b;
    }
    @Override
    public void run() {
        synchronized (this) {
            for (int i = 1; i <= 200000; i++) {
                bank.setAccount(bank.getAccount() + 2);
            }
            System.out.println("Thread increment " + bank.getAccount());
        }
    }
}
