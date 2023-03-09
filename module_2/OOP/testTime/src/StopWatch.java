import java.time.LocalTime;
import java.util.Scanner;

public class StopWatch {
    long startTime, endTime;

    public StopWatch(long startTime, long endTime) {
        this.startTime = startTime;
        this.endTime = endTime;
    }

    public static long start() {
        return System.currentTimeMillis();
    }

    public static long stop() {
        return System.currentTimeMillis();
    }

    public static long getElapsedTime(long a, long b) {
        return b - a;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(System.currentTimeMillis());
        char strS;
        char strE;
        long a = 0;
        long b = 0;
        do {
            System.out.println("enter s to start");
            strS = sc.next().charAt(0);
            if (strS == 's') {
                a = StopWatch.start();
                System.out.println("start at: " + a);
            } else {
                System.out.println("type again");
            }
        } while (strS != 's');
        do {
            System.out.println("enter e to end");
            strE = sc.next().charAt(0);
            if (strE == 'e') {
                b = StopWatch.stop();
                System.out.println("end at: " + b);
            } else {
                System.out.println("type again");
            }
        } while (strE != 'e');
        System.out.println("Elapsed Time = " + getElapsedTime(a,b) + "ms");
    }
}

