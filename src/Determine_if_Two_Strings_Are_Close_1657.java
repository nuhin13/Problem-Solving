import java.util.*;

public class Determine_if_Two_Strings_Are_Close_1657 {

    public boolean closeStrings(String word1, String word2) {

        if (word1.length() != word2.length())
            return false;

        Map<Character, Integer> frequency1 = new HashMap<>();
        Map<Character, Integer> frequency2 = new HashMap<>();

        for (int i = 0; i < word1.length(); i++) {
            char wordF1 = word1.charAt(i);
            char wordF2 = word2.charAt(i);
            frequency1.merge(wordF1, 1, Integer::sum);
            frequency2.merge(wordF2, 1, Integer::sum);
        }

        if(!frequency1.keySet().equals(frequency2.keySet())) return false;

        List<Integer> set1 = new ArrayList<>(frequency1.values());
        List<Integer> set2 = new ArrayList<>(frequency2.values());
        Collections.sort(set1);
        Collections.sort(set2);

        return set1.equals (set2);
    }
}
