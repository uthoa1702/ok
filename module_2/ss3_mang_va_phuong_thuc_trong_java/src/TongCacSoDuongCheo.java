import java.util.Scanner;

public class TongCacSoDuongCheo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("nhap do canh hinh vuong: ");
        int h = sc.nextInt();

        double[][] arr = new double[h][h];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.println("nhap phan tu thu " + i + "-" + j);
               arr[i][j] = sc.nextDouble();
            }
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println("");
        }
        sum(arr);

    }
    public static void sum(double[][] arr) {
        double sum = 0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (i == j) {
                    sum = sum + arr[i][j];
                }
            }
        }
        System.out.println("tong cua duong cheo se la: " + sum);
    }
}
