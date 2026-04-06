# Odd-Even Printer (Java Multithreading)

## Overview

This project demonstrates a classic Java multithreading problem: printing odd and even numbers in sequential order using two separate threads. One thread is responsible exclusively for printing odd numbers, while the other prints even numbers. They coordinate to count up to a specified limit.

## Concepts Demonstrated

* **Multithreading:** Creating and running multiple threads (`Thread` and `Runnable`).

* **Synchronization:** Using the `synchronized` block to control access to a shared resource.

* **Inter-Thread Communication:** Utilizing `wait()` and `notifyAll()` to coordinate execution order between threads.

## Project Structure

The solution consists of four main classes:

1. **`Counter`**: The shared resource. It maintains the current `count` and the maximum `limit`. It also provides the `print()` method, which outputs the current number and the name of the thread printing it, then increments the count.

2. **`EvenPrinter`**: A `Runnable` task executed by the "Even Thread". It loops continuously, synchronizing on the `Counter` object. It waits if the current number is odd. If it is even, it prints the number and notifies the other thread.

3. **`OddPrinter`**: A `Runnable` task executed by the "Odd Thread". Its logic mirrors `EvenPrinter`, but it waits if the current number is even and prints when it is odd.

4. **`Main`**: The entry point of the application. It initializes the `Counter` with a specific limit, creates the two threads, and starts their execution.

## How It Works (The Logic)

To understand how the threads coordinate without stepping on each other, let's look at a sequence diagram showing what happens if the **Even Thread** accidentally gets the CPU first when the count is `1`.

### Execution Flow Diagram

```text
[Even Thread]                     [Shared Counter]                     [Odd Thread]
     |                               (Count = 1)                             |
     |                                    |                                  |
     |--- 1. Acquires Lock -------------->|                                  |
     |    2. Checks: 1 % 2 == 1 (True)    |                                  |
     |       (Not my turn to print)       |                                  |
     |    3. Calls wait()                 |                                  |
     |<-- 4. Releases Lock & Sleeps ------|                                  |
     |                                    |                                  |
     |                                    |<--- 5. Acquires Lock ------------|
     |                                    |     6. Checks: 1 % 2 == 0 (False)|
     |                                    |        (It IS my turn!)          |
     |                                    |     7. Prints "1"                |
     |                                    |     8. Count becomes 2           |
     |                                    |     9. Calls notifyAll()         |
     |                                    |--- 10. Releases Lock ----------->|
     |                               (Count = 2)                             |
     |<-- 11. Wakes up & Gets Lock -------|                                  |
     |    12. Checks: 2 % 2 == 1 (False)  |                                  |
     |        (It IS my turn!)            |                                  |
     |    13. Prints "2"                  |                                  |
     |    14. Count becomes 3             |                                  |
     |    15. Calls notifyAll()           |                                  |
     |--- 16. Releases Lock ------------->|                                  |
     |                                    |                                  |
     |         (Process repeats until Count > Limit)                         |