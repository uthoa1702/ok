package demo;

public class Student {
    int id;
    String name;
    String classes;

    public Student(int id, String name, String classes) {
        this.id = id;
        this.name = name;
        this.classes = classes;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getClasses() {
        return classes;
    }

    public void setClasses(String classes) {
        this.classes = classes;
    }

    @Override
    public String toString() {
        return id + "," + name + "," + classes;
    }

    public String getInfoToCsv() {
        return id + "," + name + "," + classes;
    }
}
