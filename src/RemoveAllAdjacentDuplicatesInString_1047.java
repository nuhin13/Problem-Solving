import java.util.Arrays;
import java.util.Stack;

public class RemoveAllAdjacentDuplicatesInString_1047 {
    public String removeDuplicates(String s) {
        Stack<Character> stack = new Stack<Character>();

        char[] ch = s.toCharArray();

        for (int i = 0; i < ch.length; i++) {
            if (stack.isEmpty()) {
                stack.push(ch[i]);
            } else if (stack.peek() != ch[i]) {
                stack.push(ch[i]);
            } else {
                stack.pop();
            }
        }

        System.out.println(stack);

        String result = "";
        while (!stack.isEmpty()) {
            result = stack.pop() + result;
        }

        System.out.println(result);

        return result.toString();
    }
}
