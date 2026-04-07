package Z_MultiThreading_Problems.g_ZeroEvenOdd;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class ZeroEvenOdd {
    private final ReentrantLock lock = new ReentrantLock();
    private final Condition zero = lock.newCondition();
    private final Condition even = lock.newCondition();
    private final Condition odd = lock.newCondition();
    private int p = 1;
    private boolean zero_num = true;

    private int n;

    public ZeroEvenOdd(int n){
        this.n = n;
    }

    public void print_zero(){
        for(int i = 1; i <= n; i++){
            lock.lock();

            try{
                while (!zero_num){
                    zero.await();
                }
                System.out.println(0);
                if (p % 2 == 1) {
                    odd.signal();
                } else {
                    even.signal();
                }
                zero_num = false;
            }
            catch (InterruptedException e){
                throw new RuntimeException(e);
            }
            finally {
                lock.unlock();
            }
        }
    }

    public void print_odd(){
        for(int i = 1; i <= n; i++){
            lock.lock();

            try{
                while (zero_num || p%2 == 0){
                    odd.await();
                }
                System.out.println(p);
                zero_num = true;
                zero.signal();
                p++;
            }
            catch (InterruptedException e){
                throw new RuntimeException(e);
            }
            finally {
                lock.unlock();
            }
        }
    }

    public void print_even(){
        for(int i = 1; i <= n; i++){
            lock.lock();
            try{
                while (zero_num || p%2 == 1){
                    even.await();
                }
                System.out.println(p);
                zero_num = true;
                zero.signal();
                p++;
            }
            catch (InterruptedException e){
                throw new RuntimeException(e);
            }
            finally {
                lock.unlock();
            }
        }
    }
}
