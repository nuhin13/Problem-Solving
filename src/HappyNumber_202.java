import java.util.HashMap;

public class HappyNumber_202 {
    public boolean isHappy(int n) {

        HashMap<Integer, Integer> memorising = new HashMap<>();
        int sum = 0, c = n;
        while (sum != 1) {
            sum = 0;
            c = n;

            while (c != 0) {
                System.out.println(c + "       ");
                sum = sum + (c % 10) * (c % 10);
                c = c / 10;
            }

            System.out.println(sum);

            if (memorising.containsKey(sum)) {
                return false;
            } else {
                memorising.put(sum, 1);
            }
            n = sum;
        }

        return true;
    }
}
