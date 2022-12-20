import java.util.HashMap;
import java.util.Map;

public class ShuffleString_1528 {
    public String restoreString(String s, int[] indices) {

        int maxValue = 0;
        Map<Integer, Character> map = new HashMap<>();
        for (int i = 0; i < indices.length; i++) {
            if (maxValue < indices[i])
                maxValue = indices[i];

            map.put(indices[i], s.charAt(i));
        }

        StringBuilder ss = new StringBuilder();

        for (int i = 0; i <= maxValue; i++) {
            ss.append(map.get(i));
        }
        System.out.println(ss + " " + map);

        return  "";
    }
}
