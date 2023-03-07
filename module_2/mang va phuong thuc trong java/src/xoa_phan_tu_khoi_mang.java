import java.util.Arrays;
import java.util.Scanner;

public class xoa_phan_tu_khoi_mang {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Scanner sci = new Scanner(System.in);
        Scanner scDel = new Scanner(System.in);
        int foundDel;


        System.out.println("nhap do dai mang");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("nhap phan tu thu " + i);
            arr[i] = sci.nextInt();
        }
        System.out.println("mang se la: ");
        System.out.println(Arrays.toString(arr));

        System.out.println("nhap so muon xoa");
        int del = Integer.parseInt(scDel.nextLine());

        for (int i = 0; i < n; i++) {
            if (arr[i] == del) {

                for (int j = i; j < n - 1; j++) {
                    arr[j] = arr[j + 1];
                }
                i--;
                arr[arr.length - 1] = 0;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
