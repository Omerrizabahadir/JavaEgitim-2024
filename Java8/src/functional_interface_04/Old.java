package functional_interface_04;

public class Old implements MathOperation {
    @Override
    public int operate(int a, int b) {
        return a + b;
    }

}
/*
Java 8 Öncesinde böyle yapıyorduk
 */