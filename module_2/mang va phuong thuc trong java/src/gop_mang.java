import java.util.Arrays;
import java.util.Scanner;

public class gop_mang {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("nhap do dai mang 1");
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.println("nhap phan tu thu " + i);
            arr[i] = sc.nextInt();
        }
        System.out.println("mang 1 se la: ");
        System.out.println(Arrays.toString(arr));

        System.out.println("nhap do dai mang 2");
        int n2 = sc.nextInt();
        int[] arr2 = new int[n2];

        for (int i = 0; i < n2; i++) {
            System.out.println("nhap phan tu thu " + i);
            arr2[i] = sc.nextInt();
        }
        System.out.println("mang 2 se la: ");
        System.out.println(Arrays.toString(arr2));

        int[] arr3 = new int[n2 + n];
        for (int i = 0; i < arr.length; i++) {
            arr3[i] = arr[i];
        }
        System.out.println(Arrays.toString(arr3));

        for (int i = 0; i < arr2.length; i++) {
            arr3[arr.length + i] = arr2[i];
        }
        System.out.println("mang 3 se la: ");
        System.out.println(Arrays.toString(arr3));
    }


}

