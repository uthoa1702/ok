package bai_2;

import java.io.IOException;
import java.util.ArrayList;

import java.util.List;
import java.util.Scanner;

public class Main {
    static final String SOURCE_PATH = "D:\\code_Gym\\ok\\module_2\\ss17_io_binary_file_and_serialization\\src\\bai_2\\origin.dat";
    static final String TARGET_PATH = "D:\\code_Gym\\ok\\module_2\\ss17_io_binary_file_and_serialization\\src\\bai_2\\target.dat";
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("nhap duong dan muon copy");
//        String path = sc.nextLine();
        String arrayList = ReadAndWrite.read(TARGET_PATH);
        System.out.println("nhap file de dan: ");
        for (int i = 0; i < arrayList.length(); i++) {
            System.out.println(arrayList.charAt(i));
        }
//        String pathTo = sc.nextLine();
//        ReadAndWrite.write(TARGET_PATH,arrayList);
//        System.out.println("done");
//
//        arrayList = ReadAndWrite.read(TARGET_PATH);
//        for (String e :
//                arrayList) {
//            System.out.println(e);
//        }
    }
}
