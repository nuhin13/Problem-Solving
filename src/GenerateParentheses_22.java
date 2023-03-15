import java.util.ArrayList;
import java.util.List;

public class GenerateParentheses_22 {

    List<String> result = new ArrayList<>();
    int limit;

    public List<String> generateParenthesis(int n) {
        limit = n;
        setCombination("(", 1, 0);
        System.out.println(result);
        return result;
    }

    private void setCombination(String s, int open, int close) {
        if(s.length() == limit*2){
            result.add(s);
            return;
        }

        if (open < limit) {
            setCombination(s + "(", open + 1, close);
        }
        if (close < open) {
            setCombination(s + ")", open, close + 1);
        }
    }
}
