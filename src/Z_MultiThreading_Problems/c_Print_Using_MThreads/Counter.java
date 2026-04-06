package Z_MultiThreading_Problems.c_Print_Using_MThreads;

public class Counter {
    private int count =1;
    private int limit;
    private int threads;

    public Counter(int limit, int threads){
        this.limit = limit;
        this.threads = threads;
    }

    public void print(){
        System.out.printf("%d is printed by %s \n", count, Thread.currentThread().getName());
        count++;
    }

    public int getCount() {
        return count;
    }

    public int getLimit() {
        return limit;
    }

    public int getThreads() {
        return threads;
    }
}
