package diamond_problem.diamond_problem_01;

public interface MyInterface1 {
    public default void defaultMethod() {
        System.out.println("MyInterface defaultMethod");
    }
    public abstract void test();
}
