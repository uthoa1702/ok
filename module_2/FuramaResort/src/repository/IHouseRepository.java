package repository;

import model.furama_facility.House;

import java.util.LinkedHashMap;

public interface IHouseRepository {
    void display();
    void add(LinkedHashMap<House,Integer> houseIntegerLinkedHashMap);

}
