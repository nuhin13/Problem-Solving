import java.util.*;

public class UniqueNumberOfOccurrences_1207 {
    public boolean uniqueOccurrences(int[] arr) {

        // Frequency matrix in hashmap
        Map<Integer, Integer> frequency = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            frequency.merge(arr[i], 1, Integer::sum);
        }

        System.out.println(frequency);

        List<Integer> set = new ArrayList<>(frequency.values());
        Collections.sort(set);

        System.out.println(set);

        for (int i = 1; i < set.size(); i++) {
            if(set.get(i).equals(set.get(i - 1))){
                return false;
            }
        }

        /*for (Map.Entry<Integer, Integer> set1 : frequency.entrySet()) {
            if (set1.getValue() != 1) {
                return true;
            }
        }*/
        return true;
    }
}
