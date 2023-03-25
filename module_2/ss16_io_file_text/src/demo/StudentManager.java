package demo;

import demo.Student;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class StudentManager {
    static Scanner scanner = new Scanner(System.in);
    static ArrayList<Student> studentList = new ArrayList();
    private static final String STUDENT_LIST_PATH = "D:\\code_Gym\\ok\\module_2\\ss16_io_file_text\\src\\demo\\student_list.csv";

    public static void main(String[] args) {
        do {
            System.out.print("Quan ly sinh vien \n" +
                    "1. Xem danh sach sinh vien \n" +
                    "2. Them moi sinh vien \n" +
                    "=>> ");
            String choose = scanner.nextLine();
            switch (choose) {
                case "1":
                    // danh sach
                    displayStudentList();
                    break;
                case "2":
                    // them moi
                    addNewStudent();
                    break;
                default:
                    System.out.println("Chon lai");
            }
        } while (true);
    }

    public static void displayStudentList() {
        File file = new File(STUDENT_LIST_PATH);
        try {
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line = null;
            Student student = null;
            while ((line = bufferedReader.readLine()) != null) {
                String[] strings = line.split(",");
                student = new Student(Integer.parseInt(strings[0]),
                        strings[1], strings[2]);
                studentList.add(student);
            }
        } catch (IOException ioException) {
            ioException.printStackTrace();
        }
        for (Student s : studentList) {
            System.out.println(s);
        }
    }

    public static void addNewStudent() {
        System.out.print("nhap id: ");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.print("nhap ten sinh vien: ");
        String name = scanner.nextLine();
        System.out.print("nhap lop: ");
        String classes = scanner.nextLine();
        Student student = new Student(id, name, classes);
        writeStudentToFile(student);
    }

//    public static void writeStudentToFile(Student student) {
//        File file = new File(STUDENT_LIST_PATH);
//        try {
//            FileWriter fileWriter = new FileWriter(file);
//            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
//            bufferedWriter.newLine();
//            bufferedWriter.write(student.getInfoToCsv());
//            bufferedWriter.close();
//        }catch(IOException e) {
//            e.printStackTrace();
//        }
//    }

    public static void writeStudentToFile(Student student) {
        File file = new File(STUDENT_LIST_PATH);
        try {
            FileWriter fileWriter = new FileWriter(file, true);
            fileWriter.write(student.getInfoToCsv());
            fileWriter.write('\n');
            fileWriter.close();
        } catch (IOException ioException) {
            ioException.printStackTrace();
        }
    }
}
