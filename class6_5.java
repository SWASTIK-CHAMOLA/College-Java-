// Explain the need of join and set priority and synchronized keyword in java
class Counter {
    private int count = 0;

    public synchronized void increment() {
        count++;
    }

    public int getCount() {
        return count;
    }
}

public class class6_5 {
    public static void main(String[] args) {
        Counter counter = new Counter();

        Thread thread1 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                counter.increment();
            }
        });

        Thread thread2 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                counter.increment();
            }
        });

        thread1.start();
        thread2.start();

        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Explanation of join and setPriority:
        // The join() method is used to wait for a thread to complete its execution before the
        // main thread continues. This is useful when you want to ensure that certain tasks are
        // completed before moving on to the next steps in the program.
        // The setPriority() method is used to set the priority of a thread. Threads with higher
        // priority are more likely to be executed before threads with lower priority. However,
        // thread scheduling is not guaranteed to be strictly based on priority, as it depends on
        // the underlying operating system's thread scheduler.
        // The synchronized keyword is used to control access to a particular resource or block of
        // code by multiple threads. It ensures that only one thread can access the synchronized
        // block at a time, preventing race conditions and ensuring thread safety when multiple 
        // threads are accessing shared resources.

    }
}