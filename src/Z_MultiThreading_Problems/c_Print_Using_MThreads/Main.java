package Z_MultiThreading_Problems.c_Print_Using_MThreads;

public class Main {
    public static void main(String[] args) {
        Counter counter = new Counter(10, 3);

        Thread p1 = new Thread(new Printer(counter, 0),"First Thread");
        Thread p2 = new Thread(new Printer(counter, 1),"Second Thread");
        Thread p3 = new Thread(new Printer(counter, 2),"Third Thread");

        p1.start();
        p2.start();
        p3.start();
    }
}
