package Z_MultiThreading_Problems.f_Print_FIZZ_BUZZ;

import java.util.concurrent.Semaphore;
import java.util.concurrent.atomic.AtomicInteger;

public class Fizz_Buzz_Using_Semaphore {
    public static void main(String[] args) throws InterruptedException{
        Semaphore fizz = new Semaphore(0);
        Semaphore buzz = new Semaphore(0);
        Semaphore fizzBuzz = new Semaphore(0);
        Semaphore number = new Semaphore(1);

        AtomicInteger count = new AtomicInteger(1);
        int n = 15;
        Thread thread1 = new Thread(()->{ // prints fizz
            try {
                while (true){
                    fizz.acquire();

                    System.out.println(count +" - FIZZ");

                    count.getAndIncrement();
                    
                    if (count.get() > n)break;

                    if (count.get() % 3 == 0 && count.get()%5 == 0){
                        fizzBuzz.release();
                    }
                    else if(count.get()%3 == 0){
                        fizz.release();
                    }
                    else if (count.get()%5 == 0){
                        buzz.release();
                    }
                    else {
                        number.release();
                    }
                }
            }catch (InterruptedException e){
                throw new RuntimeException(e);
            }
        });

        Thread thread2 = new Thread(()->{ // prints Buzz
            try {
                while (true){
                    buzz.acquire();
                    System.out.println(count +" - BUZZ");

                    count.getAndIncrement();

                    if (count.get() > n)break;

                    if (count.get() % 3 == 0 && count.get()%5 == 0){
                        fizzBuzz.release();
                    }
                    else if(count.get()%3 == 0){
                        fizz.release();
                    }
                    else if (count.get()%5 == 0){
                        buzz.release();
                    }
                    else {
                        number.release();
                    }
                }
            }catch (InterruptedException e){
                throw new RuntimeException(e);
            }
        });

        Thread thread3 = new Thread(()->{ // prints fizz buzz
            try {
                while (true){
                    fizzBuzz.acquire();
                    System.out.println(count +" - FIZZ BUZZ");
                    count.getAndIncrement();
                    if (count.get() > n)break;

                    if (count.get() % 3 == 0 && count.get()%5 == 0){
                        fizzBuzz.release();
                    }
                    else if(count.get()%3 == 0){
                        fizz.release();
                    }
                    else if (count.get()%5 == 0){
                        buzz.release();
                    }
                    else {
                        number.release();
                    }
                }
            }catch (InterruptedException e){
                throw new RuntimeException(e);
            }
        });

        Thread thread4 = new Thread(()->{ // prints fizz
            try {
                while (true){
                    number.acquire();
                    System.out.println(count +" - number");
                    count.getAndIncrement();
                    if (count.get() > n) break;
                    if (count.get() % 3 == 0 && count.get()%5 == 0){
                        fizzBuzz.release();
                    }
                    else if(count.get()%3 == 0){
                        fizz.release();
                    }
                    else if (count.get()%5 == 0){
                        buzz.release();
                    }
                    else {
                        number.release();
                    }
                }
            }catch (InterruptedException e){
                throw new RuntimeException(e);
            }
        });

        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();

        thread1.join();
        thread2.join();
        thread3.join();
        thread4.join();
    }
}
