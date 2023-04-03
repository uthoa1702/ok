package repository.impl;

import model.person.Customer;
import repository.ICustomerRepository;
import util.read_and_write.ReadAndWriteCustomer;


import java.util.LinkedList;


public class CustomerRepository implements ICustomerRepository {
    @Override
    public void display() {
        LinkedList<Customer> customerList = ReadAndWriteCustomer.read();
        for (Customer c :
                customerList) {
            System.out.println(c.getAll());
        }
    }

    @Override
    public void add(LinkedList<Customer> customerList) {
        ReadAndWriteCustomer.write(customerList,false);

    }

    @Override
    public void edit(LinkedList<Customer> customerList) {
        ReadAndWriteCustomer.write(customerList,false);

    }
}
