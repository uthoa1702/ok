package repository.impl;

import model.person.Employee;
import repository.IEmployeeRepository;
import util.read_and_write.ReadAndWrite;
import util.read_and_write.ReadAndWriteEmployee;

import java.util.ArrayList;
import java.util.List;


public class EmployeeRepository implements IEmployeeRepository {
    static final String PATH_EMPLOYEE = "D:\\code_Gym\\ok\\module_2\\FuramaResort\\src\\data\\employee.csv";




    @Override
    public void display() {
        List<Employee> employeeList = ReadAndWriteEmployee.read();
        for (Employee s :
                employeeList) {
            System.out.println(s.toString());
        }
    }

    @Override
    public void add(List<Employee> employeeList) {
        ReadAndWriteEmployee.write(employeeList, false);
    }

    @Override
    public void edit(List<Employee> employeeList) {
        ReadAndWriteEmployee.write(employeeList, false);

    }

    public static List<Employee> readFile(){
        List<Employee> employeeList = ReadAndWriteEmployee.read();
        return employeeList;
    }

}
