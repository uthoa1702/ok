package dao_nguoc_day_so;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        int[] arr = new int[10];
        Scanner scanner = new Scanner(System.in);
        int temp;
        int n = arr.length-1;
        for (int i = 0; i < arr.length / 2; i++) {
            temp = arr[i];
            arr[i] = arr[n];
            arr[n] = temp;
            n--;
        }
        System.out.println(Arrays.toString(arr));
    }
}
