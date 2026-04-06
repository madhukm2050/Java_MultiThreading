package A_Basic_Thread_Example.Using_Thread;

public class Main {
    public static void main(String[] args) {
        BasicThread thread = new BasicThread();
        thread.start();
        System.out.println("Hello World!");
    }
}
