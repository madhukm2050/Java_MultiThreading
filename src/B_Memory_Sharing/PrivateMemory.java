package B_Memory_Sharing;

public class PrivateMemory {
    public static void main(String[] args) {

        Thread t1 = new Thread(() -> {
            int x = 10; // private to Thread 1
            System.out.println("Thread 1 local x = " + x);
        });

        Thread t2 = new Thread(() -> {
            int x = 20; // private to Thread 2
            System.out.println("Thread 2 local x = " + x);
        });

        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        /*
         * Here both threads have their own 'x'
         * So no conflict occurs.
         */
    }
}
