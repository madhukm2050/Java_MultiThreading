package G_ThreadPool;

public class Task implements Runnable{

    public int id;

    public Task(int id){
        this.id = id;
    }

    public void run(){
        System.out.println("Task "+id+" is executed by "+Thread.currentThread().getName());
    }
}
