import java.util.HashMap;
import java.util.Map;

public class OptimalPartitionofString_2405 {
    public int partitionString(String s) {
        Map<Character, Integer> map = new HashMap<>();
        int count = 0;

        for (int i = 0; i < s.length(); i++) {
            if(map.containsKey(s.charAt(i))){
                count++;
                map = new HashMap<>();
            }
            map.put(s.charAt(i), 1);
        }

        return count;
    }
}
