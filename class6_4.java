class ThreadOne extends Thread {
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Thread One: " + i);
        }
    }
}

public class class6_4 {
    public static void main(String[] args) {
        ThreadOne threadOne = new ThreadOne();
        threadOne.start();
    }
}