package util.validate;

import java.util.Scanner;

public class Validate {
    static Scanner scanner = new Scanner(System.in);
    static final String REGEX_SERVICE_NAME = "^[A-Z][a-z]*$";
    static final String REGEX_ROOM_ID = "^(SVRO)(-)[0-9]{4}$";
    static final String REGEX_VILLA_ID = "^(SVVL)(-)[0-9]{4}$";
    static final String REGEX_BIRTHDAY = "^(([0-2][0-9])||3[0-1])\\/(([0][0-9])||1[0-2])\\/((19((2[4-9])||([3-9][0-9])))||200[0-5])$";

    public static int checkPrice() {
        boolean flag;
        int price;
        do {
            flag = true;
            System.out.println("Enter price: ");
            price = Integer.parseInt(scanner.nextLine());
            if (price > 0) {
                flag = false;
            }
        } while (flag);
        return price;
    }

    public static int checkMaxPeople() {
        boolean flag;
        int maxPeople;
        do {
            flag = true;
            System.out.println("Enter maximum people: ");
            maxPeople = Integer.parseInt(scanner.nextLine());
            if (maxPeople > 0 && maxPeople < 20) {
                flag = false;
            }
        } while (flag);
        return maxPeople;
    }

    public static int checkFloor() {
        boolean flag;
        int floor;
        do {
            flag = true;
            System.out.println("Enter number of level: ");
            floor = Integer.parseInt(scanner.nextLine());
            if (floor > 0) {
                flag = false;
            }
        } while (flag);
        return floor;
    }

    public static String checkRoomID() {
        boolean flag;
        String id;

        do {
            flag = true;
            System.out.println("Enter room ID: ");
            id = scanner.nextLine();
            flag = id.matches(REGEX_ROOM_ID);
        } while (!flag);
        return id;
    }

    public static String checkVillaID() {
        boolean flag;
        String id;
        do {
            flag = true;
            System.out.println("Enter villa ID: ");
            id = scanner.nextLine();
            flag = id.matches(REGEX_VILLA_ID);
        } while (!flag);
        return id;
    }

    public static String checkServiceName() {
        boolean check;
        String name;

        do {
            check = true;
            System.out.println("Enter service name: ");
            name = scanner.nextLine();
            check = name.matches(REGEX_SERVICE_NAME);
        } while (!check);
        return name;
    }

    public static int checkArea() {
        boolean check;
        int area;

        do {
            check = true;
            System.out.println("Enter area: ");
            area = Integer.parseInt(scanner.nextLine());
            if (area > 30) {
                check = false;
            }
        } while (check);
        return area;
    }

    public static String checkBirthday() {
        String birth;
        boolean check;
        do {
            check = true;
            System.out.println("Enter birthdayy: ");
            birth = scanner.nextLine();
            check = birth.matches(REGEX_BIRTHDAY);
        } while (!check);
        return birth;
    }


}
