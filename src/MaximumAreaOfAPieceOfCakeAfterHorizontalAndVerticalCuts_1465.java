import java.util.Arrays;

public class MaximumAreaOfAPieceOfCakeAfterHorizontalAndVerticalCuts_1465 {

    public int maxArea(int h, int w, int[] horizontalCuts, int[] verticalCuts) {

        int mod = 1_000_000_007;
        int m = horizontalCuts.length;
        int n = verticalCuts.length;

        Arrays.sort(horizontalCuts);
        Arrays.sort(verticalCuts);

        System.out.println(Arrays.toString(horizontalCuts));
        int maxHorizontal = Math.max(horizontalCuts[0], h - horizontalCuts[m-1]);
        int maxVertical = Math.max(verticalCuts[0], w - verticalCuts[n-1]);

        for (int i = 1; i < m ; ++i) {
            maxHorizontal = Math.max(maxHorizontal, horizontalCuts[i] - horizontalCuts[i-1]);
        }

        for (int i = 1; i < n; ++i) {
            maxVertical = Math.max(maxVertical, verticalCuts[i] - verticalCuts[i-1]);
        }

        return (int) (maxHorizontal * maxVertical) % mod;


        /// Accepted all case but upper solution rejected 1 test case

        /*long maximumHorizontal = horizontalCuts[0];
        long maximumVertical = verticalCuts[0];

        for (int i = 0; i < m - 1; i++)
            maximumHorizontal = Math.max(maximumHorizontal, horizontalCuts[i + 1] - horizontalCuts[i]);

        maximumHorizontal = Math.max(maximumHorizontal, h - horizontalCuts[m - 1]);

        for (int i = 0; i < n - 1; i++)
            maximumVertical = Math.max(maximumVertical, verticalCuts[i + 1] - verticalCuts[i]);

        maximumVertical = Math.max(maximumVertical, w - verticalCuts[n - 1]);

        return (int) (maximumHorizontal * maximumVertical % mod);*/
    }
}
