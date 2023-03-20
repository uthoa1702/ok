package practice_using_arrayList_linkedList_in_java_collection_framework.service;

import practice_using_arrayList_linkedList_in_java_collection_framework.controller.Menu;
import practice_using_arrayList_linkedList_in_java_collection_framework.model.Product;

import java.util.*;

public class ProductFuntions {
    static Scanner sc = new Scanner(System.in);
    static Product product = new Product();
    static ArrayList<Product> arrayListProducts = new ArrayList<>();
    static boolean flag = true;

    static {
        arrayListProducts.add(new Product(1, "iphone14", "mobile", 100));
        arrayListProducts.add(new Product(3, "iphone13", "mobile", 95));
        arrayListProducts.add(new Product(2, "iphone12", "mobile", 90));
    }


    public void addProduct() {
        int id;
        do {
            System.out.println("Enter ID of product: ");
            id = Integer.parseInt(sc.nextLine());
            for (int i = 0; i < arrayListProducts.size(); i++) {
                if (arrayListProducts.get(i).getId() == id) {
                    flag = false;
                    break;
                }
                else {
                   flag=true;
                    product.setId(id);
                }
            }
        } while (!flag);

        System.out.println("Enter name of product: ");
        String name = sc.nextLine();
        product.setName(name);
        System.out.println("Enter type of product: ");
        String type = sc.nextLine();
        product.setTypeOfProduct(type);
        System.out.println("Enter price: ");
        int price = Integer.parseInt(sc.nextLine());
        product.setPrice(price);
        arrayListProducts.add(new Product(id, name, type, price));
        System.out.println("Product is added to the list");
        Menu.displayMenu();
    }

    public void deleteProduct() {
        do {
            System.out.println("Enter ID of product which you want to delete: ");
            int id = Integer.parseInt(sc.nextLine());
            for (int i = 0; i < arrayListProducts.size(); i++) {
                if (arrayListProducts.get(i).getId() == id) {
                    System.out.println(arrayListProducts.get(i).getName() + " is deleted");
                    arrayListProducts.remove(i);
                    Menu.displayMenu();
                } else {
                    flag = false;
                }
            }
            System.out.println("Product is not found");
        } while (!flag);
    }

    public void editProduct() {
        do {
            System.out.println("Enter ID of product which you want to edit: ");
            int id = Integer.parseInt(sc.nextLine());
            for (int i = 0; i < arrayListProducts.size(); i++) {
                if (arrayListProducts.get(i).getId() == id) {
                    System.out.println("Enter ID of product: ");
                    int editId = Integer.parseInt(sc.nextLine());
                    arrayListProducts.get(i).setId(editId);
                    System.out.println("Enter name of product: ");
                    String name = sc.nextLine();
                    arrayListProducts.get(i).setName(name);
                    System.out.println("Enter type of product: ");
                    String type = sc.nextLine();
                    arrayListProducts.get(i).setTypeOfProduct(type);
                    System.out.println("Enter price: ");
                    int price = Integer.parseInt(sc.nextLine());
                    arrayListProducts.get(i).setPrice(price);
                    System.out.println("Edited");
                    Menu.displayMenu();
                } else {
                    flag = false;
                }
            }
            System.out.println("Product is not found, try again.");
        } while (!flag);

    }

    public void displayProductListWithDecreasePrice() {
        arrayListProducts.sort((o1, o2) -> (int) (o2.getPrice() - o1.getPrice()));
        for (Product p : arrayListProducts) {
            System.out.println(p);
        }
        Menu.displayMenu();

    }

    public void displayProductListWithIncreasePrice() {
        arrayListProducts.sort((o1, o2) -> (int) (o1.getPrice() - o2.getPrice()));
        for (Product p : arrayListProducts) {
            System.out.println(p);
        }
        Menu.displayMenu();

    }

    public void searchProduct() {
        do {
            System.out.println("Enter name of product to search: ");
            String searchName = sc.nextLine();
            for (int i = 0; i < arrayListProducts.size(); i++) {
                if (Objects.equals(arrayListProducts.get(i).getName(), searchName)) {
                    System.out.println(arrayListProducts.get(i));
                    Menu.displayMenu();
                } else {
                    flag = false;
                }
            }
            System.out.println("Product is not found, try again.");
        } while (!flag);
    }
}













