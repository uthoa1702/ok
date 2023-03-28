package valid_name;

import java.util.Scanner;

public class ValidFullName {
    private static final String REGEX = "^[A-Z][a-z]*(\\s[A-Z][a-z]*)*\\s[A-Z][a-z]*$";

    public static void main(String[] args) {
        String name;
        System.out.println("Enter class name:");
        Scanner scanner = new Scanner(System.in);
        name = scanner.nextLine();
        boolean s = name.matches(REGEX);
        if (s) {
            System.out.println("valid class name");
        } else {
            System.out.println("invalid class name");
        }
    }
}
