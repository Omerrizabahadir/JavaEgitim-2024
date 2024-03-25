package aggregation_example_elçingüveyi;

public class Student {
    private String id, name;

    public Student(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Öğrenci no : "+getId();
    }
}
