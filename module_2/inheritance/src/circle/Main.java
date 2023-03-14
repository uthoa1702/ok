package circle;

import circle.Cylinder;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Cylinder cylinder = new Cylinder();
        System.out.println("example: ");
        System.out.println(cylinder);
        System.out.println("enter radius: ");
        double radius = Double.parseDouble(sc.nextLine());
        System.out.println("enter color: ");
        String color = sc.nextLine();
        System.out.println("enter height: ");
        double height = Double.parseDouble(sc.nextLine());
        System.out.println("result:");
        Cylinder cylinder1 = new Cylinder(radius, color, height);
        System.out.println(cylinder1);
    }
}