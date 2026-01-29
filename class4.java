class Car {
    int n;

    Car(int price) {
        this.n = price;
    }
}

class BMW extends Car {
    int m;

    void f1() {
        System.out.println("Inside f1 method of BMW class");
    }

    BMW(int price) {
        super(price);   // Call parent constructor
        this.m = 10000;
        this.f1();      // Call own method
    }
}

public class class4 {
    public static void main(String[] args) {
        BMW b = new BMW(50000);

        System.out.println("Price from Car class: " + b.n);
        System.out.println("Value of m from BMW class: " + b.m);
    }
}
