import java.util.*;
public class ParenthesisMatching {

    public static void main(String[] args) {
        try {
            System.out.println(match("))(("));
            System.out.println(match("((((((()))))))"));
            System.out.println(match("(((((()))))))"));
            System.out.println(match("(((((()))))))"));
            System.out.println(match("(((()(((()))))))"));
        } catch (Exception e) {
            // catch the exception thrown by the method match() in try block;
            // e.getMessage() will get the exception message
            System.out.println(e.getMessage());
        }
    }

    public static boolean match(String parens) throws Exception {
        int count = 0;
        //converting string to an array
        char[] chars = parens.toCharArray();
        System.out.println("Char array"+Arrays.toString(chars));
        // looping now
        for (char c : chars) {
            //if starting parenthesis found , count is increased , for equal matching parenthesis count has to be zero
            if (c == '(') {
                count++;
            }
            // if closing parenthesis found
            else if (c == ')') {
                // if count is greater than zero we decrease the count;
                if (count > 0) {
                    count--;
                }
                // else we assume that it is not matching because we encounter closing first then it is not a balanced one
                else {
                    return false;
                }
            } else {
                throw new Exception("Invalid character " + c);
            }
        }
        if (count == 0) {
            return true;
        } else {
            return false;
        }
    }

}
