package LAB3;

// Parent Class
class Parent {
    int num = 100;
}

// Child Class
class Child extends Parent {
    int num = 200;

    void display() {

        // this refers to current class variable
        System.out.println("Using this: " + this.num);

        // super refers to parent class variable
        System.out.println("Using super: " + super.num);
    }
}

// Main Class
public class exp10 {

    public static void main(String[] args) {

        // Create object of Child class
        Child obj = new Child();

        // Call display method
        obj.display();
    }
}
