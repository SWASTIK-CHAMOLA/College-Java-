
import java.util.Scanner;

public class class1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String[] str = new String[5];

        for (int i = 0; i < 5; i++) {
            str[i] = sc.nextLine();
        }

        // printing
        for (int i = 0; i < 5; i++) {
            System.out.println(str[i]);
        }

        sc.close();
    }
}
