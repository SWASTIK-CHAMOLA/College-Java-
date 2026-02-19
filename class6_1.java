// First 10 natural numbers using Runnable Interface

public class class6_1 {
    public static void main(String[] args) {
        Runnable task = new Runnable() {
            @Override
            public void run() {
                for (int i = 1; i <= 10; i++) {
                    System.out.println(i);
                }
            }
        };

        Thread thread = new Thread(task);
        thread.start();
    }
}