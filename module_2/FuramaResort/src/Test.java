import java.util.Scanner;

public class Test {
    static String[] typeOfRentList = {"year" ,
            "month" ,
            "day" ,
            "hour"};

    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("asd");
        System.out.println(chooseTypeOfRent());

    }
    public static String chooseTypeOfRent() {
        System.out.println(typeOfRentList.length);
        String result = null;
        boolean flag;
do {
    System.out.println("1. Year\n" +
            "2. Month\n" +
            "3. Day\n" +
            "4. Hour");
    int choose = Integer.parseInt(scanner.nextLine());
    flag=true;
    switch (choose) {
        case 1:
             result=typeOfRentList[0];
            break;

        case 2:
             result=typeOfRentList[1];
            break;

        case 3:
             result=typeOfRentList[2];
            break;

        case 4:
             result=typeOfRentList[3];
            break;

        default:
            flag=false;
    }
}while (!flag);
        return result;
    }
}
