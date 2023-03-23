package colorable;

import java.util.Arrays;

public class Main2 {
    public static void main(String[] args) {
        Shape1[] shape = new Shape1[3];
        shape[0] = new Circle1();
        shape[1] = new Square1();
        shape[2] = new Rectangle1();
        System.out.println(Arrays.toString(shape));
        for (Shape1 shape1 : shape) {
            if (shape1 instanceof Colorable) {
                ((Colorable) shape1).howToColor();
            }
        }
    }
}
