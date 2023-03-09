import java.util.Scanner;

public class CountCharInString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String a;
        System.out.println("nhap chuoi: ");
        String str = sc.nextLine();
        System.out.println(str);

        do {
            System.out.println("nhap 1 ky tu: ");
            a = sc.nextLine();
            System.out.println("sai cu phap");
        } while (a.length() > 1);

        System.out.println("ky tu duoc lap lai: " + count(a, str) + " lan");

    }

    public static int count(String a, String str) {
        int count = 0;
        char b = a.charAt(0);
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == b) {
                count++;
            }
        }
        return count;

    }

}
