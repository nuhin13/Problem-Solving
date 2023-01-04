import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class LongestConsecutiveSequence_128 {

    /// First sort the array + find the longest sequence
    /// Complexity O(n(log(n)))
    public int longestConsecutive(int[] nums) {
        if(nums.length < 1){
            return nums.length;
        }
        Arrays.sort(nums);

        int[] longCount = new int[nums.length];
        int position = 0;

        for (int i = 0; i < nums.length -1; i++) {
            if ((nums[i] + 1) == nums[i + 1]) {
                longCount[position] += 1;
            } else if ((nums[i]) == nums[i + 1]) {
                continue;
            } else {
                position +=1;
            }
        }

        int max = longCount[0];
        for (int i = 1; i < longCount.length; i++)
            if (longCount[i] > max)
                max = longCount[i];



        /// In Another Way
        /// No extra Space included

        /*int longest = 0;
        int current_longest = 0;

        for (int i = 0; i < nums.length -1; i++) {
            if ((nums[i] + 1) == nums[i + 1]) {
                current_longest += 1;
            } else if ((nums[i]) == nums[i + 1]) {
                continue;
            } else {
                longest = Math.max(longest, current_longest);
                current_longest =1;
            }
        }
        return Math.max(longest, current_longest);*/


        System.out.println(Arrays.toString(nums) + Arrays.toString(longCount) + max);
        return 1;
    }

    /// With O(N) complexity
    public int longestConsecutive_1(int[] nums) {

        Set<Integer> map = new HashSet<>();
        for (int num:nums) {
            map.add(num);
        }

        int longestStreak = 0;

        System.out.println(Arrays.toString(map.toArray()));

        for (int num:map) {
           // System.out.println(num - 1);
            if(!map.contains(num - 1)){
             //   System.out.println(num -1);
                int currentNum = num;
                int currentStreak = 1;

                while (map.contains(currentNum+1)) {
                    currentNum += 1;
                    currentStreak += 1;
                }

                longestStreak = Math.max(longestStreak, currentStreak);
            }
        }

        System.out.println(longestStreak);

        return 1;
    }
}
