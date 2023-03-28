package bai_2;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("nhap duong dan muon copy");
        String path = sc.nextLine();
        String arrayList = ReadAndWrite.read(path);
        System.out.println(arrayList);
        System.out.println("nhap file de dan: ");
        String pathTo = sc.nextLine();
        ReadAndWrite.write(pathTo,arrayList);
        System.out.println(arrayList);
        System.out.println("done");
    }
}
