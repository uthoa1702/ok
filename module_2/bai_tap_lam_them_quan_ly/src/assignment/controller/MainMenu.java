package assignment.controller;

import assignment.service.InstructorFunctions;
import assignment.service.StudentFunctions;

import java.util.Scanner;

public class MainMenu {
    static Scanner sc = new Scanner(System.in);
    static StudentFunctions studentFunctions = new StudentFunctions();
    static InstructorFunctions instructorFunctions = new InstructorFunctions();
    static boolean flagMenu = true;
    static boolean flag = true;

    public static void displayMenu() {

        do {
            System.out.println("Instructors and Students Management Program\n" +
                    "Choose to continues:\n" +
                    "1. Add\n" +
                    "2. Delete\n" +
                    "3. Display\n" +
                    "4. Exit\n" +
                    "Type below to choose:");
            int chosse = Integer.parseInt(sc.nextLine());
            switch (chosse) {
                case 1:
                    MainMenu.addStudentorInstructor();
                    break;
                case 2:
                   MainMenu.removeStudentOrInstructor();
                    break;
                case 3:
                   MainMenu.displayStudentListOrInStructorList();
                    break;
                case 4:
                    break;
                default:
                    System.out.println("Please type again");
                    break;
            }
        } while (!flagMenu);
    }

    public static void addStudentorInstructor() {
        boolean flag = true;

        do {
            System.out.println("1. Add Student\n" +
                    "2. Add Instructor\n" +
                    "3. Main Menu\n" +
                    "Type below to choose:");
            int option1 = Integer.parseInt(sc.nextLine());
            switch (option1) {
                case 1:
                    studentFunctions.add();
                    break;
                case 2:
                    instructorFunctions.add();
                    break;
                case 3:
                    MainMenu.displayMenu();
                    break;
                default:
                    flag = false;
                    System.out.println("Please type again");
                    break;
            }
        } while (!flag);
    }

    public static void removeStudentOrInstructor() {
        do {
            System.out.println("1. Remove Student\n" +
                    "2. Remove Instructor\n" +
                    "3. Main Menu\n" +
                    "Type below to choose:");
            int option2 = Integer.parseInt(sc.nextLine());
            switch (option2) {
                case 1:
                    studentFunctions.remove();
                    break;
                case 2:
                    instructorFunctions.remove();
                    break;
                case 3:
                    MainMenu.displayMenu();
                    break;
                default:
                    flag = false;
                    System.out.println("Please type again");
                    break;
            }
        } while (!flag);
    }
    public static void displayStudentListOrInStructorList() {
        System.out.println("1. Display student list\n" +
                "2. Display instructor list\n" +
                "3. Main Menu" +
                "Type below to choose");
        int option3 = Integer.parseInt(sc.nextLine());
        do {
            switch (option3) {
                case 1:
                    studentFunctions.display();
                    break;
                case 2:
                    instructorFunctions.display();
                    break;
                case 3:
                    MainMenu.displayMenu();
                    break;
                default:
                    System.out.println("Please type again");
                    flag = false;
                    break;
            }
        } while (!flag);
    }
}

