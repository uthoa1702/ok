package student_management;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a;
        String b;
        System.out.println("enter name of student: ");
        a = sc.nextLine();
        System.out.println("enter class of student: ");
        b = sc.nextLine();
        Student student = new Student(a, b);

        System.out.println("Student{" +
                "name='" + student.getName() + '\'' +
                ", classes='" + student.getClasses() + '\'' +
                '}');
    }
}
