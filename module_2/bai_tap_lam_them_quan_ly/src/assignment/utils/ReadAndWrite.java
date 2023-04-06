package assignment.utils;

import assignment.model.Instructor;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadAndWrite {
    static final String PATH = "C:\\Users\\AD\\Documents\\GitHub\\ok\\module_2\\bai_tap_lam_them_quan_ly\\src\\assignment\\data\\instructor.csv";
    public static List<Instructor> read() {
        List<Instructor> instructorList = new ArrayList<>();
        File file = new File(PATH);
        FileReader fileReader = null;
        BufferedReader bufferedReader = null;

        try {
            fileReader = new FileReader(file);
            bufferedReader = new BufferedReader(fileReader);
            String line = null;
            while ((line = bufferedReader.readLine()) != null) {
                String[] arr = line.split(",");
                instructorList.add(new Instructor(Integer.parseInt(arr[0]),arr[1],arr[2],arr[3],arr[4]));
            }
            bufferedReader.close();
            fileReader.close();
        }catch (IOException e) {
            e.printStackTrace();
        }
        return instructorList;
    }
    public static void write(List<Instructor> list,boolean append) {
        File file = new File(PATH);
        FileWriter fileWriter = null;
        BufferedWriter bufferedWriter = null;
        try {
            fileWriter = new FileWriter(file,false);
            bufferedWriter = new BufferedWriter(fileWriter);
            for (Instructor i :
                    list) {
                bufferedWriter.write(i.toString());
                bufferedWriter.newLine();
            }
            bufferedWriter.close();
            fileWriter.close();
        }catch (IOException e) {
            e.printStackTrace();
        }
    }
}
