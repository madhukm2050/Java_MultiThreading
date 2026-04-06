package Z_MultiThreading_Problems.d_Ping_Pong_Printer;

import java.util.concurrent.Semaphore;
import java.util.concurrent.atomic.AtomicInteger;

public class Main {
    public static void main(String[] args) throws InterruptedException {

        Semaphore pingSemaphore = new Semaphore(1);
        Semaphore pongSemaphore = new Semaphore(0);

        AtomicInteger count = new AtomicInteger(1);
        int max = 10;

        Thread ping = new Thread(() -> {
            try {
                while (true) {
                    pingSemaphore.acquire();

                    if (count.get() > max) {
                        pongSemaphore.release();
                        break;
                    }
                    System.out.println("count " + count.get() + " Ping");
                    pongSemaphore.release();

                    count.getAndIncrement();
                }
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });

        Thread pong = new Thread(() -> {
            try {
                while (true) {
                    pongSemaphore.acquire();

                    if (count.get() > max) {
                        pingSemaphore.release();
                        break;
                    }

                    System.out.println("count " + count.get() + " Pong");
                    pingSemaphore.release();

                    count.getAndIncrement();
                }
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });

        ping.start();
        pong.start();

        ping.join();
        pong.join();
    }
}