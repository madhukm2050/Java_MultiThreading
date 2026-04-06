package Z_MultiThreading_Problems.c_Print_Using_MThreads;

public class Printer implements Runnable{

    private Counter counter;
    private int threadId;
    public Printer(Counter counter, int threadId){
        this.counter = counter;
        this.threadId = threadId;
    }

    public void run(){
        while (true){
            synchronized (counter){
                while ((counter.getCount()-1) % counter.getThreads() != threadId && counter.getCount() <= counter.getLimit()){
                    try {
                        counter.wait();
                    }catch (InterruptedException e){
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
