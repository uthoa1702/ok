package assignment.service;

import assignment.model.Instructor;
import assignment.model.Student;

import java.util.ArrayList;
import java.util.Scanner;

public interface Service {
    ArrayList<Student> arrayListStudent = new ArrayList<>();
    ArrayList<Instructor> arrayListInstructor = new ArrayList<>();
    Scanner sc = new Scanner(System.in);
    Student student = new Student();
    Instructor instructor = new Instructor();
    void add();
    void remove();
    void display();
}
