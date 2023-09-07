public class MaximumAverageSubarrayI_643 {
    public double findMaxAverage(int[] nums, int k) {
        double sum = 0;

        for (int i = 0; i < k; i++) {
            sum = sum + nums[i];
        }
        double avrg = sum/k;

        for (int i = k; i < nums.length; i++) {
            sum = sum + nums[i] - nums[i-k];
            avrg = Math.max(sum/k, avrg);
        }

        return avrg;
    }
}
