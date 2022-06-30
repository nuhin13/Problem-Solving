import java.util.Arrays;

public class MinimumMovesToEqualArrayElementsII_462 {

    public int minMoves2(int[] nums) {
        Arrays.sort(nums);

        int count = 0;
        int mid = nums[nums.length/2];

        for (int num: nums){
            count = count + Math.abs(mid - num);
        }

        System.out.println(count);
        return count;
    }

    public int minMoves2Testing(int[] nums) {

        Arrays.sort(nums);
        int count = 0;
        int mid = nums[nums.length/2];
        for (int num: nums)
            count = count + Math.abs(mid - num);


        /*int midle = nums.length/2;

        int max = largest(nums);
        int min = minimum(nums);
        int target = (max+min)/2;

        System.out.println(max+ " " + min + " " + target + " ");
        int count = 0;
        for (int num : nums) {
            count = count + Math.abs(num - target);
        }*/
        System.out.println(count);

        return count;
    }

    private int largest(int[] nums) {
        int max = nums[0];
        for (int i = 1; i < nums.length; i++)
            if (nums[i] > max)
                max = nums[i];

        return max;
    }

    private int minimum(int[] nums) {
        int min = nums[0];
        for (int i = 1; i < nums.length; i++)
            if (nums[i] < min)
                min = nums[i];

        return min;
    }
}
