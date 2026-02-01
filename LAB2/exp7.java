package LAB2;

import java.util.Scanner;

public class exp7 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Input size of array
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        // Input elements
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Input element to search
        System.out.print("Enter element to find frequency: ");
        int key = sc.nextInt();

        int count = 0;

        // Count frequency
        for (int i = 0; i < n; i++) {
            if (arr[i] == key) {
                count++;
            }
        }

        // Print result
        System.out.println("Frequency of " + key + " = " + count);

        sc.close();
    }
}
