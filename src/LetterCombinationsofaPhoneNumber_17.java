import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class LetterCombinationsofaPhoneNumber_17 {
    List<String> result = new ArrayList<>();
    String[] map = { "", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz" };
    int digit;

    public List<String> letterCombinations(String digits) {
        if (digits.isEmpty()) return result;
        digit = Integer.parseInt(digits);
        addString("", digit % 10, digit / 10);
        return result;
    }

    public void addString(String builder, int number, int existing) {
        if (number == 0) {
            result.add(new StringBuilder(builder).reverse().toString());
            return;
        }
        String items = map[number];

        for (int i = 0; i < items.length(); i++) {
            String a = builder + items.charAt(i);
            addString(a, existing % 10, existing / 10);
        }
    }
}
