package tinh_tong_snt;

public class TinhTongSNT {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            if (isPrime(arr[i])){
                System.out.println(arr[i]);
                sum= sum +arr[i];

            }
        }
        System.out.println("tong so nguyen to trong mang la : "+sum);

    }

    public static boolean isPrime(int n) {
        if (n < 2) {
            return false;
        }
        for (int i = 2; i <= n/2 ; i++) {
            if (n%i == 0) {
                return false;
            }

        }
        return true;
    }
}
