import java.util.Stack;

public class ValidateStackSequences_946 {
    public boolean validateStackSequences(int[] pushed, int[] popped) {
        Stack<Integer> store = new Stack<>();
        int position = 0;

        for (int i = 0; i < pushed.length; i++) {
            store.push(pushed[i]);

            while ((position < popped.length) && !store.isEmpty() && popped[position] == store.peek()){
                store.pop();
                position++;
            }
        }

        return store.isEmpty();
    }
}
