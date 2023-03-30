package services.impl;

import model.furama_facility.House;
import services.IHouseService;

import java.util.*;

public class HouseServiceImpl implements IHouseService {
    static Scanner scanner = new Scanner(System.in);
    static LinkedHashMap<House, Integer> houseIntegerLinkedHashMap = new LinkedHashMap<>();
    static String[] typeOfRentList = {"year" +
            "month" +
            "day" +
            "hour"};
    static String[] roomStandard = {"Standard" +
            "Superior" +
            "Deluxe" +
            "Executive"};


    static {
        houseIntegerLinkedHashMap.put(new House("1", "1", 1, 1, 1, "1", "1", 1), 0);


    }

    @Override
    public void display() {
        for (House h :
                houseIntegerLinkedHashMap.keySet()) {
            System.out.println(h + " used time: " + houseIntegerLinkedHashMap.get(h));
        }
    }

    @Override
    public void add() {
        String id, serviceName, type, roomStandard;
        int area, price, maxPeo, floor;
        int count= 0;
        System.out.println("Enter id:");
        id = scanner.nextLine();
        for (House h : houseIntegerLinkedHashMap.keySet()) {
            if(!Objects.equals(h.getId(), id)) {
                count++;
            }
        }
        if (count == houseIntegerLinkedHashMap.size()) {
            System.out.println("Enter service name: ");
            serviceName = scanner.nextLine();
            System.out.println("Enter usable area: ");
            area = Integer.parseInt(scanner.nextLine());
            System.out.println("Enter price: ");
            price = Integer.parseInt(scanner.nextLine());
            System.out.println("Enter maximum people: ");
            maxPeo = Integer.parseInt(scanner.nextLine());
            System.out.println("Enter type of rent: ");
            type = chooseTypeOfRent();
            System.out.println("Enter room standard: ");
            roomStandard = chooseRoomStandard();
            System.out.println("Enter number of level: ");
            floor = Integer.parseInt(scanner.nextLine());
            houseIntegerLinkedHashMap.put(new House(id, serviceName, area, price, maxPeo, type, roomStandard, floor), 0);
            System.out.println("added");
        }
        else {
            System.out.println("ID exists");
        }
    }

    @Override
    public void edit() {
        String id, serviceName, type, roomStandard;
        int area, price, maxPeo, floor;
        int count= 0;
        System.out.println("Enter ID to edit: ");
        id = scanner.nextLine();
        for (House h : houseIntegerLinkedHashMap.keySet()) {
            if (Objects.equals(h.getId(), id)) {
                System.out.println("Enter service name: ");
                serviceName = scanner.nextLine();
                h.setServiceName(serviceName);
                System.out.println("Enter usable area: ");
                area = Integer.parseInt(scanner.nextLine());
                h.setUseableArea(area);
                System.out.println("Enter price: ");
                price = Integer.parseInt(scanner.nextLine());
                h.setPrice(price);
                System.out.println("Enter maximum people: ");
                maxPeo = Integer.parseInt(scanner.nextLine());
                h.setMaxNumOfPeo(maxPeo);
                System.out.println("Enter type of rent: ");
                type = chooseTypeOfRent();
                h.setTypeOfRent(type);
                System.out.println("Enter room standard: ");
                roomStandard = chooseRoomStandard();
                h.setRoomStandard(roomStandard);
                System.out.println("Enter number of level: ");
                floor = Integer.parseInt(scanner.nextLine());
                h.setNumOfLevel(floor);
                System.out.println("edited");
                break;
            }
            else {
                count++;
            }

        }
        if (count== houseIntegerLinkedHashMap.size()){
            System.out.println("ID not found");
        }
    }

    public static String chooseTypeOfRent() {

        String result = null;
        boolean flag;
        do {
            System.out.println("1. Year\n" +
                    "2. Month\n" +
                    "3. Day\n" +
                    "4. Hour");
            int choose = Integer.parseInt(scanner.nextLine());
            flag = true;
            switch (choose) {
                case 1:
                    result = typeOfRentList[0];
                    break;

                case 2:
                    result = typeOfRentList[1];
                    break;

                case 3:
                    result = typeOfRentList[2];
                    break;

                case 4:
                    result = typeOfRentList[3];
                    break;

                default:
                    flag = false;
            }
        } while (!flag);
        return result;
    }

    public static String chooseRoomStandard() {
        String result = null;
        boolean flag;
        do {
            flag = true;
            System.out.println("1. Standard\n" +
                    "2. Superior\n" +
                    "3. Deluxe\n" +
                    "4. Executive");
            String choose = scanner.nextLine();
            switch (choose) {
                case "1":
                    result = roomStandard[0];
                    break;
                case "2":
                    result = roomStandard[1];
                    break;
                case "3":
                    result = roomStandard[2];
                    break;
                case "4":
                    result = roomStandard[3];
                    break;
                default:
                    flag = false;
                    System.out.println("Please try again");

            }
        } while (!flag);
        return result;
    }
}
