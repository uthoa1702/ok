package practice_using_arrayList_linkedList_in_java_collection_framework.controller;

import practice_using_arrayList_linkedList_in_java_collection_framework.service.ProductFuntions;

import java.util.Scanner;


public class Menu {
    static Scanner sc = new Scanner(System.in);
    static ProductFuntions productFuntions = new ProductFuntions();
    static boolean flag = true;
    static boolean isFlag = true;

    public static void displayMenu() {

        do {

            System.out.println("Product Management Program\n" +
                    "Choose to continues:\n" +
                    "1. Add\n" +
                    "2. Edit\n" +
                    "3. Delete\n" +
                    "4. Search\n" +
                    "5. Display\n" +
                    "6. Exit\n" +
                    "Type below to choose:");
            int choose = Integer.parseInt(sc.nextLine());
            switch (choose) {
                case 1:
                    productFuntions.addProduct();
                    break;
                case 2:
                    productFuntions.editProduct();
                    break;
                case 3:
                    productFuntions.deleteProduct();
                    break;
                case 4:
                    productFuntions.searchProduct();
                    break;
                case 5:
                    do {
                        System.out.println("1. Decrease Price\n" +
                                "2. Increase Price");
                        int chooses = Integer.parseInt(sc.nextLine());
                        switch (chooses) {
                            case 1:
                                productFuntions.displayProductListWithDecreasePrice();
                                break;
                            case 2:
                                productFuntions.displayProductListWithIncreasePrice();
                                break;
                            default:
                                System.out.println("Choose again");
                                isFlag = false;
                                break;
                        }
                    } while (!isFlag);
                    break;
                case 6:
                    break;
                default:
                    System.out.println("Please type again");
                    flag = false;
                    break;
            }
        } while (!flag);
    }
}