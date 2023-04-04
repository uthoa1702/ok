package services.impl;

import model.furama_facility.Villa;
import repository.impl.VillaRepository;
import services.IVillaService;
import util.read_and_write.ReadAndWriteVilla;
import util.validate.Validate;

import java.util.LinkedHashMap;
import java.util.Objects;
import java.util.Scanner;

import static services.impl.HouseServiceImpl.chooseRoomStandard;
import static services.impl.HouseServiceImpl.chooseTypeOfRent;

public class VillaServiceImpl implements IVillaService {
    static Scanner scanner = new Scanner(System.in);
    static LinkedHashMap<Villa, Integer> villaIntegerLinkedHashMap = new LinkedHashMap<>();
    static VillaRepository villaRepository = new VillaRepository();

    @Override
    public void display() {
        villaIntegerLinkedHashMap = ReadAndWriteVilla.read();
        villaRepository.display();
    }

    @Override
    public void add() {
        villaIntegerLinkedHashMap = ReadAndWriteVilla.read();
        String id, serviceName, type, roomStandard;
        int  price, maxPeo, floor, poolArea;
        double area;
        boolean flag = true;
        System.out.println("Enter id:");
        id = Validate.checkVillaID();
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
            villaRepository.add(villaIntegerLinkedHashMap);
            System.out.println("added");
        } else {
            System.out.println("ID exists");
        }
    }

    @Override
    public void edit() {

    }

    public static void displayMaintenance() {
        villaIntegerLinkedHashMap = ReadAndWriteVilla.read();
        for (Villa h :
                villaIntegerLinkedHashMap.keySet()) {
            if (villaIntegerLinkedHashMap.get(h) > 4) {
                System.out.println(h.getAll() + ", USED: " + villaIntegerLinkedHashMap.get(h) + " times");
            }
        }
    }
}
