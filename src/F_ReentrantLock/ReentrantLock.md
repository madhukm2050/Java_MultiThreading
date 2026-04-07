# ReentrantLock in Java (Theory Explanation)

## What is ReentrantLock?

ReentrantLock is a synchronization mechanism in Java used to control access to shared resources in multithreading.

It is part of the `java.util.concurrent.locks` package and provides more flexibility and control compared to the traditional synchronized keyword.

---

## Why is it called "Reentrant"?

A lock is called **reentrant** when the same thread can acquire the lock multiple times without getting blocked.

This means:
- If a thread already holds the lock, it can enter again
- The lock internally keeps a count of how many times it has been acquired
- The thread must release the lock the same number of times

This prevents deadlocks in nested method calls.

---

## Key Idea of ReentrantLock

ReentrantLock ensures:
- Only one thread accesses the critical section at a time
- Other threads must wait until the lock is released

Unlike synchronized, it provides explicit control over locking and unlocking.

---

## What is a Condition?

A **Condition** is used along with ReentrantLock to manage communication between threads.

It works similarly to:
- wait()
- notify()
- notifyAll()

But is more flexible.

With Condition:
- Threads can pause execution until a specific condition is met
- Threads can signal other waiting threads when they can continue

---

## Important Concepts

### 1. Locking
A thread must acquire the lock before entering the critical section.

If another thread already holds the lock:
- The current thread will wait

---

### 2. Unlocking
After completing its work, the thread must release the lock.

If the lock is not released:
- Other threads will remain blocked
- This can cause deadlock

---

### 3. Waiting (Condition Await)
When a thread cannot proceed (because a condition is not satisfied):
- It goes into a waiting state
- It temporarily releases the lock
- Other threads can then acquire the lock

---

### 4. Signaling
When a thread finishes its work:
- It signals another waiting thread
- The waiting thread wakes up and tries to acquire the lock again

---

## Explanation using Ping-Pong Concept

Imagine two threads:
- One prints "Ping"
- One prints "Pong"

They must print alternately like:
Ping → Pong → Ping → Pong

---

### Shared State

A shared variable is used to decide whose turn it is:
- If it is Ping’s turn → only Ping should execute
- If it is Pong’s turn → only Pong should execute

---

### How Coordination Works

#### Step 1: Ping starts
- Initially, it is Ping’s turn
- Ping prints its message
- Then it changes the turn to Pong

#### Step 2: Ping signals Pong
- Ping wakes up the Pong thread
- Ping releases the lock

---

#### Step 3: Pong runs
- Pong checks if it is its turn
- If yes, it prints its message
- Then it switches the turn back to Ping

#### Step 4: Pong signals Ping
- Pong wakes up the Ping thread
- Pong releases the lock

---


## Thread Interaction Diagram
    Ping Thread                        Pong Thread
         │                                  │
         │ lock acquired                    │
         │                                  │
         │ ---> Executes                    │ waiting
         │                                  │
         │ signals -----------------------> │ wakes up
         │                                  │
         │ releases lock                    │ acquires lock
         │                                  │
         │ waiting                          │ ---> Executes
         │                                  │
         │ <------------------------------- signals
         │                                  │
         │ wakes up                         │ releases lock
---
                ┌──────────────────────────────┐
                │      Shared Resource         │
                │    (Critical Section)        │
                └────────────┬─────────────────┘
                             │
                     ┌───────▼────────┐
                     │ ReentrantLock  │
                     └───────┬────────┘
                             │
             ┌───────────────┼───────────────┐
             │                               │
    ┌────────▼────────┐             ┌────────▼────────┐
    │   Thread A      │             │   Thread B      │
    │   (Running)     │             │   (Waiting)     │
    └────────┬────────┘             └────────┬────────┘
             │                               │
             │                               │
             ▼                               ▼
     ┌──────────────┐               ┌────────────────┐
     │ Lock Owner   │               │  Wait Queue    │
     └──────────────┘               └────────────────┘
---
### This cycle continues

Ping and Pong keep alternating:
- Each waits when it is not their turn
- Each signals the other after finishing

---

## Why Waiting is Important

If waiting is not used:
- Both threads may run at the same time
- Output becomes unpredictable

Waiting ensures:
- Proper order
- Controlled execution

---

## Why a Loop is Used for Waiting

Threads check the condition inside a loop, not just once.

Reason:
- Sometimes a thread may wake up without a signal (spurious wakeup)
- So it must re-check whether it is actually its turn

This ensures correctness.

---

## Advantages of ReentrantLock

1. More control compared to synchronized
2. Supports multiple conditions for complex coordination
3. Allows threads to try acquiring a lock without waiting
4. Supports fairness (threads can get lock in order)
5. Allows interruptible waiting

---

## ReentrantLock vs Synchronized

| Feature | synchronized | ReentrantLock |
|--------|-------------|---------------|
| Control | Automatic | Manual |
| Flexibility | Less | More |
| Multiple conditions | No | Yes |
| Try without waiting | No | Yes |
| Fairness option | No | Yes |

---

## Important Rules

- A thread must release the lock after acquiring it
- Waiting threads must be signaled to continue
- Always re-check condition after waking up
- Incorrect handling can lead to deadlocks

---

