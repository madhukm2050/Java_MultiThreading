package MultiThreading_Problems.Odd_Even_Printer;

public class EvenPrinter implements Runnable{
    private final Counter counter;

    public EvenPrinter(Counter counter){
        this.counter = counter;
    }

    public void run(){
        while (true){
            synchronized (counter){
                if(counter.getCount()%2 == 1 && counter.getCount() <= counter.getLimit()){
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
