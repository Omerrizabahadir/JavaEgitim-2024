package generic_example01;

//Generic Class oluşturulması
public class GenericClass<T> {

    private T data;



    public GenericClass(T data) {
        this.data = data;
    }
    public T getData() {
        return data;
    }

}
