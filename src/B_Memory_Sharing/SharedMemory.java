package B_Memory_Sharing;

class Counter {
    int count = 0; // shared variable (stored in heap)
    public void increment() {
        count++;
    }
}

public class SharedMemory {

    public static void main(String[] args) {

        // Shared object
        Counter1 counter = new Counter1();

        // Thread 1
        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                counter.increment();
            }
        });

        // Thread 2
        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                counter.increment();
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

        System.out.println("Final count (Shared Memory): " + counter.count);

        /*
         * Expected: 2000
         * But sometimes output may be incorrect due to race condition.
         */


    }
}