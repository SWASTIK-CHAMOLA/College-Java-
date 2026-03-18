// <T> sum <T> a, <T> b
class Sample {
    @SuppressWarnings("unchecked")
    <T> T sum(T a, T b) {
        if (a instanceof Integer && b instanceof Integer) {
            return (T) Integer.valueOf(((Integer) a) + ((Integer) b));
        } else if (a instanceof Float && b instanceof Float) {
            return (T) Float.valueOf(((Float) a) + ((Float) b));
        } else if (a instanceof String && b instanceof String) {
            return (T) (((String) a) + ((String) b));
        }
        throw new IllegalArgumentException("Unsupported types");
    }
}

public class Generalization {
    public static void main(String[] args) {
        Sample sample = new Sample();

        System.out.println(sample.sum(5, 10)); // Integer sum
        System.out.println(sample.sum(3.5f, 2.5f)); // Float sum
        System.out.println(sample.sum("Hello, ", "World!")); // String concatenation
    }
}
