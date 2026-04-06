package E_Semaphores;

import java.util.concurrent.Semaphore;

public class Main {
    public static void main(String[] args) throws InterruptedException{
        Semaphore semaphore = new Semaphore(3);

        semaphore.acquire();
        System.out.println("The car 1 acquired the parking slot");

        semaphore.acquire();
        System.out.println("The car 2 acquired the parking slot");

        semaphore.acquire();
        System.out.println("The car 3 acquired the parking slot");

        // If we release one semaphore the waiting semaphore be executed
        semaphore.release();

        semaphore.acquire();
        System.out.println("The car 4 acquired the parking slot");



        System.out.println();
    }
}
