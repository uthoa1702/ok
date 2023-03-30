package services.impl;

import model.furama_facility.Villa;
import services.IVillaService;

import java.util.LinkedHashMap;
import java.util.Objects;
import java.util.Scanner;

import static services.impl.HouseServiceImpl.chooseRoomStandard;
import static services.impl.HouseServiceImpl.chooseTypeOfRent;

public class VillaServiceImpl implements IVillaService {
    static Scanner scanner = new Scanner(System.in);
    static LinkedHashMap<Villa,Integer> villaIntegerLinkedHashMap = new LinkedHashMap<>();
    @Override
    public void display() {
        for (Villa v :
                villaIntegerLinkedHashMap.keySet()) {
            System.out.println(v + " used time: " + villaIntegerLinkedHashMap.get(v));
        }
    }

    @Override
    public void add() {
        String id, serviceName, type, roomStandard;
        int area, price, maxPeo, floor, poolArea;
        int count= 0;
        System.out.println("Enter id:");
        id = scanner.nextLine();
        for (Villa h : villaIntegerLinkedHashMap.keySet()) {
            if(!Objects.equals(h.getId(), id)) {
                count++;
            }
        }
        if (count == villaIntegerLinkedHashMap.size()) {
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
            System.out.println("Enter pool area:");
            poolArea = Integer.parseInt(scanner.nextLine());
            villaIntegerLinkedHashMap.put(new Villa(id, serviceName, area, price, maxPeo, type, roomStandard, poolArea, floor), 0);
            System.out.println("added");
        }
        else {
            System.out.println("ID exists");
        }
    }

    @Override
    public void edit() {

    }
}
