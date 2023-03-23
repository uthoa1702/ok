package assignment.service;

import assignment.controller.MainMenu;
import assignment.model.Instructor;
import assignment.model.Student;

public class InstructorFunctions implements Service {

    @Override
    public void add() {
        System.out.println("enter ID: ");
        instructor.setId(Integer.parseInt(sc.nextLine()));
        System.out.println("enter Name of Student: ");
        instructor.setName(sc.nextLine());
        System.out.println("enter birthday of student:");
        instructor.setBirthDay(sc.nextLine());
        System.out.println("enter gender:");
        instructor.setGender(sc.nextLine());
        System.out.println("enter speciality:");
        instructor.setSpeciality(sc.nextLine());
        arrayListInstructor.add(new Instructor(instructor.getId(), instructor.getName(), instructor.getBirthDay(), instructor.getGender(), instructor.getSpeciality()));
        System.out.println("added successfully");
        MainMenu.displayMenu();
    }

    @Override
    public void remove() {
        System.out.println("Enter ID of Instructor to remove: ");
        int id = Integer.parseInt(sc.nextLine());
        boolean flag = true;
        for (int i = 0; i < arrayListInstructor.size(); i++) {
            if (arrayListInstructor.get(i).getId() == id) {
                do {
                    System.out.println("Are you sure to delete");
                    String ensure = sc.nextLine();
                    switch (ensure) {
                        case "yes":
                            arrayListInstructor.remove(i);
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
        for (Instructor instructorList : arrayListInstructor) {
            System.out.println(instructorList);
            MainMenu.displayMenu();
        }
    }
}
