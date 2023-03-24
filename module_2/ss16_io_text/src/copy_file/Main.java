package copy_file;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap duong dan muon copy");
        String path = sc.nextLine();
        ArrayList<String> arrayList = new ArrayList<>();
        try {
            arrayList = ReadAndWrite.readFile(path);
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("nhap file de dan: ");
        String pathTo = sc.nextLine();
        System.out.println("nhap true hoac false de ghi de hoac them vao");
        boolean option = sc.nextBoolean();
        ReadAndWrite.writeFile(arrayList,pathTo,option);
        System.out.println("done");
    }
}
