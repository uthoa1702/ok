package services.impl;

import model.person.Customer;
import services.ICustomerService;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

import static services.impl.EmployeeServiceImpl.stringListGender;

public class CustomerServiceImpl implements ICustomerService {
    static Scanner scanner = new Scanner(System.in);

    static LinkedList<Customer> customerLinkedList = new LinkedList<>();

    static List<String> typeOfCustomer = new ArrayList<>();

    static {
        typeOfCustomer.add("Diamond");
        typeOfCustomer.add("Platinum");
        typeOfCustomer.add("Gold");
        typeOfCustomer.add("Silver");
        typeOfCustomer.add("Member");
    }

    @Override
    public void display() {
        for (Customer c : customerLinkedList) {
            System.out.println(c);
        }
    }

    @Override
    public void add() {
        String name, birthDay, gender, address, typeOfMember, mail;
        int id, phone, idCustomer;
        int count = 0;

        System.out.println("Enter customer id: ");
        idCustomer = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < customerLinkedList.size(); i++) {
            if (customerLinkedList.get(i).getIdFurama() != idCustomer) {
                count++;
            }
        }
        if (count == customerLinkedList.size()) {
            System.out.println("Enter name:");
            name = scanner.nextLine();
            System.out.println("Enter birth day:");
            birthDay = scanner.nextLine();
            gender = chooseGender();
            System.out.println("Enter id:");
            id = Integer.parseInt(scanner.nextLine());
            System.out.println("Enter phone number: ");
            phone = Integer.parseInt(scanner.nextLine());
            System.out.println("Enter email:");
            mail = scanner.nextLine();
            typeOfMember = typeOfMember();
            System.out.println("Enter address");
            address = scanner.nextLine();
            customerLinkedList.add(new Customer(idCustomer, name, birthDay, gender, id, phone, mail, typeOfMember, address));
        }
        else {
            System.out.println("ID exist");
        }
    }

    @Override
    public void edit() {
        String name, birthDay, gender, address, typeOfMember, mail;
        int id, phone, idCustomer;
        int count = 0;
        System.out.println("Enter customer id to edit: ");
        idCustomer = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < customerLinkedList.size(); i++) {
            if (customerLinkedList.get(i).getIdFurama() == idCustomer) {
                System.out.println("Enter name:");
                name = scanner.nextLine();
                customerLinkedList.get(i).setName(name);
                System.out.println("Enter birth day:");
                birthDay = scanner.nextLine();
                customerLinkedList.get(i).setBirthday(birthDay);
                gender = chooseGender();
                customerLinkedList.get(i).setGender(gender);
                System.out.println("Enter id:");
                id = Integer.parseInt(scanner.nextLine());
                customerLinkedList.get(i).setId(id);
                System.out.println("Enter phone number: ");
                phone = Integer.parseInt(scanner.nextLine());
                customerLinkedList.get(i).setPhoneNum(phone);
                System.out.println("Enter email:");
                mail = scanner.nextLine();
                customerLinkedList.get(i).setEmail(mail);
                typeOfMember = typeOfMember();
                customerLinkedList.get(i).setTypeOfCustomer(typeOfMember);
                System.out.println("Enter address");
                address = scanner.nextLine();
                customerLinkedList.get(i).setAddress(address);
                System.out.println("changed");
                break;
            }
            else {
                count++;
            }
        }
        if (count == customerLinkedList.size()) {
            System.out.println("ID not found");
        }
    }

    public static String typeOfMember() {
        String type = null;

        System.out.println("Type of member: \n" +
                "1. Diamond\n" +
                "2. Platinum\n" +
                "3. Gold\n" +
                "4. Silver\n" +
                "5. Member");
        int choose = Integer.parseInt(scanner.nextLine());
        boolean flag;
        do {
            flag = true;
            switch (choose) {
                case 1:
                    type = typeOfCustomer.get(0);
                    break;
                case 2:
                    type = typeOfCustomer.get(1);
                    break;
                case 3:
                    type = typeOfCustomer.get(2);
                    break;
                case 4:
                    type = typeOfCustomer.get(3);
                    break;
                case 5:
                    type = typeOfCustomer.get(4);
                    break;
                default:
                    flag = false;
                    System.out.println("Please choose again");
            }
        } while (!flag);
        return type;
    }

    public static String chooseGender() {
        boolean flag;
        int choose;
        do {
            flag = true;
            System.out.println("Choose gender: \n" +
                    "1. Male \n" +
                    "2. Female \n" +
                    "3. Other");
            choose = Integer.parseInt(scanner.nextLine());

            if (choose > 3 || choose < 1) {
                System.out.println("Choose again");
                flag = false;
            }
        } while (!flag);
        return stringListGender.get(choose - 1);
    }
}
