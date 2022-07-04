public class WiggleSubsequence_376 {
    public int wiggleMaxLength(int[] nums) {
        if(nums.length == 1 || nums.length == 2) {
            if(nums.length == 2 && (nums[1] - nums[0] == 0)){
                return 1;
            }
            return nums.length;
        }

        int flag = 0;
        /*if (nums[1] - nums[0] < 0){
            flag = false;
        }*/
        int count = 1;

        for (int i = 0; i < nums.length-1; i++) {
            int diff = nums[i+1] - nums[i];
            if(diff != 0){
                if(flag == 0){
                    if(diff > 0){
                       flag = 1;
                    }else {
                        flag =-1;
                    }
                }
                if((diff > 0 && flag > 0) || (diff < 0 && flag < 0)){
                    flag = flag * -1;
                    count++;
                }
            }
        }

        System.out.println(count);
        return count;
    }


}
