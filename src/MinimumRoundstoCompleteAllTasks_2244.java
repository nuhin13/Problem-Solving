import java.util.HashMap;
import java.util.Map;

public class MinimumRoundstoCompleteAllTasks_2244 {
    public int minimumRounds(int[] tasks) {

        int count = 0;
        Map<String, Integer> frequency = new HashMap<>();
        for (int task : tasks) {
            frequency.merge(String.valueOf(task), 1, Integer::sum);
        }

        if(frequency.containsValue(1))
            return -1;

        for (Integer i : frequency.values()) {
            if (i % 3 == 0) {
                count = count + i / 3;
            } else {
                count = count + i / 3 + 1;
            }
        }

        System.out.println(frequency);
        System.out.println(count);

        return 1;
    }
}
