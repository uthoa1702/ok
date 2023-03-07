package hien_thi_so_nguyen_to_nho_hon_100;

public class snt_nho_hon_100 {
    public static void main(String[] args) {
        int count = 0;

        for (int i = 2; i < 100; i++) {
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    count += 1;
                }
            }
            if (count == 2) {
                System.out.println(i);
            }
            count = 0;
        }
    }
}
