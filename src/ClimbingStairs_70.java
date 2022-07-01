public class ClimbingStairs_70 {
    /// Time limit Exits
    public int climbStairs(int n) {
        if(n == 1) return 1;
        if(n == 2) return 2;
        if(n == 3) return 3;

        return climbStairs(n-1) + climbStairs(n-2);
    }

    public int climbStairsTwo(int n) {
        if (n == 1) return 1;
        int[] num = new int[n + 1];
        num[0] = 1;
        num[1] = 1;
        for (int i = 2; i <= n; i++) {
            num[i] = num[i - 1] + num[i - 2];
        }

        return num[n];
    }
}
