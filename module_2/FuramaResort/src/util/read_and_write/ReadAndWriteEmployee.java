package util.read_and_write;
import model.person.Employee;
import java.io.*;
import java.util.ArrayList;

import java.util.List;

public class ReadAndWriteEmployee {
    static final String PATH_EMPLOYEE = "D:\\code_Gym\\ok\\module_2\\FuramaResort\\src\\data\\employee.csv";

    public static List<Employee> read() {

        List<Employee> employeeList = new ArrayList<>();
        FileReader fileReader = null;
        BufferedReader bufferedReader = null;
        try {
            String temp = "";
            String[] arrTemp;
            Employee employee;
            fileReader = new FileReader(PATH_EMPLOYEE);
            bufferedReader = new BufferedReader(fileReader);
            while ((temp = bufferedReader.readLine()) != null)  {
                arrTemp = temp.split(",");
                employee = new Employee( Integer.parseInt(arrTemp[0]), arrTemp[1],arrTemp[2], arrTemp[3], Integer.parseInt(arrTemp[4]), Integer.parseInt(arrTemp[5]), arrTemp[6], arrTemp[7], arrTemp[8], Integer.parseInt(arrTemp[9]));
                employeeList.add(employee);
            }
            bufferedReader.close();
            fileReader.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
        return employeeList;
    }
    public static void write(List<Employee> employees, boolean append) {
        File file = new File(PATH_EMPLOYEE);
        FileWriter fileWriter = null;
        BufferedWriter bufferedWriter = null;
        try {
            fileWriter = new FileWriter(file,append);
            bufferedWriter = new BufferedWriter(fileWriter);
            for (Employee e : employees) {
                bufferedWriter.write(e.getAll());
                bufferedWriter.newLine();
            }
            bufferedWriter.close();
            fileWriter.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
