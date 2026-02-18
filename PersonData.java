import java.util.Scanner;

class Person {
    private String name;
    private int age;
    private float salary;

    // Setters with validation
    public boolean setName(String name) {
        if (name == null || name.length() > 20) {
            System.out.println("Error: Name must not exceed 20 characters.");
            return false;
        }
        this.name = name;
        return true;
    }

    public boolean setAge(int age) {
        if (age <= 5) {
            System.out.println("Error: Age must be greater than 5.");
            return false;
        }
        this.age = age;
        return true;
    }

    public boolean setSalary(float salary) {
        if (salary <= 6) {
            System.out.println("Error: Salary must be greater than 6.");
            return false;
        }
        this.salary = salary;
        return true;
    }

    public void displayData() {
        System.out.println("\n===== Person Details =====");
        System.out.println("Name   : " + name);
        System.out.println("Age    : " + age);
        System.out.println("Salary : " + salary);
        System.out.println("==========================");
    }
}

public class PersonData {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Person person = new Person();
        boolean valid = true;

        System.out.print("Enter Name (max 20 characters): ");
        String name = sc.nextLine();
        if (!person.setName(name)) valid = false;

        System.out.print("Enter Age (must be > 5): ");
        int age = sc.nextInt();
        if (!person.setAge(age)) valid = false;

        System.out.print("Enter Salary (must be > 6): ");
        float salary = sc.nextFloat();
        if (!person.setSalary(salary)) valid = false;

        if (valid) {
            person.displayData();
            System.out.println("\nData Inserted Successfully.");
        } else {
            System.out.println("\nData insertion failed due to constraint violations.");
        }

        sc.close();
    }
}