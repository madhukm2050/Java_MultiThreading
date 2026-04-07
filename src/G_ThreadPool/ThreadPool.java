package G_ThreadPool;

import java.util.concurrent.BlockingDeque;
import java.util.concurrent.LinkedBlockingDeque;

public class ThreadPool {
    private final int poolSize;

    private Worker[] workers;
    private BlockingDeque<Task> tasks;

    public ThreadPool(int poolSize){
        this.poolSize = poolSize;
        workers = new Worker[poolSize];
        tasks = new LinkedBlockingDeque<>();

        for(int i = 0; i < poolSize; i++){
            workers[i] = new Worker("Worker - "+i, tasks);
            workers[i].start();
        }
    }

    public void submit(Task task){
        tasks.offer(task);
    }

}
