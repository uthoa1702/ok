import java.util.Arrays;
import java.util.Scanner;

public class SumCollum{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double sum = 0;

        System.out.println("nhap do dai mang 1: ");
        int a = sc.nextInt();

        System.out.println("nhap do dai mang 2: ");
        int b = sc.nextInt();

        double[][] arr = new double[a][b];

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

        System.out.println("nhap cot muon tinh tong: ");
        int collumIndex = sc.nextInt();

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (j == collumIndex) {
                    sum = sum + arr[i][j];
                }
            }
        }
        System.out.println(sum);

    }
        }
