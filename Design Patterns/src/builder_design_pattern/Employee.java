package builder_design_pattern;

public class Employee {
    @Override
    public String toString() {
        return "Employee{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", position='" + position + '\'' +
                ", salary=" + salary +
                '}';
    }

    private String firstName;
    private String lastName;
    private int age;
    private String position;
    private double salary;

    public Employee(EmployeeBuilder employeeBuilder) {
        this.firstName=employeeBuilder.firstName;
        this.lastName=employeeBuilder.lastName;
        this.age= employeeBuilder.age;
        this.position=employeeBuilder.position;
        this.salary=employeeBuilder.salary;
    }



    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public String getPosition() {
        return position;
    }

    public double getSalary() {
        return salary;
    }

    public static class EmployeeBuilder {
        private String firstName;
        private String lastName;
        private int age;
        private String position;
        private double salary;

        /*
        required field(Constructor metodunda zorunlu osun dediklerim.
        kesin girmek zorundayım
         */
        public EmployeeBuilder(String firstName, String position) {
            this.firstName = firstName;
            this.position = position;
        }
        /*
        optional field(zorunlu olmayanlar ise set ile yazılacak
         */

        public EmployeeBuilder setLastName(String lastName) {
            this.lastName = lastName;
            return this;

        }

        public EmployeeBuilder setAge(int age) {
            this.age = age;
            return this;
        }

        public EmployeeBuilder setSalary(double salary) {
            this.salary = salary;
            return this;
        }
        public Employee build(){
            return new Employee(this);
        }
    }
}