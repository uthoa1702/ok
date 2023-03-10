package access_modifier;



import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter radius: ");
        double a = Double.parseDouble(sc.nextLine());
        System.out.println("enter color: ");
        String b = sc.nextLine();
        Circle circle = new Circle(a,b);
        System.out.println("radius = " + circle.getRadius() + "\n" +
                "Area = " + circle.getArea() + "\n" +
                "color = " + circle.getColor());
    }
}