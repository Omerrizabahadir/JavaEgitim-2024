package wrapper_class_examples;

public class Main {
    public static void main(String[] args) {
        Wrapper wrapper = new Wrapper();

        //Boolean true verilirse (tRUe ,True,trUe)gibi farklı yazılsada true döner
        //true dışında ne yazarsa yazsın false döner

        System.out.println("------Boolean------");
        System.out.println(wrapper.b1);
        System.out.println(wrapper.b2);
        System.out.println(wrapper.b3);
        System.out.println(wrapper.b4);
        System.out.println(wrapper.b5);

        System.out.println("------ Byte------");
        System.out.println(wrapper.byte1);
        System.out.println(wrapper.byte2);
        //System.out.println(wrapper.byte3);

        System.out.println("------ Integer------");
        System.out.println(wrapper.integer1);
        System.out.println(wrapper.integer2);
        System.out.println("wrapper_class_examples.Wrapper sınıfından tamsayı toplamı :"+wrapper.integer3);
        System.out.println("Primitive veri tipinden tamsayı toplamı :"+wrapper.int1);

        System.out.println("------ Float------");
        System.out.println(wrapper.float1);
        System.out.println(wrapper.float2);
        System.out.println(wrapper.float3);
        System.out.println(wrapper.float4);

        System.out.println("------ Character------");
        System.out.println(wrapper.character);
        System.out.println(wrapper.character1);
    }
}