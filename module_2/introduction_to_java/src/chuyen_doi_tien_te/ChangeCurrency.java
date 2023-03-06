package chuyen_doi_tien_te;

import java.util.Scanner;

public class ChangeCurrency {
    public static void main(String[] args) {
        double vnd = 23000;
        double usd;
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap USD");
        usd = sc.nextDouble();
        double change = usd * vnd;
        System.out.println("= " + change + "VND");

    }
}
