import java.util.Arrays;

public class ReverseWordsInAString_151 {
    public String reverseWords(String s) {
        String[] parts = s.trim().split(" ");
        String result = "";

        System.out.println(Arrays.toString(parts));

        for (int i = parts.length -1 ; i >= 0; i--) {
            if(!parts[i].isEmpty())
                result = result + parts[i] + " ";
        }

        System.out.println(result);
        return result.trim();
    }
}
