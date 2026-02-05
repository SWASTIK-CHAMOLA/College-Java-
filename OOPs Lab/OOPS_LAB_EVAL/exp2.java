package LAB1;

import java.util.Scanner;

public class exp2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Ask for size of array
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();

        // Declare array
        int[] arr = new int[n];

        // Take input
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Print array
        System.out.println("Array elements are:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

        sc.close();
    }
}
