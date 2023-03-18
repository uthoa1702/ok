package assignment.model;

import assignment.model.Person;
import assignment.service.Service;

import java.util.ArrayList;
import java.util.Scanner;

public class Student extends Person {
    String classes;
    int point;

    public Student() {
    }

    public Student(int id, String name, String birthDay, String gender, String classes, int point) {
        super(id, name, birthDay, gender);
        this.classes = classes;
        this.point = point;
    }

    public String getClasses() {
        return classes;
    }

    public void setClasses(String classes) {
        this.classes = classes;
    }

    public int getPoint() {
        return point;
    }

    public void setPoint(int point) {
        this.point = point;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id='" + id + '\'' +
                ", name=" + name +
                ", gender=" + gender +
                ", class='" + classes + '\'' +
                ", birthDay='" + birthDay + '\'' +
                ", point='" + point + '\'' +
                '}';
    }
}