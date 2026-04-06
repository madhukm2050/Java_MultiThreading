## Instruction Reordering

### Defination :- 
The compiler, CPU, or JVM may change the order of execution of instructions to improve performance, as long as the single-threaded result remains correct.

if we write :-


      a = 1
      b = 1

It may execute as :- 
      
       b = 1
       a = 1

#### Why does reordering happen?

* **For optimization:**

* CPU pipeline efficiency
* Better use of registers/cache
* Faster execution

```java
int x = 0;
boolean flag = false;

// Thread 1
x = 10;
flag = true;

// Thread 2
if (flag) {
    System.out.println(x);
}
```
Expected output :- 10

Suppose it the instructions execute as

```java 
    flag = true
    x = 10
```

The value of x be 0


#### How to prevent reording 

* volatile keyword
```java
 //set the flag variable to volatile
 volatile boolean flag = true;
 ```

* synchronized keyword
```java
    synchronized(this){
     boolean flag = true;    
    }
```

- It Means that the variables delcared before volatile and synchronized keyword will reorder them self 
```java
   int a1 = 10;
   int b1 = 20;
   volatile boolean flag = false;
   int c1 = 30;
   int d1 = 40;
```
The a1 and b1 will reorder themSelf before volatile keyword and c1 and d1 reorder themself after volatile 




