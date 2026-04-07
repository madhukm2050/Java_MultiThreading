package Z_MultiThreading_Problems.h_TrafficLightController;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class TrafficLightController1 {
    private final ReentrantLock lock = new ReentrantLock();

    private final Condition north = lock.newCondition();
    private final Condition east = lock.newCondition();

    private final Condition south = lock.newCondition();
    private final Condition west = lock.newCondition();

    int n;
    int direction = 0;

    public TrafficLightController1(int n){
        this.n = n;
    }
    public void northSignal(){
        for (int i = 0; i < n; i++){
            lock.lock();
            try{
                while (direction != 0){
                    north.await();
                }
                System.out.println("North Signal is GREEN, Rest are RED");
                direction = (direction+1)%4;
                east.signal();
            }catch (InterruptedException e){
                throw  new RuntimeException(e);
            }
            finally {
                lock.unlock();
            }

        }
    }

    public void eastSignal(){
        for (int i = 0; i < n; i++){
            lock.lock();
            try{
                while (direction != 1){
                    east.await();
                }
                System.out.println("East Signal is GREEN, Rest are RED");
                direction = (direction+1)%4;
                south.signal();
            }catch (InterruptedException e){
                throw new RuntimeException(e);
            }
            finally {
                lock.unlock();
            }
        }
    }

    public void southSignal(){
        for (int i = 0; i < n; i++){
            lock.lock();
            try{
                while (direction != 2){
                    south.await();
                }
                System.out.println("South Signal is GREEN, Rest are RED");
                direction = (direction+1)%4;
                west.signal();
            }catch (InterruptedException e){
                throw  new RuntimeException(e);
            }
            finally {
                lock.unlock();
            }
        }
    }

    public void westSignal(){
        for (int i = 0; i < n; i++){
            lock.lock();
            try{
                while (direction != 3){
                    west.await();
                }
                System.out.println("West Signal is GREEN, Rest are RED");
                direction = (direction+1)%4;
                north.signal();
            }catch (InterruptedException e){
                throw new RuntimeException(e);
            }
            finally {
                lock.unlock();
            }
        }
    }


}
