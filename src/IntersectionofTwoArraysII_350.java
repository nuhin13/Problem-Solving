import java.util.ArrayList;
import java.util.List;

public class IntersectionofTwoArraysII_350 {
    public int[] intersect(int[] nums1, int[] nums2) {
        List<Integer> demo = new ArrayList<>();

        for (int i = 0; i < nums1.length; i++) {
            for (int j = 0; j < nums2.length; j++) {
                if (nums1[i] == nums2[j]) {
                    demo.add(nums2[j]);
                    nums2[j] = -1;
                    break;
                }
            }
        }
        int[] result = new int[demo.size()];
        for (int i = 0; i < demo.size(); i++) {
            result[i] = demo.get(i);
        }

        System.out.println(demo);

        return result;
    }
}
