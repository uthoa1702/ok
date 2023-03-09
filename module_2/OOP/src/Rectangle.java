
public class Rectangle {
    static double width;
    static double height;



    public Rectangle(double width, double height) {
        Rectangle.width = width;
        Rectangle.height = height;
    }

    public double getPerimeter() {
        return (height + width)*2;
    }

    public double getArea() {
        return height* width;
    }

    public static String display() {
        return "Rectangle{" + "width=" + width + ", height=" + height + "}";
    }
}

