package repository.impl;

import model.furama_facility.Room;
import repository.IRoomRepository;
import util.read_and_write.ReadAndWriteRoom;

import java.util.LinkedHashMap;

public class RoomRepository implements IRoomRepository {
    @Override
    public void display() {
        LinkedHashMap<Room,Integer> roomIntegerLinkedHashMap = ReadAndWriteRoom.read();
        for (Room r : roomIntegerLinkedHashMap.keySet()) {
            System.out.println(r.getAll() + "," + roomIntegerLinkedHashMap.get(r));
        }
    }

    @Override
    public void add(LinkedHashMap<Room, Integer> roomIntegerLinkedHashMap) {
        ReadAndWriteRoom.write(roomIntegerLinkedHashMap, false);

    }
}
