package Z_MultiThreading_Problems.a_Odd_Even_Printer;

public class OddPrinter implements Runnable{
    private final Counter counter;

    public OddPrinter(Counter counter){
        this.counter = counter;
    }

    public void run(){
        while (true){
            synchronized (counter){
                if(counter.getCount()%2 == 0 && counter.getCount() <= counter.getLimit()){
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
