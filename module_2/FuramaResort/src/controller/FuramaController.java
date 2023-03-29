package controller;
import services.ICustomerService;
import services.IEmployeeService;
import services.IFacilityService;
import services.impl.CustomerServiceImpl;
import services.impl.EmployeeServiceImpl;
import services.impl.FacilityServiceImpl;

import java.util.Scanner;

public class FuramaController {
    static Scanner sc = new Scanner(System.in);
    static IEmployeeService employeeService = new EmployeeServiceImpl();
    static ICustomerService customerService = new CustomerServiceImpl();
    static IFacilityService facilityService = new FacilityServiceImpl();

    public static void displayMainMenu() {


        boolean flag;
        do {
            flag = true;
            try {
                System.out.println("---------FURAMA MANAGEMENT PROGRAM--------" +
                        "\n 1.Employee Management" +
                        "\n 2.Customer Management" +
                        "\n 3.Facility Management " +
                        "\n 4.Booking Management" +
                        "\n 5.Promotion Management" +
                        "\n 6.Exit");
                System.out.println("Type here:");
                int choose = Integer.parseInt(sc.nextLine());

                switch (choose) {
                    case 1:
                        employeeManagement();
                        break;
                    case 2:
                        customerManagement();
                        break;
                    case 3:
                        facilityManagement();
                        break;
                    case 4:
                        bookingManagement();
                        break;
                    case 5:
                        promotionManagement();
                        break;
                    case 6:
                        flag = false;
                        break;
                    default:
                        System.out.println("Please type again");
                }
            } catch (NumberFormatException e) {
                System.out.println("Please type again");
            }
        } while (flag);
    }

    public static void employeeManagement() {
        boolean flag;
        do {
            flag = true;
            System.out.println("1. Display list of employees\n" +
                    "2. Add new employee\n" +
                    "3. Edit employee\n" +
                    "4. Return main menu");
            try {
                int option = Integer.parseInt(sc.nextLine());
                switch (option) {
                    case 1:
                        employeeService.display();
                        break;
                    case 2:
                        employeeService.add();
                        break;
                    case 3:
                        employeeService.edit();
                        break;
                    case 4:
                        flag = false;
                        break;
                    default:
                        System.out.println("Please type again");
                }
            } catch (NumberFormatException e) {
                System.out.println("Please type again");
            }

        } while (flag);
    }

    public static void customerManagement() {
        boolean flag;
        int option;
        do {
        System.out.println("1. Display list of customers\n" +
                "2. Add new customer\n" +
                "3. Edit customer\n" +
                "4. Return main menu");

            flag = true;
            try {
                option = Integer.parseInt(sc.nextLine());

                switch (option) {
                    case 1:
                        customerService.display();
                        break;
                    case 2:
                        customerService.add();
                        break;
                    case 3:
                        customerService.edit();
                        break;
                    case 4:
                        flag = false;
                        break;
                    default:
                        System.out.println("Please type again");
                }
            } catch (NumberFormatException e) {
                System.out.println("Please type again");
            }
        } while (flag);
    }

    public static void facilityManagement() {
        boolean flag;
        int option;
        do {
            flag = true;
        System.out.println("1. Display list of facilities\n" +
                "2. Add new facility\n" +
                "3. Display list of facilities maintenance\n" +
                "4. Return main menu");

            try {
                option = Integer.parseInt(sc.nextLine());

                switch (option) {
                    case 1:
                        facilityService.display();
                        break;
                    case 2:
                        break;
                    case 3:
                        break;
                    case 4:
                        flag = false;
                        break;
                    default:
                        System.out.println("Please type again");
                }
            } catch (NumberFormatException e) {
                System.out.println("Please type again");
            }
        } while (flag);
    }

    public static void bookingManagement() {
        boolean flag;
        int option;
        do {
        System.out.println("1. Add new booking\n" +
                "2. Display list of booking\n" +
                "3. Create new contract\n" +
                "4. Display list of contracts\n" +
                "5. Edit contract\n" +
                "6. Return main menu");

            flag = true;
            try {
                option = Integer.parseInt(sc.nextLine());

                switch (option) {
                    case 1:
                        break;
                    case 2:
                        break;
                    case 3:
                        break;
                    case 4:
                        break;
                    case 5:
                        break;
                    case 6:
                        flag = false;
                        break;
                    default:
                        System.out.println("Please type again");
                }
            } catch (NumberFormatException e) {
                System.out.println("Please type again");
            }
        } while (flag);
    }

    public static void promotionManagement() {
        boolean flag;
        int option;
        do {
        System.out.println("1. Display list customers use service \n" +
                "2. Display list customers get voucher\n" +
                "3. Return main menu");

            flag = true;
            try {
                option = Integer.parseInt(sc.nextLine());

                switch (option) {
                    case 1:
                        break;
                    case 2:
                        break;
                    case 3:
                        flag = false;
                        break;
                    default:
                        System.out.println("Please type again");
                }
            } catch (NumberFormatException e) {
                System.out.println("Please type again");
            }
        } while (flag);
    }
}

