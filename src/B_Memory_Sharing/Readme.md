## Memory in Threads

In Java multithreading, all threads belong to the same process, so they share some memory and also have their own private memory.

### Shared Memory
Shared memory is common to all threads. It includes:
- Heap memory
- Static variables

Objects created in heap can be accessed by multiple threads.

### Private Memory
Each thread has its own private memory, which includes:
- Stack memory
- Local variables
- Method execution data

This means local variables inside a method are not shared between threads.

### Key Concept
- **Heap = Shared**
- **Stack = Private**

Because heap memory is shared, multiple threads may try to update the same data at the same time, which can lead to a **race condition**.

### Race Condition Example
When two threads modify the same variable simultaneously, the final value may become incorrect.

### Solution
Java uses **synchronization** to control access to shared resources and avoid inconsistent results.

```java
synchronized void increment() {
    count++;
}
```
### Synchronization 
Synchronization is a mechanism in Java that ensures only one thread can access a shared resource at a time.

### Thread Join
The join() method is used to make one thread wait until another thread finishes execution.