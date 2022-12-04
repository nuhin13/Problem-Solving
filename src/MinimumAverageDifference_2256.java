import java.util.Arrays;

public class MinimumAverageDifference_2256 {
    public int minimumAverageDifference(int[] nums) {

        if (nums.length == 0) return 0;
        if (nums.length == 1) return nums[0];
        if (nums.length == 2) {
            return nums[1] - nums[0];
        }

        int[] diff = new int[nums.length];
        int sum1 = 0;

        for (int i = 0; i < nums.length; i++) {
            sum1 = sum1 + nums[i];
            int sum2 = 0;
            int item2 = 0;
            for (int j = i + 1; j < nums.length; j++) {
                sum2 = sum2 + nums[j];
                item2++;
            }

            System.out.println("sum1 " + sum1);
            System.out.println("sum2 " + sum2);
            System.out.println("item1 " + item2);

            if(item2 == 0) item2++;
            int diff2 = ((sum1 / (i + 1) - (sum2 / item2)));
            System.out.println("diff2 " + diff2);

            if (diff2 < 0) diff2 = diff2 * -1;
            System.out.println("diff2 " + diff2);


            diff[i] = diff2;
        }

        double average = 0;
        for (int j : diff) average += j;

        System.out.println(average + " " + diff.length);
        average = Math.ceil(average/diff.length);

        System.out.println(Arrays.toString(diff));
        System.out.println(average);

        return 1;
    }
}
