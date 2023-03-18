package assignment.model;

import assignment.model.Person;

public class Instructor extends Person {
    String speciality;

    public Instructor() {
    }

    public Instructor(int id, String name, String birthDay, String gender, String speciality) {
        super(id, name, birthDay, gender);
        this.speciality = speciality;
    }

    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }

    @Override
    public String toString() {
        return "Instructor{" +
                "id='" + id + '\'' +
                ", gender=" + gender +
                ", name='" + name + '\'' +
                ", birthDay='" + birthDay + '\'' +
                ", speciality='" + speciality + '\'' +
                '}';
    }
}