package LAB2;

import java.util.Scanner;

public class exp8 {

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

        boolean found = false;

        // Check for duplicates
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {

                if (arr[i] == arr[j]) {
                    found = true;
                    break;
                }
            }

            if (found) {
                break;
            }
        }

        // Print result
        if (found) {
            System.out.println("Array contains duplicate elements.");
        } else {
            System.out.println("Array does NOT contain duplicate elements.");
        }

        sc.close();
    }
}
