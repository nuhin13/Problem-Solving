import java.util.*;
import java.util.Map.Entry;
import java.util.stream.Collectors;

public class SortCharactersByFrequency_451 {
    public String frequencySort(String s) {

        StringBuilder value= new StringBuilder();

        HashMap<Character, Integer> frequency = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            frequency.merge(s.charAt(i), 1, Integer::sum);
        }

        /*LinkedHashMap<Character, Integer> sortedMap = new LinkedHashMap<>();
        ArrayList<Integer> list = new ArrayList<>();

        for (Map.Entry<Character, Integer> entry : frequency.entrySet()) {
            list.add(entry.getValue());
        }
        Collections.sort(list, Collections.reverseOrder());*/

        List<Character> list1 = new ArrayList<>(frequency.keySet());
        Collections.sort(list1, (a, b) -> (frequency.get(b) - frequency.get(a)));

        for(Character c: list1){
            for(int i=0; i<frequency.get(c); i++){
                value.append(c);
            }
        }

        /*for (int num : list) {
            for (Entry<Character, Integer> entry : frequency.entrySet()) {
                if (entry.getValue().equals(num)) {
                    value.append(entry.getKey());
                }
            }
        }*/

        System.out.println(value.toString());
        return value.toString();
    }
}
