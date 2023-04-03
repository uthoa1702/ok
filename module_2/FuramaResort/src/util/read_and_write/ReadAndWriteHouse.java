package util.read_and_write;

import model.furama_facility.House;

import java.io.*;
import java.util.LinkedHashMap;

public class ReadAndWriteHouse {
    static final String PATH_HOUSE = "D:\\code_Gym\\ok\\module_2\\FuramaResort\\src\\data\\house.csv";

    public static LinkedHashMap<House, Integer> read() {
        LinkedHashMap<House, Integer> houseIntegerLinkedHashMap = new LinkedHashMap<>();
        File file = new File(PATH_HOUSE);
        FileReader fileReader = null;
        BufferedReader bufferedReader = null;

        try {
            fileReader = new FileReader(file);
            bufferedReader = new BufferedReader(fileReader);
            String line = "";
            while ((line = bufferedReader.readLine()) != null) {
                String[] strings = line.split(",");
                houseIntegerLinkedHashMap.put(new House(strings[0], strings[1], Integer.parseInt(strings[2]), Integer.parseInt(strings[0]), Integer.parseInt(strings[0]), strings[0], strings[0], Integer.parseInt(strings[0])), Integer.parseInt(strings[0]));
            }
            bufferedReader.close();
            fileReader.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
        return houseIntegerLinkedHashMap;
    }

    public static void write(LinkedHashMap<House, Integer> houseIntegerLinkedHashMap, boolean append) {
        File file = new File(PATH_HOUSE);
        FileWriter fileWriter = null;
        BufferedWriter bufferedWriter = null;
        try {
            fileWriter = new FileWriter(file);
            bufferedWriter = new BufferedWriter(fileWriter);
            String line = "";
            for (House h :
                    houseIntegerLinkedHashMap.keySet()) {
                bufferedWriter.write(h.getAll() + houseIntegerLinkedHashMap.get(h));
                bufferedWriter.newLine();
            }
            bufferedWriter.close();
            fileWriter.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
