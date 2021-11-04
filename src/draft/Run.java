package draft;

public class Run {
    public static void main(String[] args) {
        Draft.MyClass o = new Draft.MyClass();
        int[] x = {1, 1};
        o.method(x);
        System.out.printf("x=%d, y=%d", x[0], x[1]);
    }
}
