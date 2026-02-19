class A {

}

class ThreadOne extends A implements Runnable {
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Thread One: " + i);
        }
    }
}

public class class6_3 {
    public static void main(String[] args) {
        ThreadOne threadOne = new ThreadOne();
        Thread thread = new Thread(threadOne);
        thread.start();
    }
}