import java.util.Arrays;
import java.util.Scanner;

public class ChenPhanTu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Scanner sci = new Scanner(System.in);
        Scanner scAdd = new Scanner(System.in);
        Scanner scIndexAdd = new Scanner(System.in);


        System.out.println("nhap do dai mang");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("nhap phan tu thu " + i);
            arr[i] = sci.nextInt();
        }
        System.out.println("mang se la: ");
        System.out.println(Arrays.toString(arr));

        System.out.println("nhap so index muon chen`");
        int indexAdd = Integer.parseInt(scIndexAdd.nextLine());

        System.out.println("nhap so muon chen`");
        int add = Integer.parseInt(scAdd.nextLine());


        for (int i = 0; i < arr.length; i++) {
            if (i == indexAdd) {
                for (int j = arr.length - 1; j > i; j--) {
                    arr[j] = arr[j - 1];
                }
                arr[i] = add;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
