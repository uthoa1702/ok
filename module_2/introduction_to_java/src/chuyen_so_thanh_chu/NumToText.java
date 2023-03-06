package chuyen_so_thanh_chu;

import java.util.Scanner;

public class NumToText {
    public static void main(String[] args) {
        int num;
        String a1 = "one";
        String a2 = "two";
        String a3 = "three";
        String a4 = "four";
        String a5 = "five";
        String a6 = "six";
        String a7 = "seven";
        String a8 = "eight";
        String a9 = "nine";
        String a10 = "ten";
        String a11 = "eleven";
        String a12 = "twelve";
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap so de doc ");
        num = Integer.parseInt(sc.nextLine());
        int teen = num - 10;
        int dozens = num / 10;
        int hundred = num / 100;
        int a = num - (hundred * 100) - (num - hundred * 100) / 10;

        if (num == 0) {
            System.out.println("zero");
        } else if (num > 0 && num <= 12) {
            switch (num) {
                case 1:
                    System.out.println(a1);
                    break;
                case 2:
                    System.out.println(a2);
                    break;
                case 3:
                    System.out.println(a3);
                    break;
                case 4:
                    System.out.println(a4);
                    break;
                case 5:
                    System.out.println(a5);
                    break;
                case 6:
                    System.out.println(a6);
                    break;
                case 7:
                    System.out.println(a7);
                    break;
                case 8:
                    System.out.println(a8);
                    break;
                case 9:
                    System.out.println(a9);
                    break;
                case 10:
                    System.out.println(a10);
                    break;
                case 11:
                    System.out.println(a11);
                    break;
                case 12:
                    System.out.println(a12);
                    break;
            }
        } else if (num > 12 && num < 20) {

            switch (num) {
                case 13:
                    System.out.println("thirteen");
                    break;
                case 14:
                    System.out.println(a4 + "teen");
                    break;
                case 15:
                    System.out.println("fifteen");
                    break;
            }
            if (num > 15) {
                System.out.println(lessTen(teen) + "teen");

            }
        } else if (num >= 20 && num < 100) {
            System.out.println(tenOf(dozens) + " " + lessTen(num - (dozens * 10)));
        } else if (num >= 100 && num < 1000) {
            switch (num) {
                case 110:
                    System.out.println(lessTen(hundred) + " hundred " + a10);
                    break;
                case 111:
                    System.out.println(lessTen(hundred) + " hundred " + a11);
                    break;
                case 112:
                    System.out.println(lessTen(hundred) + " hundred " + a12);
                    break;
                case 113:
                    System.out.println(lessTen(hundred) + " hundred " + "thirteen");
                    break;
                case 115:
                    System.out.println(lessTen(hundred) + " hundred " + "fifteen");
                    break;
                case 114:
                    System.out.println(lessTen(hundred) + " hundred " + "fourteen");
                    break;
            }
            if (num < 120 && num > 115) {
                System.out.println(lessTen(hundred) + " hundred " + lessTen(num - hundred * 100 - 10) + "teen");
            } else if (num < 110) {
                System.out.println(lessTen(hundred) + " hundred " + lessTen(num - hundred * 100));
            } else if (num >= 120) {
                System.out.println(lessTen(hundred) + " hundred " + tenOf((num - hundred * 100) / 10) + " " + under10(num - (hundred * 100) - ((num - hundred * 100) / 10) * 10));
            }
        }

    }

    public static String lessTen(int number) {
        String lessTen = "";
        switch (number) {
            case 1:
                lessTen = "one";
                break;
            case 2:
                lessTen = "two";
                break;
            case 3:
                lessTen = "three";
                break;
            case 4:
                lessTen = "four";
                break;
            case 5:
                lessTen = "five";
                break;
            case 6:
                lessTen = "six";
                break;
            case 7:
                lessTen = "seven";
                break;
            case 8:
                lessTen = "eight";
                break;
            case 9:
                lessTen = "nine";
                break;
            default:
        }
        return lessTen;
    }

    public static String tenOf(int number) {
        String tenOf = "";
        switch (number) {
            case 2:
                tenOf = "twenty";
                break;
            case 3:
                tenOf = "thirty";
                break;
            case 4:
                tenOf = "forty";
                break;
            case 5:
                tenOf = "fifty";
                break;
            case 6:
                tenOf = "sixty";
                break;
            case 7:
                tenOf = "seventy";
                break;
            case 8:
                tenOf = "eighty";
                break;
            case 9:
                tenOf = "ninety";
                break;
            default:
        }
        return tenOf;
    }

    public static String under10(int number) {
        String under10 = "";
        switch (number) {
            case 1:
                under10 = "one";
                break;
            case 2:
                under10 = "two";
                break;
            case 3:
                under10 = "three";
                break;
            case 4:
                under10 = "four";
                break;
            case 5:
                under10 = "five";
                break;
            case 6:
                under10 = "six";
                break;
            case 7:
                under10 = "seven";
                break;
            case 8:
                under10 = "eight";
                break;
            case 9:
                under10 = "nine";
                break;
            default:
        }
        return under10;
    }

}
