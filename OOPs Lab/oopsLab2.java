import java.util.Scanner;

public class oopsLab2 {
    int[] arr;
    int freq = 0;

    public static void main(String[] args) {
        oopsLab2 f = new oopsLab2();
        Scanner s = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int size = s.nextInt();

        f.arr = new int[size];

        for (int i = 0; i < size; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            f.arr[i] = s.nextInt();
        }

        for (int i = 0; i < size; i++) {
            f.freq = 1;
            for (int j = i + 1; j < size; j++) {
                if (f.arr[i] == f.arr[j]) {
                    f.freq++;
                    f.arr[j] = Integer.MIN_VALUE;
                }
            }
            
            if (f.arr[i] != Integer.MIN_VALUE) {
                System.out.println("(" + f.arr[i] + ", " + f.freq + ")");
            }
        }

        s.close();
    }
}