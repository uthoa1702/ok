package fibonacci;

import java.util.ArrayList;
import java.util.List;

public class LamLai {
    public static void main(String[] args) {
        System.out.println(isLeapYear(1000));



    }
    public static boolean isLeapYear(int n) {
        if(n%4==0) {
            if (n%100==0){
                if (n%400==0) {
                    return true;
                }
                else {
                    return false;
                }
            }
            return false;
        }
        return false;
    }
//        int a = 0, b = 1;
//        int c;
//        System.out.print(a + " " + b);
//        for (int i = 0; i < 100; i++) {
//            c=a+b;
//            if (c>=220) {
//                break;
//            }
//
//                System.out.print(" " +c);
//
//
//            a=b;
//            b=c;
//        }
//        System.out.println("");
//        System.out.println(isOddNum(-6));
//    }
//    public static boolean isOddNum(int n) {
//        if(n%2==0){
//            return false;
//        }
//        return true;
//        List<Integer> list = new ArrayList<>();
//        list = uocChung(100);
//        System.out.println(list);
//    }
//    public static List<Integer> uocChung( int n){
//        List<Integer> list = new ArrayList<>();
//        for (int i = 1; i <= n; i++) {
//            if (n%i==0) {
//                list.add(i);
//            }
//        }
//        return list;
//    }
}
