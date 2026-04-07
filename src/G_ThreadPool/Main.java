package G_ThreadPool;

public class Main {
    public static void main(String[] args) {
        ThreadPool threadPool = new ThreadPool(3);

        for (int i = 0; i < 10; i++){
            threadPool.submit(new Task(i));
        }
    }
}
