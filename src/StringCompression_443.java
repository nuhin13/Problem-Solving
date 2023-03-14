import java.util.HashMap;
import java.util.Map;

public class StringCompression_443 {
    public int compress(char[] chars) {
        Map<Character, Integer> frequency = new HashMap<>();
        for (Character task : chars) {
            frequency.merge(task, 1, Integer::sum);
        }

        System.out.println(frequency);

        StringBuilder ss = new StringBuilder();
        for (Character name : frequency.keySet()) {
            ss.append(name.toString()).append(frequency.get(name));
        }

        System.out.println(ss);
        return ss.length();
    }
}
