import java.util.Arrays;

public class MergeSortedArray_88 {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        if(m == 0)
            nums1 = nums2;

        for (int i = m ; i < nums1.length; i++) {
            nums1[i] = Integer.MAX_VALUE;
        }

        System.out.println(Arrays.toString(nums1));

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < nums1.length; j++) {
                System.out.println( i + " "+nums2[i] + " " + nums1[j] + " " + j);

                if(nums1[j] == Integer.MAX_VALUE){
                    nums1[j] = nums2[i];
                    break;
                }

                if (nums2[i] < nums1[j]){
                    int temp = nums1[j];
                    nums1[j] = nums2[i];
                    nums2[i] = temp;
                }
            }
        }

        System.out.println(Arrays.toString(nums1));
    }
}
