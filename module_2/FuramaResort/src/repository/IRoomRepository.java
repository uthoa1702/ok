package repository;

import model.furama_facility.Room;

import java.util.LinkedHashMap;

public interface IRoomRepository {
    void display();
    void add(LinkedHashMap<Room,Integer> roomIntegerLinkedHashMap);
}
