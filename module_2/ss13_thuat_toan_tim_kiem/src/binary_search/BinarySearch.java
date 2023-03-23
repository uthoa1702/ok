package binary_search;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {
    static int[] array = {2, 1, 4, 9, 7, 5};

    public static void main(String[] args) {

        System.out.println("day so mac dinh:");
        System.out.println(Arrays.toString(array));
        System.out.println("day so sau khi sap xep:");
        System.out.println(Arrays.toString(increaseArray(array)));
        System.out.println("____nhap so can tim: ");
        Scanner sc = new Scanner(System.in);
        int searchInput = Integer.parseInt(sc.nextLine());
        System.out.println(binarySearch(array, searchInput));
    }

    public static int[] increaseArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (array[i] < array[j]) {
                    int max = array[i];
                    array[i] = array[j];
                    array[j] = max;
                }
            }
        }
        return array;
    }

    public static int binarySearch(int[] array, int value) {
        int first = 0;
        int last = array.length - 1;
        while (first <= last) {
            int mid = (first + last) / 2;
            if (array[mid] == value) {
                return mid;
            } else if (array[mid] < value) {
                first = mid + 1;
            } else {
                last = mid - 1;
            }
        }
        return -1;
    }
}

