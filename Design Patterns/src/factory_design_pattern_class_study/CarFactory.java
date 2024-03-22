package factory_design_pattern_class_study;

import java.lang.reflect.InvocationTargetException;

public class CarFactory {
    public static Car createCarInstanceClass(Class aClass ) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {


        /*return kısmına aClass.newInstance() deyince altını kırmızı yapacak
        kırmızının üstüne gelince Cast expressions çıkıyor ona tıkla
        alttaki şekilde cast edecek
         */

        //return (Car) aClass.newInstance();


        return (Car) aClass.getDeclaredConstructor().newInstance();
    }
}
