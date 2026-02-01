package LAB3;

public class exp11 {

    // Static variable
    static int a = 100;

    // Non-static variable
    int b = 200;

    public static void main(String[] args) {

        // Accessing static variable (No object needed)
        System.out.println("Using static: " + a);

        // Accessing non-static variable (Object needed)
        exp11 obj = new exp11();

        System.out.println("Without static: " + obj.b);
    }
}

