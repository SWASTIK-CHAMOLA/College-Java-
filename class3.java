// WAP to check whether an array consists of duplicate elements

import java.util.Scanner;

public class class3 {
    int size;
    int[] arr;
    boolean hasDuplicate = false;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        class3 d = new class3();

        System.out.print("Enter the size of array: ");
        d.size = sc.nextInt();

        d.arr = new int[d.size];

        for (int i = 0; i < d.size; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            d.arr[i] = sc.nextInt();
        }

        for (int i = 0; i < d.size; i++) {
            for (int j = i + 1; j < d.size; j++) {
                if (d.arr[i] == d.arr[j]) {
                    d.hasDuplicate = true;
                    break;
                }
            }
            if (d.hasDuplicate) {
                break;
            }
        }

        if (d.hasDuplicate) {
            System.out.println("Array has duplicate elements.");
        } else {
            System.out.println("Array does not have duplicate elements.");
        }

        sc.close();
    }
}