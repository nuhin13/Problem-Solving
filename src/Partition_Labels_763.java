import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Partition_Labels_763 {
    public List<Integer> partitionLabels(String s) {
        List<Integer> result = new ArrayList<>();
        HashMap<Character, Integer> lastItem = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            lastItem.put(s.charAt(i), i);
        }

        int size = 0, end = 0;

        for (int i = 0; i < s.length(); i++) {
            end = Math.max(end, lastItem.get(s.charAt(i)));
            size++;
            if(end == i){
                result.add(size);
                size = 0;
            }
        }

        return result;
    }
}
