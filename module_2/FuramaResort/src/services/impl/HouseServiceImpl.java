package services.impl;

import model.furama_facility.House;
import repository.impl.HouseRepository;
import services.IHouseService;
import util.read_and_write.ReadAndWriteHouse;
import util.validate.Validate;

import java.util.*;

public class HouseServiceImpl implements IHouseService {
    static Scanner scanner = new Scanner(System.in);
    static LinkedHashMap<House, Integer> houseIntegerLinkedHashMap = ReadAndWriteHouse.read();
    static List<String> typeOfRentList = new ArrayList<>();

    static {
        typeOfRentList.add("Year");
        typeOfRentList.add("Month");
        typeOfRentList.add("Day");
        typeOfRentList.add("Hour");
    }

    static String[] roomStandard = {"Standard",
            "Superior",
            "Deluxe",
            "Executive"};


    static {
        houseIntegerLinkedHashMap.put(new House("1", "1", 1, 1, 1, "1", "1", 1), 5);


    }

    static final String REGEX_HOUSE_ID = "^(SVHO)(-)[0-9]{4}$";
    static final String REGEX_HOUSE_SERVICE_NAME = "^[A-Z][a-z]*$";
    HouseRepository houseRepository = new HouseRepository();

    @Override
    public void display() {
        houseRepository.display();
    }

    @Override
    public void add() {

        String id, serviceName, type, roomStandard;
        int area, price, maxPeo, floor;
        boolean flag = true;
        boolean check;

        do {
            houseIntegerLinkedHashMap = ReadAndWriteHouse.read();
            System.out.println("Enter id:");
            System.out.println("Example: SVHO-YYYY ");
            id = scanner.nextLine();
            check = checkHouseId(id);
        } while (!check);
        for (House h : houseIntegerLinkedHashMap.keySet()) {
            if (Objects.equals(h.getId(), id)) {
                flag = false;
                break;
            }
        }
        if (flag) {
            boolean flagServiceName;
            do {
                flagServiceName = true;
                System.out.println("Enter service name: ");
                serviceName = scanner.nextLine();
                boolean match = serviceName.matches(REGEX_HOUSE_SERVICE_NAME);
                if (match) {

                    boolean flagArea;
                    do {
                        System.out.println("Enter usable area: ");
                        area = Integer.parseInt(scanner.nextLine());
                        flagArea = true;
                        if (area > 30) {
                            price = Validate.checkPrice();
                            maxPeo = Validate.checkMaxPeople();
                            System.out.println("Enter type of rent: ");
                            type = chooseTypeOfRent();
                            System.out.println("Enter room standard: ");
                            roomStandard = chooseRoomStandard();
                            floor = Validate.checkFloor();
                            houseIntegerLinkedHashMap.put(new House(id, serviceName, area, price, maxPeo, type, roomStandard, floor), 0);
                            houseRepository.add(houseIntegerLinkedHashMap);
                            System.out.println("added");
                            flagServiceName = false;
                            flagArea = false;
                        } else {
                            flagArea = true;
                        }

                    } while (flagArea);

                }

            } while (flagServiceName);

        } else {
            System.out.println("ID exists");
        }
    }

    @Override
    public void edit() {
        String id, serviceName, type, roomStandard;
        int area, price, maxPeo, floor;
        int count = 0;
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
            } else {
                count++;
            }

        }
        if (count == houseIntegerLinkedHashMap.size()) {
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
                    result = typeOfRentList.get(0);
                    break;

                case 2:
                    result = typeOfRentList.get(1);
                    break;

                case 3:
                    result = typeOfRentList.get(2);
                    break;

                case 4:
                    result = typeOfRentList.get(3);
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

    public static void displayMaintenance() {
        for (House h :
                houseIntegerLinkedHashMap.keySet()) {
            if (houseIntegerLinkedHashMap.get(h) > 4) {
                System.out.println(h.getAll() + ", USED: " + houseIntegerLinkedHashMap.get(h) + " times");
            }
        }
    }

    public static boolean checkHouseId(String id) {
        boolean result;
        result = id.matches(REGEX_HOUSE_ID);
        return result;
    }
}
