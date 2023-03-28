package validate_student_name;

import java.util.Scanner;

public class ValidateStudentName {
    static boolean flag = true;
    private static final String REGEX_NAME = "^[A|C|P][0-9]{4}[G|H|I|K]$";
    private static final String REGEX_PHONE = "^\\([0-9]{2}\\)(-)\\((0)[0-9]{9}\\)$";
    static Scanner scanner = new Scanner(System.in);


    public static void main(String[] args) {
        boolean flagMenu = true;
        do {
            System.out.println("Select option: \n" +
                    "1. Validate class name\n" +
                    "2. Validate phone number\n" +
                    "3. Exit");
            int choose = Integer.parseInt(scanner.nextLine());
            switch (choose) {
                case 1:
                    validateName();
                    break;
                case 2:
                    validPhoneNumber();
                    break;
                case 3:
                    flagMenu = false;
                    break;
                default:
                    System.out.println("type again");
            }
        } while (flagMenu);

    }

    public static void validateName() {
        String name;
        System.out.println("Enter class name:");
        name = scanner.nextLine();
        boolean s = name.matches(REGEX_NAME);
        if (s) {
            flag = true;
            System.out.println("valid class name");
        } else {
            flag = false;
            System.out.println("invalid class name");
        }
    }

    public static void validPhoneNumber() {
        String phone;
        System.out.println("Enter phone number:");
        phone = scanner.nextLine();
        boolean s = phone.matches(REGEX_PHONE);
        if (s) {
            flag = true;
            System.out.println("valid phone number");
        } else {
            System.out.println("invalid phone number");
        }
    }
}
