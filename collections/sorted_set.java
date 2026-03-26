package collections;

import java.util.TreeSet;

public class sorted_set {
    public static void main(String[] args) {

        TreeSet<String> set = new TreeSet<String>();

        // insertion
        set.add("mango");
        set.add("apple");
        set.add("banana");

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

        // traversal (sorted automatically)
        System.out.println("Traversing set:");
        for (String item : set) {
            System.out.println(item);
        }
    }
}

