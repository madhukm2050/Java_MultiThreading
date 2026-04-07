# 🧵 Java Multithreading

## 📌 What is a Thread?

A **thread** is the smallest unit of execution within a program. A single process can contain multiple threads that run concurrently.

👉 Think of a thread as a lightweight worker inside a program.

---

## 📌 What is Multithreading?

**Multithreading** is the ability of a program to execute multiple threads concurrently to improve performance and responsiveness.

### 🔑 Key Idea

* Multiple tasks run simultaneously
* Better CPU utilization
* Faster execution for independent tasks

---

## 📌 Why Multithreading is Important

* Improves performance
* Enables parallel execution
* Used in real-world systems like:

  * Web servers
  * Applications with background tasks
  * Games
  * Data processing systems

---

## 🧠 How to Use This Repository

This repository is designed as a **learning roadmap**.

👉 Instead of reading theory here, directly explore each concept through code using the links below.

---

# 🔗 Concepts & Direct Links

## 🔹 1. Basic Thread Creation

```text
Main Thread → New Thread → run()
```

👉 Links:

* [https://github.com/madhukm2050/Java_MultiThreading/tree/master/src/A_Basic_Thread_Example/Using_Thread](https://github.com/madhukm2050/Java_MultiThreading/tree/master/src/A_Basic_Thread_Example/Using_Thread)
* [https://github.com/madhukm2050/Java_MultiThreading/tree/master/src/A_Basic_Thread_Example/Using_Runnable](https://github.com/madhukm2050/Java_MultiThreading/tree/master/src/A_Basic_Thread_Example/Using_Runnable)

---

## 🔹 2. Memory Sharing

```text
Heap (Shared) ↔ Threads
Stack (Private) → Each Thread
```

👉 Link:

* [https://github.com/madhukm2050/Java_MultiThreading/tree/master/src/B_Memory_Sharing](https://github.com/madhukm2050/Java_MultiThreading/tree/master/src/B_Memory_Sharing)

---

## 🔹 3. Atomic Operations

```text
count++ ❌ (not safe)
AtomicInteger ✔ (safe)
```

👉 Link:

* [https://github.com/madhukm2050/Java_MultiThreading/tree/master/src/C_atomic_Integer](https://github.com/madhukm2050/Java_MultiThreading/tree/master/src/C_atomic_Integer)

---

## 🔹 4. Instruction Reordering

```text
Thread-1 → write data → set flag
Thread-2 → read flag → read data

(incorrect visibility possible ❌)
```

👉 Link:

* [https://github.com/madhukm2050/Java_MultiThreading/tree/master/src/D_Instruction_Reordering](https://github.com/madhukm2050/Java_MultiThreading/tree/master/src/D_Instruction_Reordering)

---

## 🔹 5. Semaphores

```text
Permits → control access
Threads → acquire / release
```

👉 Link:

* [https://github.com/madhukm2050/Java_MultiThreading/tree/master/src/E_Semaphores](https://github.com/madhukm2050/Java_MultiThreading/tree/master/src/E_Semaphores)

---

## 🔹 6. ReentrantLock & Condition

```text
lock → work → signal → unlock
```

👉 Link:

* [https://github.com/madhukm2050/Java_MultiThreading/tree/master/src/F_ReentrantLock](https://github.com/madhukm2050/Java_MultiThreading/tree/master/src/F_ReentrantLock)

---

## 🔹 7. Thread Pool

```text
Tasks → Queue → Workers → Execution
```

👉 Link:

* [https://github.com/madhukm2050/Java_MultiThreading/tree/master/src/G_ThreadPool](https://github.com/madhukm2050/Java_MultiThreading/tree/master/src/G_ThreadPool)

---

## 🔹 8. Multithreading Problems (Practice)

```text
Threads → Coordination → Correct Order Output
```

### 📌 Problems & Links

* **Odd Even Printer**
  [https://github.com/madhukm2050/Java_MultiThreading/tree/master/src/Z_MultiThreading_Problems/a_Odd_Even_Printer](https://github.com/madhukm2050/Java_MultiThreading/tree/master/src/Z_MultiThreading_Problems/a_Odd_Even_Printer)

* **Odd Even Printer (Optimized)**
  [https://github.com/madhukm2050/Java_MultiThreading/tree/master/src/Z_MultiThreading_Problems/b_Odd_Even_Printer_optimized](https://github.com/madhukm2050/Java_MultiThreading/tree/master/src/Z_MultiThreading_Problems/b_Odd_Even_Printer_optimized)

* **Print Using Multiple Threads**
  [https://github.com/madhukm2050/Java_MultiThreading/tree/master/src/Z_MultiThreading_Problems/c_Print_Using_MThreads](https://github.com/madhukm2050/Java_MultiThreading/tree/master/src/Z_MultiThreading_Problems/c_Print_Using_MThreads)

* **Ping Pong Printer**
  [https://github.com/madhukm2050/Java_MultiThreading/tree/master/src/Z_MultiThreading_Problems/d_Ping_Pong_Printer](https://github.com/madhukm2050/Java_MultiThreading/tree/master/src/Z_MultiThreading_Problems/d_Ping_Pong_Printer)

* **Print A B C in Order**
  [https://github.com/madhukm2050/Java_MultiThreading/tree/master/src/Z_MultiThreading_Problems/e_Print_A_B_C](https://github.com/madhukm2050/Java_MultiThreading/tree/master/src/Z_MultiThreading_Problems/e_Print_A_B_C)

* **Multithreaded FizzBuzz**
  [https://github.com/madhukm2050/Java_MultiThreading/tree/master/src/Z_MultiThreading_Problems/f_Print_FIZZ_BUZZ](https://github.com/madhukm2050/Java_MultiThreading/tree/master/src/Z_MultiThreading_Problems/f_Print_FIZZ_BUZZ)

* **Zero Even Odd**
  [https://github.com/madhukm2050/Java_MultiThreading/tree/master/src/Z_MultiThreading_Problems/g_ZeroEvenOdd](https://github.com/madhukm2050/Java_MultiThreading/tree/master/src/Z_MultiThreading_Problems/g_ZeroEvenOdd)

* **Traffic Light Controller**
  [https://github.com/madhukm2050/Java_MultiThreading/tree/master/src/Z_MultiThreading_Problems/h_TrafficLightController](https://github.com/madhukm2050/Java_MultiThreading/tree/master/src/Z_MultiThreading_Problems/h_TrafficLightController)

---


## 🧠 One-Line Summary

> Learn multithreading by exploring real implementations instead of just theory.
