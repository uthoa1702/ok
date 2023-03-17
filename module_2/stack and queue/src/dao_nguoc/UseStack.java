package dao_nguoc;

import java.util.Scanner;
import java.util.Stack;

public class UseStack {
    public static void main(String[] args) {
        number();
        string();
    }

    public static void number() {
        Stack<Integer> stack = new Stack<>();
        Stack<Integer> stack1 = new Stack<>();
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            System.out.println("nhap so cho phan tu: ");
            int num = scanner.nextInt();
            stack.push(num);
        }
        System.out.println(stack);
        int size = stack.size();
        for (int i = 0; i < size; i++) {
            stack1.push(stack.pop());
        }
        stack = stack1;
        System.out.println("Máº£ng sá»‘ Ä‘áº£o: " + stack);
    }

    public static void string() {
        Stack<String> stack = new Stack<>();
        Stack<String> stack1 = new Stack<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("nhap chuá»—i kÃ½ tá»±: ");
        String str = scanner.nextLine();

        for (int i = 0; i < str.length(); i++) {
            stack.push(String.valueOf(str.charAt(i)));
        }

        System.out.println(stack);
        int size = stack.size();
        for (int i = 0; i < size; i++) {
            stack1.push(stack.pop());
        }
        stack = stack1;
        System.out.println("Máº£ng kÃ½ tá»± Ä‘áº£o: " + stack);
        String string = "";
        for (String i : stack) {
            string += i;
        }
        System.out.println("chuoi dao nguoc: " + string);
    }

}