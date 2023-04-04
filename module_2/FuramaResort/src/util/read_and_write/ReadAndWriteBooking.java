package util.read_and_write;

import model.booking.Booking;

import java.io.*;
import java.util.TreeSet;

public class ReadAndWriteBooking {
    static final String PATH_BOOKING = "D:\\code_Gym\\ok\\module_2\\FuramaResort\\src\\data\\booking.csv";

    public static TreeSet<Booking> read() {
        TreeSet<Booking> bookingTreeSet = new TreeSet<>();
        File file = new File(PATH_BOOKING);
        FileReader fileReader = null;
        BufferedReader bufferedReader = null;

        try {
            fileReader = new FileReader(file);
            bufferedReader = new BufferedReader(fileReader);
            String line = null;
            while ((line = bufferedReader.readLine()) != null) {
                String[] strings = line.split(",");
                bookingTreeSet.add(new Booking(Integer.parseInt(strings[0]),strings[0],
                        strings[0], Integer.parseInt(strings[0]), strings[0], strings[0]));
            }
            bufferedReader.close();
            fileReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return bookingTreeSet;
    }
    public static void write(Booking booking, boolean append) {
        File file = new File(PATH_BOOKING);
        FileWriter fileWriter = null;
        BufferedWriter bufferedWriter = null;

        try {
            fileWriter = new FileWriter(file, append);
            bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write(booking.getAll());
        }catch (IOException e) {
            e.printStackTrace();
        }
    }
}
