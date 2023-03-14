package resizeable;



import java.util.Arrays;


public class Main {
    public static void main(String[] args) {
        System.out.println(Math.round(Math.random()*99 + 1));
        Rectangle rectangle = new Rectangle();
        Square square = new Square();
        Circle circle = new Circle();
        double[] defaultArr = new double[3];
        defaultArr[0] = rectangle.getArea();
        defaultArr[1] = square.getArea();
        defaultArr[2] = circle.getArea();
        System.out.println("Default area of rectangle, square, circle");
        System.out.println(Arrays.toString(defaultArr));
        double percentRectangle = Math.round(Math.random()*99 + 1);
        System.out.println(percentRectangle);
        rectangle.resize(percentRectangle);
        double percentSquare = Math.round(Math.random()*99 + 1);
        square.resize(percentSquare);
        double percentCircle = (int) (Math.random()*99 + 1);
        System.out.println(percentCircle);
        circle.resize(percentCircle);
        double[] arr = new double[3];
        arr[0] = rectangle.getArea();
        arr[1] = square.getArea();
        arr[2] = circle.getArea();
        System.out.println("area of rectangle, square, circle. After change");
        System.out.println(Arrays.toString(arr));
    }
}
