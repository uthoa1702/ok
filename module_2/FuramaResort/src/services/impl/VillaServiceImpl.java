package services.impl;

import model.furama_facility.House;
import model.furama_facility.Villa;
import services.IVillaService;
import util.validate.Validate;

import java.util.LinkedHashMap;
import java.util.Objects;
import java.util.Scanner;

import static services.impl.HouseServiceImpl.chooseRoomStandard;
import static services.impl.HouseServiceImpl.chooseTypeOfRent;

public class VillaServiceImpl implements IVillaService {
    static Scanner scanner = new Scanner(System.in);
    static LinkedHashMap<Villa, Integer> villaIntegerLinkedHashMap = new LinkedHashMap<>();

    static {
        villaIntegerLinkedHashMap.put(new Villa("1", "villa101", 50, 20, 20, "year", "Deluxe", 10, 2), 0);
        villaIntegerLinkedHashMap.put(new Villa("2", "villa102", 50, 20, 20, "day", "Executive", 10, 2), 0);
    }

    @Override
    public void display() {
        for (Villa v :
                villaIntegerLinkedHashMap.keySet()) {
            System.out.println(v.getAll() + " ,used time: " + villaIntegerLinkedHashMap.get(v));
        }
    }

    @Override
    public void add() {
        String id, serviceName, type, roomStandard;
        int area, price, maxPeo, floor, poolArea;
        boolean flag = true;
        System.out.println("Enter id:");
        id = scanner.nextLine();
        for (Villa h : villaIntegerLinkedHashMap.keySet()) {
            if (Objects.equals(h.getId(), id)) {
                flag = false;
                break;
            }
        }
        if (flag) {
            serviceName = Validate.checkServiceName();
            area = Validate.checkArea();
            price = Validate.checkPrice();
            maxPeo = Validate.checkMaxPeople();
            System.out.println("Enter type of rent: ");
            type = chooseTypeOfRent();
            System.out.println("Enter room standard: ");
            roomStandard = chooseRoomStandard();
            floor = Validate.checkFloor();
            System.out.println("Enter pool area:");
            poolArea = Integer.parseInt(scanner.nextLine());
            villaIntegerLinkedHashMap.put(new Villa(id, serviceName, area, price, maxPeo, type, roomStandard, poolArea, floor), 0);
            System.out.println("added");
        } else {
            System.out.println("ID exists");
        }
    }

    @Override
    public void edit() {

    }

    public static void displayMaintenance() {
        for (Villa h :
                villaIntegerLinkedHashMap.keySet()) {
            if (villaIntegerLinkedHashMap.get(h) > 4) {
                System.out.println(h.getAll() + ", USED: " + villaIntegerLinkedHashMap.get(h) + " times");
            }
        }
    }
}
