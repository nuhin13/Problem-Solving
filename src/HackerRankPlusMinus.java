import java.util.Formatter;
import java.util.List;

public class HackerRankPlusMinus {
    public static void plusMinus(List<Integer> arr) {
        double pos = 0, neg = 0, zero = 0;
        for (Integer integer : arr) {
            if (integer > 0) pos++;
            else if (integer == 0) zero++;
            else neg++;
        }

        String[] result = new String[3];
        result[0] = new Formatter().format("%.5f", pos/arr.size()).toString();
        result[1] = new Formatter().format("%.5f", neg/arr.size()).toString();
        result[2] = new Formatter().format("%.5f", zero/arr.size()).toString();

        for (String s : result) {
            System.out.println(s);
        }
    }
}
