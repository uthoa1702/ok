package util.read_and_write;

import model.person.Employee;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ReadAndWriteEmployee {

    public static List<Employee> read(String path) {

        List<Employee> employeeList = new ArrayList<>();
        FileReader fileReader = null;
        BufferedReader bufferedReader = null;
        try {
            String temp = "";
            String[] arrTemp;
            Employee employee;
            fileReader = new FileReader(path);
            bufferedReader = new BufferedReader(fileReader);
            while ((temp = bufferedReader.readLine()) != null)  {
                arrTemp = temp.split(",");
                employee = new Employee( Integer.parseInt(arrTemp[0]), arrTemp[0],arrTemp[0], arrTemp[0], Integer.parseInt(arrTemp[0]), Integer.parseInt(arrTemp[0]), arrTemp[0], arrTemp[0], arrTemp[0], Integer.parseInt(arrTemp[0]));
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return employeeList;
    }
}
