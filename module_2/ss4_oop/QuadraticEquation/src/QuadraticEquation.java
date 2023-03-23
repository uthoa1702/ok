import java.util.Scanner;

public class QuadraticEquation {
    private double a, b, c;

    public QuadraticEquation() {

    }

    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }

    public double getDiscriminant() {
        return Math.pow(this.b, 2) - 4 * this.a * this.c;
    }

    public double getRoot1() {
        return ((-this.b) + Math.sqrt(this.getDiscriminant())) / (2 * this.a);
    }

    public double getRoot2() {
        return ((-this.b) - Math.sqrt(this.getDiscriminant())) / (2 * this.a);
    }

    public double getRoot() {
        return (-this.b) / (2 * a);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập giá trị cho phương trình bậc 2: ax2 + bx + c = 0 .");
        System.out.print("Nhập a: ");
        double a = Double.parseDouble(sc.nextLine());
        System.out.print("Nhập b: ");
        double b = Double.parseDouble(sc.nextLine());
        System.out.print("Nhập c: ");
        double c = Double.parseDouble(sc.nextLine());
        QuadraticEquation phuongTrinh = new QuadraticEquation(a, b, c);
        if (phuongTrinh.getDiscriminant() > 0) {
            System.out.print("Phương trình có 2 nghiệm là: x1 = " + phuongTrinh.getRoot1() + ", x2 = " + phuongTrinh.getRoot2());
        } else if (phuongTrinh.getDiscriminant() == 0) {
            System.out.print("Phương trình có nghiệm kép x1 = x2 = " + phuongTrinh.getRoot());
        } else {
            System.out.print("Phương trình vô nghiệm.");
        }
    }

}
