package collections;

import java.util.HashMap;

public class map {
    public static void main(String[] args) {

        HashMap<Integer, String> map = new HashMap<Integer, String>();

        // insertion
        map.put(1, "apple");
        map.put(2, "banana");
        map.put(3, "mango");

        System.out.println("After insertion: " + map);

        // deletion
        map.remove(2);
        System.out.println("After deletion: " + map);

        // searching (by key)
        if (map.containsKey(1)) {
            System.out.println("Key 1 found");
        } else {
            System.out.println("Key 1 not found");
        }

        // searching (by value)
        if (map.containsValue("mango")) {
            System.out.println("Value mango found");
        }

        // updation
        map.put(3, "grapes");   // replaces mango
        System.out.println("After updation: " + map);

        // traversal
        System.out.println("Traversing map:");
        for (Integer key : map.keySet()) {
            System.out.println(key + " -> " + map.get(key));
        }
    }
}