package point_and_movable_point;

public class Main {
    public static void main(String[] args) {
        Point point = new Point();
        System.out.println(point);
        point = new Point(2, 2);
        System.out.println(point);
        MoveablePoint moveablePoint = new MoveablePoint();
        System.out.println(moveablePoint);
        moveablePoint = new MoveablePoint(2, 3, 2, 2);
        System.out.println(moveablePoint);
        System.out.println(moveablePoint.move());
    }
}
