package Z_MultiThreading_Problems.b_Odd_Even_Printer_optimized;

public class Printer implements Runnable{
    private final Counter counter;
    private int threadId;

    public Printer(Counter counter, int threadId){
        this.counter = counter;
        this.threadId = threadId;
    }

    public void run(){
        while (true){
            synchronized (counter){
                if((counter.getCount()) % 2 != threadId && counter.getCount() <= counter.getLimit()){
                    try {
                        counter.wait();
                    }
                    catch (InterruptedException e){
                        throw new RuntimeException(e);
                    }
                }
                if (counter.getCount() > counter.getLimit()){
                    counter.notifyAll();
                    break;
                }
                counter.print();
                counter.notifyAll();
            }
        }
    }
}
