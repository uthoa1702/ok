package access_modifier;

public class Circle {
    private double radius;
    String color;


    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public double getRadius() {
        return this.radius;
    }

    public String getColor(){
        return this.color;
    }

    public double getArea(){
        return (Math.pow(getRadius(),2))*3.14;
    }

}
