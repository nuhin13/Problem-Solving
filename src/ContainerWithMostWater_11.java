public class ContainerWithMostWater_11 {
    public int maxArea(int[] height) {
        int max = 0, left = 0, right = height.length - 1;
        while (left < right){
            int low = Math.min(height[left], height[right]);
            max = Math.max(max, low * (right - left));

            if(height[left] < height[right])
                left++;
            else right--;
        }
        
        return max;
    }
}
