package generics_example_bounded_types_parameter_at_class_level_example;

public class GenericClass<T extends A> {
private T t;

    public GenericClass(T t) {
        this.t = t;
    }
    public void doRunTest(){
        this.t.displayClass();
    }

    public static void main(String[] args) {
        GenericClass<C>c=new GenericClass<>(new C());
        c.doRunTest();


        GenericClass<A> a =new GenericClass<>(new A());
        a.doRunTest();

        //GenericClass<B> b=new GenericClass<>();
       // b.doRunTest();

        //GenericClass<String> str=new GenericClass<String>();
    }
}


class A {
    public void displayClass() {
        System.out.println("Inside super class A ");
    }
}

class B  {
    public void displayClass() {
        System.out.println("Inside sub class B ");
    }
}

class C extends A {
    public void displayyClass(){
        System.out.println("Inside sub class C ");
    }
}
