package util.read_and_write;

import model.furama_facility.House;

import java.io.*;
import java.util.LinkedHashMap;
import java.util.Map;

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
                houseIntegerLinkedHashMap.put(new House(strings[0], strings[1], Double.parseDouble(strings[2]),
                        Integer.parseInt(strings[3]), Integer.parseInt(strings[4]), strings[5], strings[6],
                        Integer.parseInt(strings[7])), Integer.parseInt(strings[8]));
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
            for (Map.Entry<House,Integer> h :
                    houseIntegerLinkedHashMap.entrySet()) {
                bufferedWriter.write(h.getKey().getAll()+","+h.getValue());
                bufferedWriter.newLine();
            }
            bufferedWriter.close();
            fileWriter.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
