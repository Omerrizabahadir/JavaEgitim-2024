package factory_design_pattern_class_study;

import java.lang.reflect.InvocationTargetException;

public class Main {
    public static void main(String[] args) {
        try {

            /*Bmw ve Porsche üretince altını çizer
            sen more actions dan try catch'e al de
            sonrada cast et
             */
            Bmw bmw = (Bmw) CarFactory.createCarInstanceClass(Bmw.class);
            bmw.name();
            bmw.price(1111);


            Porsche porsche = (Porsche) CarFactory.createCarInstanceClass(Porsche.class);
            porsche.name();
            porsche.price(22222);

        } catch (NoSuchMethodException e) {
            throw new RuntimeException(e);
        } catch (InvocationTargetException e) {
            throw new RuntimeException(e);
        } catch (InstantiationException e) {
            throw new RuntimeException(e);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        }
    }
}
