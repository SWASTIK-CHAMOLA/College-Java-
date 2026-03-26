package collections;

import java.util.TreeMap;

public class sorted_map {
    public static void main(String[] args) {

        TreeMap<Integer, String> map = new TreeMap<Integer, String>();

        // insertion
        map.put(3, "mango");
        map.put(1, "apple");
        map.put(2, "banana");

        System.out.println("After insertion: " + map);

        // deletion
        map.remove(2);
        System.out.println("After deletion: " + map);

        // searching
        if (map.containsKey(1)) {
            System.out.println("Key 1 found");
        } else {
            System.out.println("Key 1 not found");
        }

        // updation
        map.put(3, "grapes");   // replaces mango
        System.out.println("After updation: " + map);

        // traversal (automatically sorted by key)
        System.out.println("Traversing map:");
        for (Integer key : map.keySet()) {
            System.out.println(key + " -> " + map.get(key));
        }
    }
}
