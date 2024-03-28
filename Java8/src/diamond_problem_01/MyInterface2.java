package diamond_problem_01;

public interface MyInterface2 {
    public default void defaultMethod(){
        System.out.println("MyInterface defaultMethod");

    }
    public abstract void test();
}
