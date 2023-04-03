package repository;

import model.person.Employee;

import java.util.List;

public interface IEmployeeRepository {

    void display();


    void add(List<Employee> employeeList);


    void edit(List<Employee> employeeList);
}
