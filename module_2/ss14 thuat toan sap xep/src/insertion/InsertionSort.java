package insertion;

import java.util.Arrays;
import java.util.Scanner;

public class InsertionSort {
    public static void main(String[] args) {
        boolean flag = true;
        int[] arr = {10, 4, 2, 5, 9, 6, 7};
        do {
            System.out.println("chuoi mac dinh la: \n" +
                    Arrays.toString(arr));
            System.out.println("1. Minh hoa sap xep chen:\n" +
                    "2. Sap xep chen theo thu tu tang dan");
            Scanner sc = new Scanner(System.in);
            int choose = Integer.parseInt(sc.nextLine());
            switch (choose) {
                case 1:
                    insertionSort(arr);
                    break;
                case 2:
                    doInsertionSort(arr);
                    break;
                default:
                    flag = false;
                    break;
            }
        } while (!flag);
    }

    public static void insertionSort(int[] array) {
        int pos, temp;
        for (int i = 1; i < array.length; i++) {
            temp = array[i];
            pos = i;
            while (pos > 0 && temp < array[pos - 1]) {
                array[pos] = array[pos - 1];
                pos--;
                System.out.println(Arrays.toString(array));
            }
            array[pos] = temp;
            System.out.println(Arrays.toString(array));
        }
        System.out.println(Arrays.toString(array));
    }

    public static void doInsertionSort(int[] list) {
        int pos, temp;
        for (int i = 1; i < list.length; i++) {
            temp = list[i];
            pos = i;
            while (pos > 0 && temp < list[pos - 1]) {
                list[pos] = list[pos - 1];
                pos--;
            }
            list[pos] = temp;
        }
        System.out.println(Arrays.toString(list));
    }
}


