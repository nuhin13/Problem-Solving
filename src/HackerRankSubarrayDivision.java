import java.util.List;

public class HackerRankSubarrayDivision {

    // Not solved
    public static int birthday(List<Integer> s, int d, int m) {
        int j = m - 1, count = 0;

        if(s.size() == 1)
            return 1;

        for (int i = 0; i <= s.size(); i++) {
            if (i == s.size() - 1)
                break;

            System.out.println((s.get(i) + s.get(j)));

            if ((s.get(i) + s.get(j)) == d) count++;
            j++;
        }
        System.out.println(count);

        return count;


    }
}
