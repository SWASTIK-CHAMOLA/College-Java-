class subject{
    int sum(int a, int b){
        return a+b;
    }
}

class BMW extends subject{
    @Override
    int sum(int a, int b){
        return a+b;
    }
}

public class polymorphism{
    public static void main(String[] args) {
        subject s = new subject();
        System.out.println(s.sum(10, 20));
    }
}
