package collections;
import java.util.HashSet;

public class set {
    public static void main(String[] args) {

        HashSet<String> set = new HashSet<String>();

        // insertion
        set.add("apple");
        set.add("banana");
        set.add("mango");

        System.out.println("After insertion: " + set);

        // deletion
        set.remove("banana");
        System.out.println("After deletion: " + set);

        // searching
        if (set.contains("apple")) {
            System.out.println("apple found");
        } else {
            System.out.println("apple not found");
        }

        // updation (remove + add)
        set.remove("mango");
        set.add("grapes");
        System.out.println("After updation: " + set);

        // traversal
        System.out.println("Traversing set:");
        for (String item : set) {
            System.out.println(item);
        }
    }
}