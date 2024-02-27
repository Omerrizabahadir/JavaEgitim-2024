package wrapper_class_examples_wrapper_methods_using;

import wrapper_class_examples.Wrapper;

public class Main {
    public static void main(String[] args) {

        WrapperFunctions wrapperFunctions=new WrapperFunctions();

        System.out.println("---------valueOf() metodu-------");


        System.out.println("---------Integer.valueOf()-------");
        System.out.println(wrapperFunctions.integer);
        //System.out.println(wrapperFunctions.integer1);


        System.out.println("---------Boolean.valueOf()-------");
        System.out.println(wrapperFunctions.boolean1);
        System.out.println(wrapperFunctions.boolean2);
        System.out.println(wrapperFunctions.boolean3);
        System.out.println(wrapperFunctions.boolean4);


        System.out.println("---------Float.valueOf()-------");
        System.out.println(wrapperFunctions.float1);


        //Bu kullanım Wrapper dan primitive 'e çevirir
        System.out.println("---------xxxValue() metodu-------");

        System.out.println(wrapperFunctions.integerA);
        System.out.println(wrapperFunctions.int1);
        System.out.println(wrapperFunctions.byte1);

        System.out.println("---------parsexxx() metodu---------");
        System.out.println(wrapperFunctions.int2);



    }
}
