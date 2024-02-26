package class_studies_enumaration_enumaration_example_employee_02;

public enum Employee {
    FULL_TİME(1), PART_TİME(2), PROJECT_BASE(3);

    private int key;

    Employee(int key) {
        this.key = key;
    }

    public int getKey() {
        return key;
    }

    public int comparison(int value) {
        for (Employee emp : Employee.values()) {
            if (value == emp.getKey()) {
                System.out.println("Gelen değeri : " + value + " olan kişi : " + emp.name());
            }
        }
        return value;
    }
}
