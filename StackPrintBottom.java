import java.util.*;

// Method to print the fifth element from the bottom of the stack

public class StackPrintBottom {
    public static void main(String args[]) {
        Stack<Integer> stack = new Stack<>();
        System.out.println("Enter total number of element ");
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        while (n-- > 0)
            stack.push(s.nextInt());
        int stackSize = stack.size();
        printFifthElementFromStart(stack, stackSize);
    }

    // considering bottom most element of the stack as 0
    static void printFifthElementFromStart(Stack<Integer> stack, int stackSize) {
        // Write your code here
        System.out.println("stack current"+stack);
        if(stackSize < 5){
            System.out.println("There are not enough elements in the stack");
        }
        else{
            if(stackSize == 5){
                System.out.println(stack.peek());
            }
            else{
                stack.pop();
                printFifthElementFromStart(stack, stack.size());
            }
        }
    }
}

