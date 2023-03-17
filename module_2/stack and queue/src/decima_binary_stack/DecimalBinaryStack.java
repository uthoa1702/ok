package decima_binary_stack;
import java.util.*;
class DecimalBinaryStack
{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Stack<Integer> stack = new Stack<>();
        System.out.println("Enter decimal number: ");
        int num = in.nextInt();
        while (num != 0)
        {
            int d = num % 2;
            stack.push(d);
            num = num / 2;
        }
        System.out.print("\nBinary representation is:");
        while (!(stack.isEmpty()))
        {
            System.out.print(stack.pop());
        }
        System.out.println();
    }
}