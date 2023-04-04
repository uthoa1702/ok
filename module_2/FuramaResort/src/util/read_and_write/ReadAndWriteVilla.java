package util.read_and_write;

import model.furama_facility.Villa;

import java.io.*;
import java.util.LinkedHashMap;

public class ReadAndWriteVilla {
    static final String PATH_VILLA = "D:\\code_Gym\\ok\\module_2\\FuramaResort\\src\\data\\villa.csv";

    public static LinkedHashMap<Villa, Integer> read() {
        LinkedHashMap<Villa, Integer> villaIntegerLinkedHashMap = new LinkedHashMap<>();
        File file = new File(PATH_VILLA);
        FileReader fileReader = null;
        BufferedReader bufferedReader = null;

        try {
            fileReader = new FileReader(file);
            bufferedReader = new BufferedReader(fileReader);
            String line = null;
            while ((line = bufferedReader.readLine()) != null) {
                String[] strings = line.split(",");
                villaIntegerLinkedHashMap.put(new Villa(strings[0], strings[1], Double.parseDouble(strings[2]),
                        Integer.parseInt(strings[3]), Integer.parseInt(strings[4]), strings[5], strings[6],
                        Double.parseDouble(strings[7]), Integer.parseInt(strings[8])), Integer.parseInt(strings[9]));
            }
            bufferedReader.close();
            fileReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return villaIntegerLinkedHashMap;
    }

    public static void write(LinkedHashMap<Villa, Integer> villaIntegerLinkedHashMap, boolean append) {
        File file = new File(PATH_VILLA);
        FileWriter fileWriter = null;
        BufferedWriter bufferedWriter = null;
        try {
            fileWriter = new FileWriter(file, append);
            bufferedWriter = new BufferedWriter(fileWriter);
            for (Villa v : villaIntegerLinkedHashMap.keySet()) {
                bufferedWriter.write(v.getAll() + "," + villaIntegerLinkedHashMap.get(v));
                bufferedWriter.newLine();
            }
            bufferedWriter.close();
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
