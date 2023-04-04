package services.impl;

import model.booking.Booking;
import model.person.Customer;
import repository.impl.BookingRepository;
import repository.impl.CustomerRepository;
import services.IBookingService;
import services.IContactService;
import util.validate.Validate;

import java.util.LinkedList;
import java.util.Scanner;
import java.util.TreeSet;


public class BookingServiceImpl implements IBookingService {
    CustomerRepository customerRepository = new CustomerRepository();
    BookingRepository bookingRepository = new BookingRepository();
    static Scanner scanner = new Scanner(System.in);

    @Override
    public void display() {
        TreeSet<Booking> bookingTreeSet = bookingRepository.getListBooking();
        for (Booking b : bookingTreeSet) {
            System.out.println(b);
        }
    }

    @Override
    public void add() {
        TreeSet<Booking> bookingTreeSet = bookingRepository.getListBooking();
        int bookingID,   customerID;
        String serviceName, serviceType,startDate,endDate;
        boolean flag = true;

        do {

            System.out.println("Enter booking id: ");
            bookingID = Integer.parseInt(scanner.nextLine());
            for (Booking b : bookingTreeSet) {
                if (b.getBookingId() == bookingID) {
                    System.out.println("ID exists");
                    break;
                } else {
                    flag = false;
                }
            }
        } while (flag);
        startDate = Validate.checkStartDate();
        endDate = Validate.checkEndDate();
        LinkedList<Customer> customerLinkedList = CustomerRepository.getCustomerList();
        for (Customer c :
                customerLinkedList) {
            System.out.println(c);
        }
        boolean flagCustomerID;
        do {
            flagCustomerID = true;
            System.out.println("Enter customer ID: ");
            customerID = Integer.parseInt(scanner.nextLine());
            for (Customer c :
                    customerLinkedList) {
                if (c.getIdFurama() == customerID) {
                    flagCustomerID = false;
                    break;
                }
            }
        }while (flagCustomerID);
       //lam tiep o day ne


    }

    @Override
    public void edit() {

    }
}
