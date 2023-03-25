package read_file;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        BufferedReader br = null;
        String file ="D:\\code_Gym\\ok\\module_2\\ss16_io_file_text\\src\\read_file\\countries.csv";
        try {
            String line=null;
            FileReader fileReader= new FileReader(file);
            br = new BufferedReader(fileReader);
            while ((line = br.readLine()) != null) {
                printCountry(parseCsvLine(line));
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (br != null) {
                    br.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap id");
        String id = sc.nextLine();
        System.out.println("nhap code");
        String code = sc.nextLine();
        System.out.println("nhap nation");
        String nation = sc.nextLine();

        writeCountry(file, String.valueOf(new Country(id,code,nation)),true);

    }

    public static List<String> parseCsvLine(String csvLine) {
        List<String> result = new ArrayList<>();
        if (csvLine != null) {
            String[] splitData = csvLine.split(",");
            for (int i = 0; i < splitData.length; i++) {
                result.add(splitData[i]);
            }
        }

        return result;
    }
    static   List<Country> list = new ArrayList<>();
    public static void printCountry(List<String> country) {
        System.out.println(country);
            list.add(new Country((country.get(0)),country.get(1), country.get(2)));
        for (Country c : list) {
            System.out.println(c);
        }
    }
    public static void writeCountry(String pathFile, String text, boolean append) {
        File file = new File(pathFile);
        FileWriter fileWriter = null;
        BufferedWriter bufferedWriter = null;
        try {

            fileWriter = new FileWriter(file,append);
            bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write(text);
            bufferedWriter.newLine();

        }catch (IOException e){
            e.printStackTrace();
        }
        finally {
            try {
                bufferedWriter.close();
                fileWriter.close();
            }catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
