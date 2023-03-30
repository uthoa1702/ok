package services.impl;


import model.furama_facility.Room;
import services.IRoomService;

import java.util.LinkedHashMap;
import java.util.Objects;
import java.util.Scanner;


import static services.impl.HouseServiceImpl.chooseTypeOfRent;

public class RoomServiceImpl implements IRoomService {
    static LinkedHashMap<Room,Integer> roomIntegerLinkedHashMap = new LinkedHashMap<>();
    Scanner scanner = new Scanner(System.in);
    @Override
    public void display() {

    }

    @Override
    public void add() {
        String id, serviceName, type, roomStandard;
        int area, price, maxPeo, floor;
        int count= 0;
        System.out.println("Enter id:");
        id = scanner.nextLine();
        for (Room h : roomIntegerLinkedHashMap.keySet()) {
            if(!Objects.equals(h.getId(), id)) {
                count++;
            }
        }
        if (count == roomIntegerLinkedHashMap.size()) {
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
            System.out.println("Enter free service included:");
            String free = scanner.nextLine();
            roomIntegerLinkedHashMap.put(new Room(id, serviceName, area, price, maxPeo, type,free), 0);
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
