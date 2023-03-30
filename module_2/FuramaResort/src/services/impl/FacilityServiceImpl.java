package services.impl;



import services.IFacilityService;
import services.IHouseService;
import services.IRoomService;
import services.IVillaService;

import java.util.Scanner;

public class FacilityServiceImpl implements IFacilityService {
    Scanner scanner = new Scanner(System.in);
    IHouseService houseService = new HouseServiceImpl();
    IVillaService villaService =  new VillaServiceImpl();
    IRoomService roomService = new RoomServiceImpl();


    @Override
    public void display() {
        System.out.println("----House list----");
        houseService.display();
        System.out.println("----Room list----");
        roomService.display();
        System.out.println("----Villa list----");
        villaService.display();

    }

    @Override
    public void add() {
        boolean flag;
        String choose;
        do {
            flag = true;
            System.out.println("1. Add House\n" +
                    "2. Add room\n" +
                    "3. Add villa\n" +
                    "4. Return to main menu");
            choose = scanner.nextLine();
            switch (choose) {
                case "1":
                    houseService.add();
                    break;
                case "2":
                    roomService.add();
                    break;
                case "3":
                    villaService.add();
                    break;
                case "4":
                    break;
                default:
                    flag = false;
                    System.out.println("Please type again");
            }
        }
        while (!flag);

    }

    @Override
    public void edit() {

    }
    public static void displayMaintenanceAll() {
        System.out.println("----House list----");
        HouseServiceImpl.displayMaintenance();
        System.out.println("----Room list----");
        RoomServiceImpl.displayMaintenance();
        System.out.println("----Villa list----");
        VillaServiceImpl.displayMaintenance();
    }


}
