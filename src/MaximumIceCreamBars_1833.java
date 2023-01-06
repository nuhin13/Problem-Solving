import java.util.Arrays;

public class MaximumIceCreamBars_1833 {
    public int maxIceCream(int[] costs, int coins) {
        int count = 0;
        Arrays.sort(costs);

        for (int cost : costs) {
            if (cost <= coins) {
                count++;
                coins = coins - cost;
            } else break;
        }

        System.out.println(count);

        return count;
    }
}
