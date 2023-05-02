public class MinimizeMaximumofArray_2439 {
    public int minimizeArrayValue(int[] nums) {
        int total= nums[0];
        int res = nums[0];

        for (int i = 1; i < nums.length; i++) {
            total = total + nums[i];
            res = (int) Math.max(res, Math.ceil(total/(i+1)));
        }
        return res;
    }
}
