import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class JewelsandStones_771 {
    public int numJewelsInStones(String jewels, String stones) {
        Set<Character> set = new HashSet<>();
        for (int i = 0; i < jewels.length(); i++) {
            set.add(jewels.charAt(i));
        }

        int count = 0;

        for (int i = 0; i < stones.length(); i++) {
            if(set.contains(stones.charAt(i))){
                count++;
            }
        }

        return count;
    }
}
