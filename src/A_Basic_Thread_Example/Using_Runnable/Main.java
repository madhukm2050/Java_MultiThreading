package A_Basic_Thread_Example.Using_Runnable;

public class Main {
    public static void main(String[] args) {
        BasicRunnableThread basicRunnableThread = new BasicRunnableThread();
        basicRunnableThread.run();
        System.out.println("Hello World");
    }
}
