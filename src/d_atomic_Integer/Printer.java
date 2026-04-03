package d_atomic_Integer;

public class Printer implements Runnable{

    SharedCounter sharedCounter = new SharedCounter();

    public Printer(SharedCounter counter){
        this.sharedCounter = counter;
    }
    @Override
    public void run() {
        for (int i = 1; i <= 20000; i++){
            sharedCounter.getCounter().getAndIncrement();
        }
    }
}
