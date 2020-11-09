import java.util.Stack;

public class isValid {
    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<Character>();
        for (int i=0;i<s.length();i++){
            if (stack.isEmpty())
                stack.push(s.charAt(i));
            else if (s.charAt(i)=='(' || s.charAt(i)=='[' ||s.charAt(i)=='{')
                stack.push(s.charAt(i));
            else if (stack.peek()=='(' && s.charAt(i)==')' || stack.peek()=='[' && s.charAt(i)==']'||stack.peek()=='{' && s.charAt(i)=='}')
                stack.pop();
            else
                return false;
        }
        return stack.isEmpty();

    }

    public static void main(String[] args) {
        System.out.println(isValid("({[]}"));

    }
}
