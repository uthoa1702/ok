import java.util.Scanner;

public class FuramaController {
    public static void main(String[] args) {
        displayMainMenu();
    }

    public static void displayMainMenu(){
        System.out.println("choose option:" +
                "\n 1.Employee Management" +
                "\n 2.Customer Management" +
                "\n 3.Facility Management " +
                "\n 4.Booking Management" +
                "\n 5.Promotion Management" +
                "\n 6.Exit");
        Scanner sc = new Scanner(System.in);

        boolean flag = true;
        do {
            System.out.println("Type here:");
            int choose = Integer.parseInt(sc.nextLine());

            switch (choose) {
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 6:
                    flag = false;
                    break;
                default:
                    System.out.println("Please type again");
            }
        }while (flag);
    }
}
