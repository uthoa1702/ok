package repository;

import model.person.Customer;

import java.util.LinkedList;


public interface ICustomerRepository  {
    void display();

    void add(LinkedList<Customer> customerList);

    void edit(LinkedList<Customer> customerList);
}
