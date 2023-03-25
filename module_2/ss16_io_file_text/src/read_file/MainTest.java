package read_file;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class MainTest {
    static List<String> list = new ArrayList<>();

    public static void main(String[] args) {
        String file = "D:\\code_Gym\\ok\\module_2\\ss16_io_file_text\\src\\read_file\\countries.csv";
        reader(file);

    }

    public static void reader(String file) {
        try {
            File file1 = new File(file);
            FileReader fileReader = new FileReader(file1);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                String[] splitData = line.split(",");



            }
            for (String s : list) {
                System.out.println(s);
            }
            System.out.print("");

        } catch (IOException e) {

        }
    }
}
