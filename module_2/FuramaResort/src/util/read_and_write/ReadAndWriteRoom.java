package util.read_and_write;

import model.furama_facility.Room;

import java.io.*;
import java.util.LinkedHashMap;

public class ReadAndWriteRoom {
    static final String PATH_ROOM = "D:\\code_Gym\\ok\\module_2\\FuramaResort\\src\\data\\room.csv";
    public static LinkedHashMap<Room, Integer> read() {
        LinkedHashMap<Room,Integer> roomIntegerLinkedHashMap = new LinkedHashMap<>();
        File file = new File(PATH_ROOM);
        FileReader fileReader = null;
        BufferedReader bufferedReader = null;

        try {
            fileReader = new FileReader(file);
            bufferedReader = new BufferedReader(fileReader);
            String line = null;
            while ((line = bufferedReader.readLine()) != null) {
                String[] strings = line.split(",");
                roomIntegerLinkedHashMap.put(new Room(strings[0],strings[1],Double.parseDouble(strings[2]),
                        Integer.parseInt(strings[3]),Integer.parseInt(strings[4]),strings[5],strings[6]),
                        Integer.parseInt(strings[7]));
            }
            bufferedReader.close();
            fileReader.close();

        }catch (IOException e ) {
            e.printStackTrace();
        }
        return roomIntegerLinkedHashMap;
    }
    public static void write(LinkedHashMap<Room,Integer> roomIntegerLinkedHashMap, boolean append) {
        File file = new File(PATH_ROOM);
        FileWriter fileWriter = null;
        BufferedWriter bufferedWriter = null;

        try {
            fileWriter = new FileWriter(file,append);
            bufferedWriter = new BufferedWriter(fileWriter);
            for (Room r : roomIntegerLinkedHashMap.keySet()) {
                bufferedWriter.write(r.getAll() + "," + roomIntegerLinkedHashMap.get(r));
                bufferedWriter.newLine();
            }
            bufferedWriter.close();
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
