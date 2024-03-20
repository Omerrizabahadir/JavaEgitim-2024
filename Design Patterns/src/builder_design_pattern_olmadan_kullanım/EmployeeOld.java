package builder_design_pattern_olmadan_kullanım;

public class EmployeeOld {

    /*Eğer builder Design Pattern olmasydı. Böyle olurdu
    Constructor metodunu overloaded olarak tekrar tekrar yazacaktık
    Bu da verilen değişken sayısı arttığında çok fazla constructor metot overloaded olaması
    nedeniyle uğraştırıcı ve kod görümüm sorununa neden olurdu
     */
    private String firstName;
    private String lastName;
    private int age;
    private String position;
    private double salary;

    public EmployeeOld(String firstName, String lastName, int age, String position, double salary) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.position = position;
        this.salary = salary;
    }

    public EmployeeOld(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public EmployeeOld(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public EmployeeOld(String firstName, int age) {
        this.firstName = firstName;
        this.age = age;
    }

    // 5! (5 faktoriyel) olasılığı var. bu da 120 tane constructor demek oluyor.
}
