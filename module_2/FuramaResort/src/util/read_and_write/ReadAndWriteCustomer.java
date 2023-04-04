package util.read_and_write;

import model.person.Customer;

import java.io.*;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ReadAndWriteCustomer {
    static final String PATH_CUSTOMER = "D:\\code_Gym\\ok\\module_2\\FuramaResort\\src\\data\\customer.csv";

    public static LinkedList<Customer> read() {
        LinkedList<Customer> customerList = new LinkedList<>();
        File file = new File(PATH_CUSTOMER);
        FileReader fileReader = null;
        BufferedReader bufferedReader = null;

        try {
            fileReader = new FileReader(file);
            bufferedReader = new BufferedReader(fileReader);
            String line = "";
            while ((line = bufferedReader.readLine()) != null) {
                String[] strings = line.split(",");
                customerList.add(new Customer(Integer.parseInt(strings[0]), strings[1], strings[2], strings[3], Integer.parseInt(strings[4]), Integer.parseInt(strings[5]), strings[6], strings[7], strings[8]));
            }
            bufferedReader.close();
            fileReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return customerList;
    }
    public static void write(LinkedList<Customer> customerList, boolean append) {
        File file = new File(PATH_CUSTOMER);
        FileWriter fileWriter = null;
        BufferedWriter bufferedWriter = null;

        try {
            fileWriter = new FileWriter(file);
            bufferedWriter = new BufferedWriter(fileWriter);
            for (Customer c :
                    customerList) {
                bufferedWriter.write(c.getAll());
                bufferedWriter.newLine();
            }
            bufferedWriter.close();
            fileWriter.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
