import java.util.Stack;
import java.util.Scanner;
public class ReverseString {
    // Reverse a string using a stack.

    public static void main(String arg[]) {
        System.out.println("Enter the String to reverse:");
        Scanner in = new Scanner(System.in);
        String data = in.nextLine();
        //write your code here
        //call reverse method
        reverse(data);
    }
    public static void reverse(String data){
        Stack<Character> stack = new Stack<>();
        int n = data.length();
        //looping through total length of the string and pushing each letter of the string to stack
        for (int i = 0; i < n; i++)
            stack.push(data.charAt(i));
        //declaring new array to store reversed string
        char[] strArr = new char[n];
        //now we will pop each character from stack from the top and add in the predefined array
        for (int j = 0; j < n; j++)
        {
            char letter = stack.pop();
            strArr[j]= letter;
        }
        String reverseString = new String(strArr);
        System.out.println(reverseString);

    }
}
