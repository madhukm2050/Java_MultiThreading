# 🔐 Semaphore in Multithreading (Java)

## 📌 What is a Semaphore?

A **Semaphore** is a synchronization mechanism used to control how many threads can access a shared resource at the same time.

> It uses a **counter (permits)** to allow or block threads.

---

## 🔑 Simple Definition

A semaphore is:
- A **counter-based synchronization tool**
- That allows **limited number of threads** to enter a critical section

---

## 🧠 Real-Life Analogy

### 🚗 Parking Lot Example
- Parking lot has **3 slots**
- Only **3 cars (threads)** can enter
- Others must **wait**

---

## ⚙️ How Semaphore Works

A semaphore maintains a number called **permits**

### 🔹 `acquire()`
- Decreases permit count
- If permits = 0 → thread waits

### 🔹 `release()`
- Increases permit count
- Wakes up waiting thread

---

## 🔄 Flow
Initial permits = 2

- Thread A → acquire() → enters (permits = 1)
- Thread B → acquire() → enters (permits = 0)
- Thread C → acquire() → waits ❌

- Thread A → release() → permits = 1
- Thread C → resumes ✅

---

## 📌 Types of Semaphore

### 1. Binary Semaphore
- Permits = 1
- Works like a **mutex (lock)**

### 2. Counting Semaphore
- Permits > 1
- Allows multiple threads

---

## 🔑 Key Properties of Semaphore

### 1. ✔️ Permit-Based Control
- Semaphore works using a **counter (permits)**
- Each thread must acquire a permit before entering
- Permits decrease on `acquire()` and increase on `release()`

---

### 2. ✔️ Supports Multiple Threads
- Unlike locks, semaphore can allow **multiple threads simultaneously**
- Number of threads allowed = number of permits

---

### 3. ✔️ Blocking Behavior
- If no permits are available:
    - Threads calling `acquire()` will **block (wait)**
- They resume only when a permit is released

---

### 4. ✔️ Non-Blocking Option
- Provides methods like:
```java
tryAcquire()