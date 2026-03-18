class Sample {
    int sum(int a, int b) { return a + b; }
    float sum(float a, float b) { return a + b; }
    String sum(String a, String b) { return a + b; }
}

public class Array_of_Objects {
    public static void main(String[] args) {
        Sample[] samples = new Sample[3];
        for (int i = 0; i < samples.length; i++) {
            samples[i] = new Sample();
        }

        System.out.println(samples[0].sum(5, 10));
        System.out.println(samples[1].sum(3.5f, 2.5f)); 
        System.out.println(samples[2].sum("Hello, ", "World!")); 
    }
}
