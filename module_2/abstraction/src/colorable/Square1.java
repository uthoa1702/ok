package colorable;

import resizeable.Rectangle;

public class Square1 extends Rectangle1 implements Colorable {
    public Square1() {
    }

    public Square1(double side) {
        super(side, side);
    }

    public Square1(double side, String color, boolean filled) {
        super(side, side, color, filled);
    }

    public double getSide() {
        return getWidth();
    }

    public void setSide(double side) {
        super.setWidth(side);
        super.setLength(side);
    }

    @Override
    public void setWidth(double width) {
        setSide(width);
    }

    @Override
    public void setLength(double length) {
        setSide(length);
    }

    @Override
    public String toString() {
        return "Area of Square: " + getArea();
    }


    @Override
    public double getArea() {
        return super.getArea();
    }

    @Override
    public double getPerimeter() {
        return super.getPerimeter();
    }

    @Override
    public void howToColor() {
        System.out.println("color all four sides.");
    }
}