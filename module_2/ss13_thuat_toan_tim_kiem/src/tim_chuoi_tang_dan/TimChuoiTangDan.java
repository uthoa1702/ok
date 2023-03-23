package tim_chuoi_tang_dan;
import java.util.Scanner;

public class TimChuoiTangDan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap chuoi bat ki: ");
        String str = sc.nextLine();
        char[] chars = str.toCharArray();
        char s = chars[0];
        for (int i = 0; i < str.length(); i++) {
            if (s <= chars[i]) {
                s = chars[i];
                System.out.print(s);
            }
        }
    }
}