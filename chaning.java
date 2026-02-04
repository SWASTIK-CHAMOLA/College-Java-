// WAP to show chaning of super() is not allowed in JAVA

class A {
    A() {
        System.out.println("In A's Constructor");
    }
}

class B extends A {
    B() {
        super();
        System.out.println("In B's Constructor");
    }

    B(int x) {
        this();
        System.out.println("Class B Parameterized Constructor");
    }
}

public class chaning {
    public static void main(String[] args) {
        B obj = new B(10);
        System.out.println(obj);
    }
}
