package LAB1;

public class exp3 {
    public static void main(String[] args) {

        // Check if any arguments are passed
        if (args.length == 0) {
            System.out.println("No command-line arguments provided.");
            return;
        }

        // Store command-line arguments in String array
        String[] arr = new String[args.length];

        for (int i = 0; i < args.length; i++) {
            arr[i] = args[i];
        }

        // Print the array
        System.out.println("Array elements are:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}

