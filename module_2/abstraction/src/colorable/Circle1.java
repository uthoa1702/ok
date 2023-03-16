package colorable;

import resizeable.Resizeable;

public class Circle1 extends Shape1 implements Resizeable {
    private double radius = 1;

    public Circle1() {
    }

    public Circle1(double radius) {
        this.radius = radius;
    }

    public Circle1(double radius, String color, boolean filled) {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return radius * radius * Math.PI;
    }

    public double getPerimeter() {
        return 2 * radius * Math.PI;
    }

    @Override
    public String toString() {
        return "Area of Circle: " + getArea();
    }

    @Override
    public void resize(double percent) {
        setRadius( this.radius + this.radius*percent/100);
    }
}