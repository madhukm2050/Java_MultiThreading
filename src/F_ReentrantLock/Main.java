package F_ReentrantLock;

public class Main {
    public static void main(String[] args) {
        PingPong pingPong = new PingPong();

        Thread thread1 = new Thread(()->pingPong.ping());
        Thread thread2 = new Thread(()->pingPong.pong());

        thread1.start();
        thread2.start();
    }
}
