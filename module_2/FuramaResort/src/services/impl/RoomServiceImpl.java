package services.impl;


import model.furama_facility.House;
import model.furama_facility.Room;
import services.IRoomService;

import java.util.LinkedHashMap;
import java.util.Objects;
import java.util.Scanner;


import static services.impl.HouseServiceImpl.chooseTypeOfRent;
import static services.impl.HouseServiceImpl.roomStandard;

public class RoomServiceImpl implements IRoomService {
    static LinkedHashMap<Room,Integer> roomIntegerLinkedHashMap = new LinkedHashMap<>();
    static {
        roomIntegerLinkedHashMap.put(new Room("1","asd",10,1000,20,"year","asd"),1);
        roomIntegerLinkedHashMap.put(new Room("2","asd",10,1000,20,"year","asd"),5);
        roomIntegerLinkedHashMap.put(new Room("3","asd",10,1000,20,"year","asd"),1);
        roomIntegerLinkedHashMap.put(new Room("4","asd",10,1000,20,"year","asd"),6);
    }
    static Scanner scanner = new Scanner(System.in);
    @Override
    public void display() {
        for (Room r :
                roomIntegerLinkedHashMap.keySet()) {
            System.out.println(r.getAll()+ ", used time:"+ roomIntegerLinkedHashMap.get(r));
        }
    }

    @Override
    public void add() {
        String id, serviceName, type ;
        int area, price, maxPeo;

        boolean flag = true;
        System.out.println("Enter id:");
        id = scanner.nextLine();
        for (Room h : roomIntegerLinkedHashMap.keySet()) {
            if (Objects.equals(h.getId(), id)) {
                flag = false;
                break;
            }
        }
        if (flag) {
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
        } else {
            System.out.println("ID exists");

        }

    }

    @Override
    public void edit() {

    }
    public static void displayMaintenance() {
        for (Room h :
                roomIntegerLinkedHashMap.keySet()) {
            if (roomIntegerLinkedHashMap.get(h)>4){
                System.out.println(h.getAll() +", USED: "+roomIntegerLinkedHashMap.get(h)+ " times" );
            }
        }
    }
}
