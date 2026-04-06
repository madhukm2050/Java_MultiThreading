package C_atomic_Integer;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        SharedCounter sharedCounter = new SharedCounter();

        Thread thread1 = new Thread(new Printer(sharedCounter));
        Thread thread2 = new Thread(new Printer(sharedCounter));

        thread1.start();
        thread2.start();

        thread1.join();
        thread2.join();

        System.out.println(sharedCounter.getCounter());

    }
}
