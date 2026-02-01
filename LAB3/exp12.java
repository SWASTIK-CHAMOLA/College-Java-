package LAB3;

import java.util.Scanner;

public class exp12 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Input first string
        System.out.print("Enter first string: ");
        String str1 = sc.nextLine();

        // Input second string
        System.out.print("Enter second string: ");
        String str2 = sc.nextLine();

        // Compare strings
        if (str1.equals(str2)) {
            System.out.println("Both strings are SAME.");
        } else {
            System.out.println("Both strings are NOT same.");
        }

        sc.close();
    }
}
