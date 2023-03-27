package bai_1.services.impl;

import bai_1.model.Product;
import bai_1.repo.impl.ProductRepo;
import bai_1.util.ReadAndWrite;
import bai_1.services.IProductService;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProductService implements IProductService {
    String path = "D:\\code_Gym\\ok\\module_2\\ss17_io_binary_file_and_serialization\\src\\data\\product.dat";
    Scanner scanner = new Scanner(System.in);
    ProductRepo productRepo = new ProductRepo();

    static List<Product> productList = new ArrayList<>();

    public static void setProductList(List<Product> productLists) {
        productList = productLists;
    }

    @Override
    public void display() {
        for (Product p : productList) {
            System.out.println(p);
        }
    }

    @Override
    public void add() {
        boolean flag = true;
        int id;
        int count = 0;
        do {
            flag = true;
            System.out.println("Enter id:");
            id = Integer.parseInt(scanner.nextLine());
            for (int i = 0; i < productList.size(); i++) {
                if (productList.get(i).getId() == id) {
                    System.out.println("trung roi");
                    break;
                } else {
                    count++;
                }
                if (count == productList.size()) {
                    System.out.println("Enter name:");
                    String name = scanner.nextLine();
                    System.out.println("Enter price:");
                    float price = Float.parseFloat(scanner.nextLine());
                    System.out.println("Enter type of product:");
                    String type = scanner.nextLine();
                    System.out.println("Enter description:");
                    String des = scanner.nextLine();
                    Product product = new Product(id, name, price, type, des);
                    productList.add(product);
                    ReadAndWrite.writeListProductToFile(path, productList);
                    System.out.println("added");
                    flag = false;
                }
            }
        } while (flag);


    }

    public void saveToFile(String path) {
        ReadAndWrite.writeListProductToFile(path, productList);
    }

    @Override
    public void search() throws IOException, ClassNotFoundException {
        System.out.println("Enter name to search:");
        String name = scanner.nextLine();
        productRepo.search(name);
    }
}
