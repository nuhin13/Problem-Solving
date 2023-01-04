import com.sun.org.apache.bcel.internal.generic.SWITCH;

import java.util.List;

public class CountItemsMatchingARule_1773 {

    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {

        int rulePosition = 0, count = 0;
        switch (ruleKey) {
            case "color":
                rulePosition = 1;
            case "name":
                rulePosition = 2;
            default:
                rulePosition = 0;
        }

        for (int i = 0; i < items.size() - 1; i++) {
            if (items.get(i).get(rulePosition).equals(ruleValue)) {
                count++;
            }
        }
        System.out.println(count);
        return count;

    }
}
