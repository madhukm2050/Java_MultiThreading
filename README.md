![Java Multithreading Banner](https://img.shields.io/badge/Java%20Multithreading-Complete%20Guide-0A66C2?style=for-the-badge)

# 🧵 Java Multithreading 

---

## ⭐ Why this repo?

* ✅ Learn by **running real code** (not just theory)
* ✅ Covers **core + advanced** concurrency topics
* ✅ Includes **classic interview problems**
* ✅ Clean structure, quick navigation, and practical patterns

---

## 📚 Table of Contents

* [What is a Thread?](#-what-is-a-thread)
* [What is Multithreading?](#-what-is-multithreading)
* [Why Multithreading Matters](#-why-multithreading-matters)
* [Concepts & Direct Links](#-concepts--direct-links)

  * [Basic Thread Creation](#-1-basic-thread-creation)
  * [Memory Sharing](#-2-memory-sharing)
  * [Atomic Operations](#-3-atomic-operations)
  * [Instruction Reordering](#-4-instruction-reordering)
  * [Semaphores](#-5-semaphores)
  * [ReentrantLock & Condition](#-6-reentrantlock--condition)
  * [Thread Pool](#-7-thread-pool)
  * [Multithreading Problems](#-8-multithreading-problems-practice)

---

## 📌 What is a Thread?

A **thread** is the smallest unit of execution within a process. Multiple threads can run concurrently within the same application.

---

## 📌 What is Multithreading?

**Multithreading** allows a program to execute multiple threads concurrently to improve performance and responsiveness.

### 🔑 Key Idea

* Parallel task execution
* Better CPU utilization
* Non-blocking user experience

---

## 📌 Why Multithreading Matters

* Web servers handle **multiple requests** simultaneously
* Background jobs (email, logs, processing)
* Real-time systems and UI responsiveness

---

# 🔗 Concepts & Direct Links

## 🔹 1. Basic Thread Creation

```text
Main Thread → New Thread → run()
```

* [https://github.com/madhukm2050/Java_MultiThreading/tree/master/src/A_Basic_Thread_Example/Using_Thread](https://github.com/madhukm2050/Java_MultiThreading/tree/master/src/A_Basic_Thread_Example/Using_Thread)
* [https://github.com/madhukm2050/Java_MultiThreading/tree/master/src/A_Basic_Thread_Example/Using_Runnable](https://github.com/madhukm2050/Java_MultiThreading/tree/master/src/A_Basic_Thread_Example/Using_Runnable)

---

## 🔹 2. Memory Sharing

```text
Heap (Shared) ↔ Threads
Stack (Private) → Each Thread
```

* [https://github.com/madhukm2050/Java_MultiThreading/tree/master/src/B_Memory_Sharing](https://github.com/madhukm2050/Java_MultiThreading/tree/master/src/B_Memory_Sharing)

---

## 🔹 3. Atomic Operations

```text
count++ ❌
AtomicInteger ✔
```

* [https://github.com/madhukm2050/Java_MultiThreading/tree/master/src/C_atomic_Integer](https://github.com/madhukm2050/Java_MultiThreading/tree/master/src/C_atomic_Integer)

---

## 🔹 4. Instruction Reordering

```text
write data → set flag
read flag → read data
```

* [https://github.com/madhukm2050/Java_MultiThreading/tree/master/src/D_Instruction_Reordering](https://github.com/madhukm2050/Java_MultiThreading/tree/master/src/D_Instruction_Reordering)

---

## 🔹 5. Semaphores

```text
Permits → acquire / release
```

* [https://github.com/madhukm2050/Java_MultiThreading/tree/master/src/E_Semaphores](https://github.com/madhukm2050/Java_MultiThreading/tree/master/src/E_Semaphores)

---

## 🔹 6. ReentrantLock & Condition

```text
lock → work → signal → unlock
```

* [https://github.com/madhukm2050/Java_MultiThreading/tree/master/src/F_ReentrantLock](https://github.com/madhukm2050/Java_MultiThreading/tree/master/src/F_ReentrantLock)

---

## 🔹 7. Thread Pool

```text
Tasks → Queue → Workers → Execution
```

* [https://github.com/madhukm2050/Java_MultiThreading/tree/master/src/G_ThreadPool](https://github.com/madhukm2050/Java_MultiThreading/tree/master/src/G_ThreadPool)

---

## 🔹 8. Multithreading Problems (Practice)

```text
Threads → Coordination → Correct Order Output
```

### 📌 Problems

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
