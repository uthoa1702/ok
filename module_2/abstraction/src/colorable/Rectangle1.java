package colorable;

import resizeable.Resizeable;
import resizeable.Shape;

public class Rectangle1 extends Shape1 implements Resizeable {
    protected double width = 1.0;
    protected double length = 1.0;

    public Rectangle1() {
    }

    public Rectangle1(double width, double length) {
        this.width = width;
        this.length = length;
    }

    public Rectangle1(double width, double length, String color, boolean filled) {
        super(color, filled);
        this.width = width;
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getArea() {
        return this.width * this.length;
    }

    public double getPerimeter() {
        return 2 * (this.width + this.length);
    }

    @Override
    public String toString() {
        return "Area of Rectangle: " + getArea();
    }

    @Override
    public void resize(double percent) {
        setWidth(this.width + this.width*percent/100);
        setLength(this.length + this.length*percent/100);
    }
}
