import java.util.*;

public class MajorityElement_169 {
    public int majorityElement(int[] nums) {
        Map<Integer, Integer> frequency = new HashMap<>();
        for (int num : nums) {
            frequency.merge(num, 1, Integer::sum);
        }

        List<Integer> set = new ArrayList<>(frequency.values());
        Collections.sort(set);
        int lastElement = set.get(set.size() - 1);

        for (Integer name : frequency.keySet()) {
            if (lastElement == frequency.get(name)) {
                return name;
            }
        }

        return 1;
    }
}
