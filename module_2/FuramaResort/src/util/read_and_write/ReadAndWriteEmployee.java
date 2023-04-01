package util.read_and_write;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

public class ReadAndWriteEmployee {
    static final String EMPLOYEE_PATH_FILE = "D:\\code_Gym\\ok\\module_2\\FuramaResort\\src\\data\\employee.csv";

    public static ArrayList<String> read() {
        ArrayList<String> employees = new ArrayList<>();
        File file = new File(EMPLOYEE_PATH_FILE);
        try (FileReader reader = new FileReader(file);
             BufferedReader br = new BufferedReader(reader)) {

            String line = null;
            while ((line = br.readLine()) != null) {
                String[] strings = line.split(",");
                employees.addAll(Arrays.asList(strings));
                br.readLine();
            }

        } catch (IOException e) {
            System.err.println(e.getMessage());
        }

return employees;
    }
}
