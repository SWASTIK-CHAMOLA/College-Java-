package LAB3;

// Class with Constructor
class Student {

    String name;
    int age;

    // Constructor
    Student(String n, int a) {
        name = n;
        age = a;
    }

    // Method to display data
    void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

// Main Class
public class exp9 {

    public static void main(String[] args) {

        // Calling constructor by creating object
        Student s1 = new Student("Swastik", 20);

        // Calling method
        s1.display();
    }
}
