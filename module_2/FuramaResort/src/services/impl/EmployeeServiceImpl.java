package services.impl;

import model.person.Employee;
import services.IEmployeeService;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeeServiceImpl implements IEmployeeService {

    static ArrayList<Employee> arrayListEmployee = new ArrayList<>();
    static List<String> stringListGender = new ArrayList<>();
    static List<String> stringListLevel = new ArrayList<>();
    static List<String> stringListPosition = new ArrayList<>();


    static {
        stringListGender.add("Male");
        stringListGender.add("Female");
        stringListGender.add("Other");
    }

    static {
        stringListLevel.add("Intermediate");
        stringListLevel.add("College");
        stringListLevel.add("University");
        stringListLevel.add("Postgraduate");
    }

    static {
        stringListPosition.add("Receptionist");
        stringListPosition.add("Waiter/Waitress");
        stringListPosition.add("Staff");
        stringListPosition.add("Supervisor");
        stringListPosition.add("Manager");
        stringListPosition.add("Director");
    }

    static Scanner scanner = new Scanner(System.in);

    @Override
    public void display() {
        for (Employee e : arrayListEmployee) {
            System.out.println(e);
        }
    }

    @Override
    public void add() {
        String name, birthDay, gender, ability, position, mail;
        int id, phone, salary;
        System.out.println("Enter employee ID: ");
        int idEmployee = Integer.parseInt(scanner.nextLine());
        int count = 0;
        for (int i = 0; i < arrayListEmployee.size(); i++) {
            if (arrayListEmployee.get(i).getIdFurama() != idEmployee) {
                count++;
            }
        }
        if (count == arrayListEmployee.size()) {
            System.out.println("Enter employee name: ");
            name = scanner.nextLine();
            System.out.println("Enter birth day:");
            birthDay = scanner.nextLine();
            System.out.println("Enter ID: ");
            id = Integer.parseInt(scanner.nextLine());
            gender = chooseGender();
            ability = chooseLevel();
            position = choosePosition();
            System.out.println("Enter phone number:");
            phone = Integer.parseInt(scanner.nextLine());
            System.out.println("Enter email:");
            mail = scanner.nextLine();
            System.out.println("Enter salary:");
            salary = Integer.parseInt(scanner.nextLine());
            arrayListEmployee.add(new Employee(idEmployee, name, birthDay, gender, id, phone, mail, ability, position, salary));
            System.out.println("Added");
        } else {
            System.out.println("ID exists");
        }
    }

    @Override
    public void edit() {
        String name, birthDay, gender, ability, position, mail;
        int id, phone, salary;
        int count = 0;
        System.out.println("Enter employee ID to edit: ");
        int idEmployee = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < arrayListEmployee.size(); i++) {
            if (arrayListEmployee.get(i).getIdFurama() == idEmployee) {
                System.out.println("Enter employee name: ");
                name = scanner.nextLine();
                arrayListEmployee.get(i).setName(name);
                System.out.println("Enter birth day:");
                birthDay = scanner.nextLine();
                arrayListEmployee.get(i).setBirthday(birthDay);
                System.out.println("Enter ID: ");
                id = Integer.parseInt(scanner.nextLine());
                arrayListEmployee.get(i).setId(id);
                gender = chooseGender();
                arrayListEmployee.get(i).setGender(gender);
                ability = chooseLevel();
                arrayListEmployee.get(i).setAbility(ability);
                position = choosePosition();
                arrayListEmployee.get(i).setPosition(position);
                System.out.println("Enter phone number:");
                phone = Integer.parseInt(scanner.nextLine());
                arrayListEmployee.get(i).setPhoneNum(phone);
                System.out.println("Enter email:");
                mail = scanner.nextLine();
                arrayListEmployee.get(i).setEmail(mail);
                System.out.println("Enter salary:");
                salary = Integer.parseInt(scanner.nextLine());
                arrayListEmployee.get(i).setSalary(salary);
                System.out.println("Changed");
                break;
            } else {
                count++;
            }
        }
        if (count == arrayListEmployee.size()) {
            System.out.println("ID not found");
        }
    }

    public static String chooseGender() {
        boolean flag;
        int choose;
        do {
            flag = true;
            System.out.println("Choose gender: \n" +
                    "1. Male \n" +
                    "2. Female \n" +
                    "3. Other");
            choose = Integer.parseInt(scanner.nextLine());

            if (choose > 3 || choose < 1) {
                System.out.println("Choose again");
                flag = false;
            }
        } while (!flag);
        return stringListGender.get(choose - 1);
    }

    public static String chooseLevel() {
        boolean flag;
        int choose;
        do {
            flag = true;
            System.out.println("Choose Level of education: \n" +
                    "1. Intermediate \n" +
                    "2. College \n" +
                    "3. University\n" +
                    "4. Postgraduate");
            choose = Integer.parseInt(scanner.nextLine());

            if (choose > 4 || choose < 1) {
                System.out.println("Choose again");
                flag = false;
            }
        } while (!flag);
        return stringListLevel.get(choose - 1);
    }

    public static String choosePosition() {
        boolean flag;
        int choose;
        do {
            flag = true;
            System.out.println("Choose position: \n" +
                    "1. Receptionist \n" +
                    "2. Waiter/Waitress \n" +
                    "3. Staff\n" +
                    "4. Supervisor\n" +
                    "5. Manager\n" +
                    "6. Director");
            choose = Integer.parseInt(scanner.nextLine());

            if (choose > 6 || choose < 1) {
                System.out.println("Choose again");
                flag = false;
            }
        } while (!flag);
        return stringListPosition.get(choose - 1);
    }
}
