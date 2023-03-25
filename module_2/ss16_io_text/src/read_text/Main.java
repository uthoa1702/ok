package read_text;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Main {
    static ArrayList<Country> arrayList = new ArrayList<>();
    static String pathCountry = "D:\\quoc hoa\\codegym\\module 2\\untitled\\ss16 OI text\\src\\read_text\\country.csv";

    public static void main(String[] args) {
        readFile();
    }

    public static void readFile() {
        try {
            File file = new File(pathCountry);
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line = null;
            Country country = null;
            while ((line = bufferedReader.readLine()) != null) {
                String[] strings = line.split(",");
                country = new Country(Integer.parseInt(strings[0]), strings[1], strings[2]);
                arrayList.add(country);
            }
        } catch (IOException | NumberFormatException e) {
            e.printStackTrace();
        }
        for (Country c : arrayList) {
            System.out.println(c.getAll());
        }
    }
}
