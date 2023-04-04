package repository.impl;

import model.furama_facility.Villa;
import repository.IVillaRepository;
import util.read_and_write.ReadAndWriteVilla;

import java.util.LinkedHashMap;

public class VillaRepository implements IVillaRepository {
    @Override
    public void display() {
        LinkedHashMap<Villa,Integer> villaIntegerLinkedHashMap = ReadAndWriteVilla.read();
        for (Villa v : villaIntegerLinkedHashMap.keySet()) {
            System.out.println(v.getAll()+","+villaIntegerLinkedHashMap.get(v));
        }

    }

    @Override
    public void add(LinkedHashMap<Villa, Integer> villaIntegerLinkedHashMap) {
        ReadAndWriteVilla.write(villaIntegerLinkedHashMap,false);
    }
}
