package services.impl;

import model.furama_facility.House;
import services.IHouse;

import java.util.LinkedHashMap;
import java.util.Map;

public class HouseImpl implements IHouse {
    static LinkedHashMap<House, Integer> houseIntegerLinkedHashMap = new LinkedHashMap<>();

    static {
        houseIntegerLinkedHashMap.put(new House("1", 1, 1, 1, "1", "1", 1), 1);
    }

    @Override
    public void display() {
        for (Map.Entry<House, Integer> h :
                houseIntegerLinkedHashMap.entrySet()) {
            System.out.println(h);
        }
    }

    @Override
    public void add() {
        System.out.println("Enter service name: ");
        System.out.println("Enter usable area: ");
        System.out.println("Enter price: ");
        System.out.println("Enter maximum people: ");
        System.out.println("Enter service name: ");
        System.out.println("Enter service name: ");
    }

    @Override
    public void edit() {

    }
}
