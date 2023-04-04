package repository;

import model.furama_facility.Villa;

import java.util.LinkedHashMap;

public interface IVillaRepository {
    void display();
    void add(LinkedHashMap<Villa,Integer> villaIntegerLinkedHashMap);
}
