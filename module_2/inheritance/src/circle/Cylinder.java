package circle;

public class Cylinder extends Circle {
    private double height = 2.0f;

    public Cylinder() {

    }

    public Cylinder(double height) {
        this.height = height;
    }

    public Cylinder(double radius, String color, double height) {
        super(radius, color);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getVolume() {
        return this.height*getArea();
    }

    @Override
    public String toString() {
        return "Cylinder{" +
                "height=" + height +
                ", radius=" + radius +
                ", color=" + color +
                ", Area= " + getArea() +
                ", Volume= " + getVolume() +'\'' +
                '}';
    }
}
