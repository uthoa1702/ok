package copy_file;

import java.io.*;
import java.util.ArrayList;


public class ReadAndWrite {
    public static ArrayList<String> readFile(String path) throws IOException {
        ArrayList<String> arrayList = new ArrayList<>();

        File file = new File(path);
        if (!file.exists()) {
            throw new FileNotFoundException("tep tin ko ton tai");
        }
        FileReader fileReader = new FileReader(file);
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        String line = null;
        while ((line = bufferedReader.readLine()) != null) {
            arrayList.add(line);
        }
        for (String a : arrayList) {
            System.out.println(a);
        }
        bufferedReader.close();
        fileReader.close();
        int count = 0;
        for (int i = 0; i < arrayList.size(); i++) {
            String[] strings = arrayList.get(i).split("");
            for (int j = 0; j < arrayList.size(); j++) {
                if (!strings[j].equals(" ")) {
                    count++;
                }
            }
        }
        System.out.println("tong so ki tu trong file: " + count);
        return arrayList;
    }

    public static void writeFile(ArrayList<String> arrayList, String path, boolean append) {
        try {
            File file = new File(path);
            if (file.exists()) {
                System.out.println("file da ton tai.");
            }
            FileWriter fileWriter = new FileWriter(file, append);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            for (int i = 0; i < arrayList.size(); i++) {
                bufferedWriter.write(arrayList.get(i));
                bufferedWriter.newLine();
            }
            bufferedWriter.close();
            fileWriter.close();

        } catch (IOException | NumberFormatException exception) {
            exception.getStackTrace();
        }

    }
}
