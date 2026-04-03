package d_atomic_Integer;

import java.util.concurrent.atomic.AtomicInteger;

public class SharedCounter{

    AtomicInteger counter = new AtomicInteger();

    public AtomicInteger getCounter() {
        return counter;
    }

    public void setCounter(AtomicInteger counter) {
        this.counter = counter;
    }
}
