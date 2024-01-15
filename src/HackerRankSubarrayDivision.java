import java.util.List;

public class HackerRankSubarrayDivision {

    public static int birthday(List<Integer> s, int d, int m) {
        int j = m - 1, count = 0;

        if(s.size() == 1)
            return 1;

        for (int i = 0; i <= s.size(); i++) {
            if (j > s.size() - 1)
                break;

            int sum = s.get(i);

            for(int k = i+1; k <= j; k++){
                sum = sum + s.get(k);
            }

            if (sum == d) count++;

            System.out.println(sum);

            j++;
        }
        System.out.println(count);

        return count;


    }

}
