package hien_thi_20_so_nguyen_to_dau_tien;

import java.util.Scanner;

public class hien_thi_20_snt_dau_tien {
    public static void main(String[] args) {
        int count = 0;
        int countPrime = 0;

        Scanner sc = new Scanner(System.in);
        System.out.println("nhap so luong so nguyen to");
        int n = Integer.parseInt(sc.nextLine());
        for (int i = 2; i < 10000; i++) {

            if (countPrime < n) {
                for (int j = 1; j <= i; j++) {
                    if (i % j == 0) {
                        count += 1;
                    }
                }
                if (count == 2) {
                    System.out.println(i);
                    countPrime += 1;
                }
                count = 0;
            }
        }
    }
}

