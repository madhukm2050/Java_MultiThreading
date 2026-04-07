package Z_MultiThreading_Problems.g_ZeroEvenOdd;

public class Main {
    public static void main(String[] args) {
        ZeroEvenOdd zeroEvenOdd = new ZeroEvenOdd(10);

        Thread thread1 = new Thread(()-> zeroEvenOdd.print_zero());
        Thread thread2 = new Thread(()-> zeroEvenOdd.print_odd());
        Thread thread3 = new Thread(() -> zeroEvenOdd.print_even());

        thread1.start();
        thread2.start();
        thread3.start();

    }
}
