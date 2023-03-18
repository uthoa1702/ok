package assignment.service;

import assignment.controller.MainMenu;
import assignment.model.Student;

public class StudentFunctions implements Service {





    @Override
    public void add() {
        System.out.println("enter ID: ");
        student.setId(Integer.parseInt(sc.nextLine()));
        System.out.println("enter Name of Student: ");
        student.setName(sc.nextLine());
        System.out.println("enter birthday of student:");
        student.setBirthDay(sc.nextLine());
        System.out.println("enter gender:");
        student.setGender(sc.nextLine());
        System.out.println("enter class:");
        student.setClasses(sc.nextLine());
        System.out.println("enter point of student:");
        student.setPoint(Integer.parseInt(sc.nextLine()));
        arrayListStudent.add(new Student(student.getId(), student.getName(), student.getBirthDay(), student.getGender(), student.getGender(), student.getPoint()));
        System.out.println("added successfully");
        MainMenu.displayMenu();
    }

    @Override
    public void remove() {
        boolean flag = true;
        System.out.println("Enter ID of Student to remove: ");
        int id = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < arrayListStudent.size(); i++) {
            if (arrayListStudent.get(i).getId() == id){
                do {
                    System.out.println("Are you sure to delete");
                    String ensure = sc.nextLine();
                    switch (ensure) {
                        case "yes":
                            arrayListStudent.remove(i);
                            MainMenu.displayMenu();
                            break;
                        case "no":
                            MainMenu.displayMenu();
                            break;
                        default:
                            flag = false;
                            System.out.println("Incorrect, please type again.");
                    }
                }while (!flag);
            }
            else {
                System.out.println("ID is not found");
                MainMenu.displayMenu();
            }
        }

    }

    @Override
    public void display() {
        for (Student s : arrayListStudent) {
            System.out.println(s);
        }
        MainMenu.displayMenu();
    }
}
