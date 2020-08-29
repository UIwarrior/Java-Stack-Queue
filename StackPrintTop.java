import java.util.*;

// Method to print the fifth element from the top of the stack by using pop method
//44, 11, 45, 77, 322, 131, 655, 454, 12, 57
public class StackPrintTop {
    public static void main(String args[]) {
        Stack<Integer> stack = new Stack<>();
        System.out.println("Enter total number of element of the stack ");
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        while (n-- > 0)
            stack.push(s.nextInt());
        printFifthElementFromEnd(stack);
    }

    //considering top element of the stack as 0th index
    static int index = 0;
    static void printFifthElementFromEnd(Stack<Integer> stack) {
        System.out.println("stack current"+stack);
        if(stack.size() < 5){
            System.out.println("There are not enough elements in the stack");
        }
        else{
            if(index == 4){
                System.out.println(stack.peek());
            }
            else{
                stack.pop();
                index++;
                printFifthElementFromEnd(stack);

            }
        }
    }
}