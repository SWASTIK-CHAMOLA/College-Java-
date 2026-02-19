// Program Showing Priority and Synchronization in Java

public class class6_2 {
    public static void main(String[] args) {
        Thread thread1 = new Thread(() -> {
            for (int i = 1; i <= 5; i++) {
                System.out.println("Thread 1: " + i);
            }
        });

        Thread thread2 = new Thread(() -> {
            for (int i = 1; i <= 5; i++) {
                System.out.println("Thread 2: " + i);
            }
        });

        // Setting priorities
        thread1.setPriority(Thread.MAX_PRIORITY); // Highest priority
        thread2.setPriority(Thread.MIN_PRIORITY); // Lowest priority

        // Starting threads
        thread1.start();
        thread2.start();

        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}