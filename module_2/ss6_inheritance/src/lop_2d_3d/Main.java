package lop_2d_3d;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Point2D point2d = new Point2D();
        System.out.println(point2d);
        Point3D point3d = new Point3D();
        System.out.println(point3d);
        Scanner sc = new Scanner(System.in);
        System.out.println("enter X:");
        float x = Float.parseFloat(sc.nextLine());
        System.out.println("enter Y:");
        float y = Float.parseFloat(sc.nextLine());
        System.out.println("enter Z:");
        float z = Float.parseFloat(sc.nextLine());
        Point3D point3d1 = new Point3D(x, y, z);
        Point2D point2d1 = new Point2D(x,y);
        System.out.println(point3d1);
        System.out.println(point2d1);
    }
}
