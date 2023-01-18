import java.util.HashMap;
import java.util.Map;

public class FirstUniqueCharacterInAString_387 {
    public int firstUniqChar(String s) {

        Map<Character, Integer> frequency = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            frequency.merge(s.charAt(i), 1, Integer::sum);
        }

        System.out.println(frequency);

        for (int i = 0; i < s.length(); i++) {
            if(frequency.get(s.charAt(i)) == 1){
                return i;
            }
        }

        return -1;
    }
}
