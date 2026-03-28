package MultiThreading_Problems.Odd_Even_Printer;

public class Counter {
    private int count = 1;
    private int limit;

    public Counter(int limit){
        this.limit = limit;
    }

    public void print(){
        System.out.printf("%d is printed by %s \n", count, Thread.currentThread().getName());
        count++;
    }

    public  int getCount() {
        return count;
    }

    public int getLimit() {
        return limit;
    }
}
