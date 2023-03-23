import java.util.Arrays;
import java.util.Scanner;

public class TimMax {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        System.out.println("nhap do dai mang 1");
        int a = sc.nextInt();
        System.out.println("nhap do dai mang 2");
        int b = sc.nextInt();
        int[][] arr = new int[a][b];
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                System.out.println("nhap phan tu " + i + "-" + j);
                arr[i][j] = sc.nextInt();
            }
        }
        int max = arr[0][0];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] > max) {
                    max = arr[i][j];
                }
                System.out.print(arr[i][j] + " ");
            }
            System.out.println("");
        }
        System.out.println("max = " + max);
    }

}
