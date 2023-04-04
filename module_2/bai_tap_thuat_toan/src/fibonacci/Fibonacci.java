package fibonacci;

public class Fibonacci {
    public static void main(String[] args) {
        int a = 0, b = 1, c;
        System.out.print(a + " " + b);
        for (int i = 3; i <= 100; i++) {
            c = a + b;
            if (c >= 100)
                break;
            System.out.print(" " + c);
            a = b;
            b = c;
        }
    }
}
