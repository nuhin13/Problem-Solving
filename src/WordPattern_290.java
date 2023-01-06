import java.util.HashMap;
import java.util.Map;

public class WordPattern_290 {
    public boolean wordPattern(String pattern, String s) {

        String[] splitString = s.split(" ");
        Map<Character, String> map = new HashMap<>();

        if (pattern.length() != splitString.length)
            return false;

        for (int i = 0; i < pattern.length(); i++) {
            System.out.println(map);
            if (!map.containsKey(pattern.charAt(i)) && !map.containsValue(splitString[i])) {
                map.put(pattern.charAt(i), splitString[i]);
            } else {
                //System.out.println(map.get(pattern.charAt(i)) + splitString[i]);
                if (map.get(pattern.charAt(i)) == null || !map.get(pattern.charAt(i)).equals(splitString[i])) {
                    System.out.println(splitString[i]);
                    return false;
                }
            }
        }

        return true;
    }
}
