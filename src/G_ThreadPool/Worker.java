package G_ThreadPool;

import java.util.concurrent.BlockingDeque;

public class Worker extends Thread{
    BlockingDeque<Task> taskQueue;

    public Worker(String name, BlockingDeque<Task> taskQueue){
        super(name);
        this.taskQueue = taskQueue;
    }

    public void run(){
        while (true){
            try{
                Runnable task = taskQueue.take();
                task.run();
            }
            catch (InterruptedException e){
                Thread.currentThread().interrupt();
                break;
            }
        }
    }
}
