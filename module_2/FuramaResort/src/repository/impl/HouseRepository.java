package repository.impl;

import model.furama_facility.House;
import repository.IHouseRepository;
import util.read_and_write.ReadAndWriteHouse;

import java.util.LinkedHashMap;
import java.util.Map;

public class HouseRepository implements IHouseRepository {
    @Override
    public void display() {
        LinkedHashMap<House,Integer> houseIntegerLinkedHashMap = ReadAndWriteHouse.read();
        for (Map.Entry<House, Integer> h :
                houseIntegerLinkedHashMap.entrySet()) {
            System.out.println(h.getKey().getAll()+","+h.getValue());
        }
    }

    @Override
    public void add(LinkedHashMap<House, Integer> houseIntegerLinkedHashMap) {
        ReadAndWriteHouse.write(houseIntegerLinkedHashMap,false);

    }

    public static LinkedHashMap<House,Integer> readFile() {
        LinkedHashMap<House,Integer> linkedHashMap = ReadAndWriteHouse.read();
        return linkedHashMap;
    }
}
