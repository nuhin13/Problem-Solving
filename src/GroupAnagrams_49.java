import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GroupAnagrams_49 {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<String> items;
        List<List<String>> result = new ArrayList<>();

        int[] value = new int[strs.length];
        for (int i = 0; i < strs.length; i++) {
            value[i] = strs[i].chars().sum();
        }

        for (int i = 0; i < value.length; i++) {
            items = new ArrayList<>();
            for (int j = i; j < value.length; j++) {

                //System.out.println(i + " " + j +" " + value[i] +" "+ value[j]);
                if (i != j && value[i] == value[j]) {
                    items.add(strs[j]);
                    value[j] = j;
                }
            }
            if(value[i] > 96){
                items.add(strs[i]);
                result.add(items);
            }
        }
        return null;
    }
}
