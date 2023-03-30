package demo;

public class asd extends Student{
    int a;
    public asd(int id, String name, String classes) {
        super(id, name, classes);
    }

    public asd(int id, String name, String classes, int a) {
        super(id, name, classes);
        this.a = a;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    @Override
    public String toString() {
        return "asd{" +
                "a=" + a +
                ", id=" + id +
                ", name='" + name + '\'' +
                ", classes='" + classes + '\'' +
                '}';
    }
    public String getAll(){
        return id+","+name+","+classes+","+a;
    }


}
