import java.util.Scanner;

public class CheckTriangle {
    public static void main(String[] args) {
        boolean flag = true;
        do {
            try {
                Scanner sc = new Scanner(System.in);
                System.out.println("Enter the first edge: ");
                int a = Integer.parseInt(sc.nextLine());
                System.out.println("Enter the second edge: ");
                int b = Integer.parseInt(sc.nextLine());
                System.out.println("Enter the third edge: ");
                int c = Integer.parseInt(sc.nextLine());
                isTriangle(a, b, c);
                flag = false;
            } catch (NumberFormatException | IllegalTriangleException e) {
                System.out.println(e.getMessage());
            }
        }while (flag);
    }

    public static void isTriangle(int a, int b, int c) throws IllegalTriangleException {
        if (a + b <= c) {
            throw new IllegalTriangleException("It is not a triangle");
        } else if (b + c <= a) {
            throw new IllegalTriangleException("It is not a triangle");
        } else if (a + c <= b) {
            throw new IllegalTriangleException("It is not a triangle");
        } else if (a < 0 || b < 0 || c < 0) {
            throw new IllegalTriangleException("It is not a triangle");
        } else {
            throw new IllegalTriangleException("It is a triangle");
        }
    }
}