// Multithreding in JAVA

class Thread_One extends Thread {
    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }
    }
}

class Thread_Two extends Thread {
    public void run() {
        for (int i = 11; i <= 20; i++) {
            System.out.println(i);
        }
    }
}

public class Multithreading {
    public static void main(String[] args) {
        Thread_One thread1 = new Thread_One();
        Thread_Two thread2 = new Thread_Two();
        
        thread1.start();
        thread2.start();

        try {
            // User thread1.join() to wait for thread1 to finish before proceeding
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}