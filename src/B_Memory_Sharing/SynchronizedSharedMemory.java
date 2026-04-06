package B_Memory_Sharing;

class Counter1 {
    int count = 0; // shared variable (stored in heap)
    synchronized void increment() {
        count++;
    }
}

public class SynchronizedSharedMemory {

    public static void main(String[] args) {

        // Shared object
        Counter1 counter1 = new Counter1();

        // Thread 1
        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                counter1.increment();
            }
        });

        // Thread 2
        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                counter1.increment();
            }
        });

        t1.start();
        t2.start();


        // we are using join here because Fizz_Buzz_Using_Semaphore method prints too early
        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Final count (Shared Memory): " + counter1.count);

        /*
         * Expected: 2000
         */


    }
}