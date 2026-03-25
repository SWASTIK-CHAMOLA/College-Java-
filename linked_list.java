import java.util.LinkedList;

public class linked_list {
    public static void main(String[] args) {
        LinkedList<String> head = new LinkedList<>();

        head.add("First");
        head.add("Second");
        head.add("Third");
        System.out.println("Linked List: " + head);
        head.remove("Second");
        System.out.println("After removing 'Second': " + head);
    }
}
