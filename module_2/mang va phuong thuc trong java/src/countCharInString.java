import java.util.Scanner;

public class countCharInString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.println("nhap chuoi: ");
        String str = sc.nextLine();
        System.out.println(str);
        System.out.println("nhap ky tu: ");
        char a = sc.next().charAt(0);
        System.out.println("ky tu duoc lap lai: " + count(a,str) + " lan");

    }

    public static int count(char a, String str) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == a) {
                count++;
            }
        }
        return count;

    }

}
