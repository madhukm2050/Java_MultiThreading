package Z_MultiThreading_Problems.e_Print_A_B_C;

import java.util.concurrent.Semaphore;

public class Main {
    public static void main(String[] args) throws InterruptedException{
        Semaphore A = new Semaphore(1);
        Semaphore B = new Semaphore(0);
        Semaphore C = new Semaphore(0);

        Thread thread1 = new Thread(()->{
            try{
                for (int i = 0; i < 3; i++){
                    A.acquire();
                    System.out.println("A "+Thread.currentThread().getName());
                    B.release();
                }
            }catch (Exception e){
                throw new RuntimeException(e);
            }
        });

        Thread thread2 = new Thread(()->{
            try{
                for (int i = 0; i < 3; i++){
                    B.acquire();
                    System.out.println("B "+Thread.currentThread().getName());
                    C.release();
                }
            }catch (Exception e){
                throw new RuntimeException(e);
            }
        });

        Thread thread3 = new Thread(()->{
            try{
                for (int i = 0; i < 3; i++){
                    C.acquire();
                    System.out.println("C "+Thread.currentThread().getName());
                    A.release();
                }
            }catch (Exception e){
                throw new RuntimeException(e);
            }
        });

        thread1.start();
        thread2.start();
        thread3.start();

        thread1.join();
        thread2.join();
        thread3.join();


    }
}
