import java.util.HashSet;
import java.util.Set;

public class StrangePrinter_664 {

    public int strangePrinter(String s) {
        Set<Character> set = new HashSet<>();
        for (int i = 0; i < s.length(); i++) {
            set.add(s.charAt(i));
        }

        return  set.size();
    }

}
