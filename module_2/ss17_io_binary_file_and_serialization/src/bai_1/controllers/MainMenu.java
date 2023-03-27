package bai_1.controllers;

import bai_1.services.impl.ProductService;
import bai_1.util.ReadAndWrite;

import java.io.IOException;
import java.util.Scanner;

public class MainMenu {
    static ProductService productService = new ProductService();

    static {
        try {
            ProductService.setProductList(ReadAndWrite.readFileBinary("D:\\code_Gym\\ok\\module_2\\ss17_io_binary_file_and_serialization\\src\\data\\product.dat"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
    public static void displayMenu() throws IOException, ClassNotFoundException {
        Scanner sc = new Scanner(System.in);
        boolean flag = true;
        int choose;
        do {
            System.out.println("-------Product Management Program-----\n" +
                    "1. Display Product list\n" +
                    "2. Add product\n" +
                    "3. Search\n" +
                    "4. Save to file \n" +
                    "5. Exit");
            try {
                 choose = Integer.parseInt(sc.nextLine());
                switch (choose) {
                    case 1:
                        productService.display();
                        break;
                    case 2:
                        productService.add();
                        break;
                    case 3:
                        productService.search();
                        break;
                    case 4:
                        productService.saveToFile("D:\\code_Gym\\ok\\module_2\\ss17_io_binary_file_and_serialization\\src\\data\\product.dat");
                        break;
                    case 5:
                        flag = false;
                        break;
                    default:
                        System.out.println("Try again");
                        break;
                }
            }catch (NumberFormatException e) {
                e.getStackTrace();
            }


        } while (flag);
    }

}
