import java.util.Arrays;
import java.util.Comparator;

public class MinimumNumberofArrowstoBurstBalloons_452 {
    public int findMinArrowShots(int[][] points) {
        Arrays.sort(points, Comparator.comparingInt(a -> a[1]));
        System.out.println(Arrays.deepToString(points));

        if (points.length == 1)
            return 1;

        int arrow = 1;
        for (int i = 0; i < points.length - 1; i++) {
            System.out.println(i);
            int temp = i;

            for (int j = i+1; j < points.length; j++) {
                System.out.println(j);

                System.out.println(points[j][0] + " " + points[temp][1] + " " + points[j][1]);

                if ((points[j][0] <= points[temp][1]) && (points[temp][1] <= points[j][1])) {
                    i++;
                } else {
                    arrow++;
                    break;
                }
            }
        }
        System.out.println(arrow);

        return arrow;
    }
}
