package services.impl;


import model.furama_facility.House;
import model.furama_facility.Room;
import repository.IRoomRepository;
import repository.impl.RoomRepository;
import services.IRoomService;
import util.read_and_write.ReadAndWriteRoom;
import util.validate.Validate;

import java.util.LinkedHashMap;
import java.util.Objects;
import java.util.Scanner;


import static services.impl.HouseServiceImpl.chooseTypeOfRent;
import static services.impl.HouseServiceImpl.roomStandard;

public class RoomServiceImpl implements IRoomService {
    static LinkedHashMap<Room,Integer> roomIntegerLinkedHashMap = new LinkedHashMap<>();

    static Scanner scanner = new Scanner(System.in);
    static IRoomRepository roomRepository = new RoomRepository();
    @Override
    public void display() {
       roomRepository.display();
    }

    @Override
    public void add() {
        roomIntegerLinkedHashMap = ReadAndWriteRoom.read();
        String id, serviceName, type ;
        int  price, maxPeo;
        double area;

        boolean flag = true;

        id = Validate.checkRoomID();
        for (Room h : roomIntegerLinkedHashMap.keySet()) {
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
            type = chooseTypeOfRent();
            System.out.println("Enter free service included:");
            String free = scanner.nextLine();
            roomIntegerLinkedHashMap.put(new Room(id, serviceName, area, price, maxPeo, type,free), 0);
            roomRepository.add(roomIntegerLinkedHashMap);
            System.out.println("added");
        } else {
            System.out.println("ID exists");

        }

    }

    @Override
    public void edit() {

    }
    public static void displayMaintenance() {
        roomIntegerLinkedHashMap = ReadAndWriteRoom.read();
        for (Room h :
                roomIntegerLinkedHashMap.keySet()) {
            if (roomIntegerLinkedHashMap.get(h)>4){
                System.out.println(h.getAll() +", USED: "+roomIntegerLinkedHashMap.get(h)+ " times" );
            }
        }
    }
}
