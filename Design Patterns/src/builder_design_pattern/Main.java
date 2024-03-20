package builder_design_pattern;

public class Main {
    public static void main(String[] args) {
        Employee employee = new Employee.EmployeeBuilder("kadir", "Java Developer")
                .setAge(29)
                .setLastName("Demircan")
                .setSalary(1)
                .build(); //build() zorunlu

        /*set li olanları (optional yani zorunlu olmayanları)
        buraya koymazsan hata vernez null değer verir
         */


        System.out.println(employee.toString());
        /*toString() verileri yazmıyorsa Employee sınıfına git
        generate toString yaz. o şunu  kendisi override edecek:
        return "Employee{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", position='" + position + '\'' +
                ", salary=" + salary +
                '}';
        */

    }
}
