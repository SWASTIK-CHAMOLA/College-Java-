import java.util.Scanner;

class Car {
    int model_year;
    int price;
    String car_name;

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        // OBJECT 1
        Car car1 = new Car();
        System.out.println("Enter details for Car 1:");
        System.out.print("Name: ");
        car1.car_name = s.next(); // Use s.next() for single words or s.nextLine() for full names
        System.out.print("Model Year: ");
        car1.model_year = s.nextInt();
        System.out.print("Price: ");
        car1.price = s.nextInt();

        // OBJECT 2
        Car car2 = new Car();
        System.out.println("\nEnter details for Car 2:");
        System.out.print("Name: ");
        car2.car_name = s.next();
        System.out.print("Model Year: ");
        car2.model_year = s.nextInt();
        System.out.print("Price: ");
        car2.price = s.nextInt();

        //  DISPLAYING DATA 
        System.out.println("\n Car 1 Details ");
        System.out.println("Name: " + car1.car_name);
        System.out.println("Year: " + car1.model_year);
        System.out.println("Price: " + car1.price);
        
        System.out.println();
        System.out.println("-----------------------------------------");

        System.out.println("\n Car 2 Details ");
        System.out.println("Name: " + car2.car_name);
        System.out.println("Year: " + car2.model_year);
        System.out.println("Price: " + car2.price);

        s.close();
      
    }    
}
