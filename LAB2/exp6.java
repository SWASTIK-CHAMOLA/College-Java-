package LAB2;

public class exp6 {

    public static void main(String[] args) {

        // Check if arguments are provided
        if (args.length == 0) {
            System.out.println("Please provide numbers as command-line arguments.");
            return;
        }

        int sum = 0;

        // Convert String arguments to int and add
        for (int i = 0; i < args.length; i++) {
            int num = Integer.parseInt(args[i]); // String → int
            sum = sum + num;
        }

        // Print result
        System.out.println("Sum of array elements = " + sum);
    }
}
