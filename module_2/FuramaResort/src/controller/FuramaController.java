package controller;

import java.util.Scanner;

public class FuramaController {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        displayMainMenu();
    }

    public static void displayMainMenu() {


        boolean flag = true;
        do {
            try {
                System.out.println("choose option:" +
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
        boolean flag = true;

        System.out.println("1. Display list of employees\n" +
                "2. Add new employee\n" +
                "3. Edit employee\n" +
                "4. Return main menu");
        do {
            try {
                int option = Integer.parseInt(sc.nextLine());
                switch (option) {
                    case 1:
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

    public static void customerManagement() {
        boolean flag = true;
        int option;
        System.out.println("1. Display list of customers\n" +
                "2. Add new customer\n" +
                "3. Edit customer\n" +
                "4. Return main menu");
        do {
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
        boolean flag = true;
        int option;
        System.out.println("1. Display list of facilities\n" +
                "2. Add new facility\n" +
                "3. Display list of facilities maintenance\n" +
                "4. Return main menu");
        do {
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
        boolean flag = true;
        int option;
        System.out.println("1. Add new booking\n" +
                "2. Display list of booking\n" +
                "3. Create new contract\n" +
                "4. Display list of contracts\n" +
                "5. Edit contract\n" +
                "6. Return main menu");
        do {
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
        boolean flag = true;
        int option;
        System.out.println("1. Display list customers use service \n" +
                "2. Display list customers get voucher\n" +
                "3. Return main menu");
        do {
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

