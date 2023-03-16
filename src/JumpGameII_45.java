public class JumpGameII_45 {
    public int jump(int[] nums) {
        int reach = 0;
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if(i + nums[i] >= nums.length - 1)
                return count+1;

            if( i + nums[i] > reach){
                reach = i + nums[i];
                count++;
            }
        }

        return count;
    }
}
